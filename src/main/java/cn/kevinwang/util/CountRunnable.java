package cn.kevinwang.util;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * @author wang
 * @create 2024-02-16-14:09
 */
public class CountRunnable<T> implements Callable<T> {
    Supplier<T> supplier;

    public CountRunnable(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override
    public T call() throws Exception {
        return supplier.get();
    }
}
