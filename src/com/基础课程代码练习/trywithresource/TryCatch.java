package com.基础课程代码练习.trywithresource;

import java.io.*;
import java.util.Scanner;

/**
 * @author Doraemon
 * @date 2022/5/11 5:22 下午
 * @version 1.0
 */
public class TryCatch {
    public static void main(String[] args) {
        //读取文本文件的内容
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(new File("/Users/yimeng/Desktop/test.sh"));
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (scanner != null) {
//                scanner.close();
//            }
//        }

        tryResource();
    }

    /**
     * try with resource
     */


    public static void tryResource() {
        try (Scanner scanner = new Scanner(new File("/Users/yimeng/Desktop/test.sh"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

    }

    public static void tryResourceMulti() {
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("test.txt")));
             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("out.txt")))) {
            int b;
            while ((b = bin.read()) != -1) {
                bout.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
