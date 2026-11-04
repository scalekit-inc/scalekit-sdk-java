package com.scalekit.models;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Lazily iterates the items of a {@link Page} and every page after it.
 *
 * <p>The next page is fetched only when iteration has consumed the current one, so breaking out
 * of a loop or limiting a stream stops further requests. A failed fetch surfaces as an
 * {@link com.scalekit.exceptions.APIException} from {@code hasNext()} or {@code next()}.
 *
 * <pre>{@code
 * List<String> ids = client.connectedAccounts().list(params).autoPager().stream()
 *         .map(ConnectedAccount::id)
 *         .limit(500)
 *         .collect(Collectors.toList());
 * }</pre>
 *
 * <p>The auto-pager is immutable; each iterator it returns is for use by one thread.
 *
 * @param <T> the item type
 * @since 2.6.0
 */
public final class AutoPager<T> implements Iterable<T> {

    private final Page<T> first;

    AutoPager(Page<T> first) {
        this.first = first;
    }

    /**
     * Returns an iterator that starts at the first page and fetches later pages on demand.
     *
     * @return a new iterator
     */
    @Override
    public Iterator<T> iterator() {
        return new PagingIterator<>(first);
    }

    /**
     * Returns a sequential stream over the items, fetching pages on demand.
     *
     * @return a new stream
     */
    public Stream<T> stream() {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator(), Spliterator.ORDERED), false);
    }

    private static final class PagingIterator<T> implements Iterator<T> {
        private Page<T> page;
        private Iterator<T> current;
        private String tokenUsedForPage;

        PagingIterator(Page<T> first) {
            this.page = first;
            this.current = first.items().iterator();
        }

        @Override
        public boolean hasNext() {
            while (!current.hasNext()) {
                if (!page.hasNextPage()) {
                    return false;
                }
                String token = page.nextPageToken().orElse(null);
                // A server that hands back the cursor it was given makes no progress; stop rather
                // than loop forever.
                if (token != null && token.equals(tokenUsedForPage)) {
                    return false;
                }
                page = page.nextPage();
                tokenUsedForPage = token;
                current = page.items().iterator();
            }
            return true;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return current.next();
        }
    }
}
