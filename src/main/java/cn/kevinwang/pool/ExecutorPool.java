package cn.kevinwang.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wang
 * @create 2024-02-16-14:06
 */
public class ExecutorPool {
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
}
