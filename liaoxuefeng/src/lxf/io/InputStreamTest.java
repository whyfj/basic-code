package lxf.io;

import java.io.*;
import java.util.Arrays;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        readFile1();
    }
    public static void readFile() throws IOException {
        // 创建一个FileInputStream对象:
        InputStream input = new FileInputStream("src/lxf/io/readme.txt");
        for (;;) {
            int n = input.read(); // 反复调用read()方法，直到返回-1
            if (n == -1) {
                break;
            }
            System.out.println(n); // 打印byte的值
        }
        input.close(); // 关闭流
    }


    public static void readFile1() throws IOException {
        try (InputStream input = new FileInputStream("src/lxf/io/readme.txt")) {
            // 定义1000个字节大小的缓冲区:
            byte[] buffer = new byte[1000];
            int n;
            while ((n = input.read(buffer,3,10)) != -1) { // 读取到缓冲区
                System.out.println("read " + n + " bytes.");
                System.out.println(Arrays.toString(buffer));
            }
        }
    }

    public static void writeFile() throws IOException {
        OutputStream output = new FileOutputStream("src/lxf/io/readme.txt", true);
        output.write(72); // H
        output.write(101); // e
        output.write(108); // l
        output.write(108); // l
        output.write(111); // o
        output.close();
    }
}
