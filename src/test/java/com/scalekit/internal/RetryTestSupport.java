package com.scalekit.internal;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/** Lets tests in other packages skip the real retry backoff. Test code only. */
public final class RetryTestSupport {

    private static final List<Long> SLEEPS = new CopyOnWriteArrayList<>();

    private RetryTestSupport() {
    }

    public static List<Long> recordSleepsInsteadOfSleeping() {
        SLEEPS.clear();
        RetryExecuter.sleeper = SLEEPS::add;
        return SLEEPS;
    }

    public static void restoreRealSleeper() {
        RetryExecuter.sleeper = ms -> {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException interrupted) {
                Thread.currentThread().interrupt();
            }
        };
    }
}
