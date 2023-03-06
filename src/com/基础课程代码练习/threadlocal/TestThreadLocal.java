package com.基础课程代码练习.threadlocal;

import com.面试xmind练习代码.TestLock;

import java.io.PrintWriter;
import java.util.stream.IntStream;

/**
 * @author Doraemon
 * @date 2022/6/5 8:40 下午
 * @version 1.0
 */
public class TestThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();

        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            local.set(Thread.currentThread().getName() + ":" + i);
            System.out.println("线程：" + Thread.currentThread().getName() + ",local:" + local.get());
        }).start());
    }
}
