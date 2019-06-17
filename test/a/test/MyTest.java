package a.test;

import java.io.File;
import java.io.IOException;
import java.util.ServiceLoader;

public class MyTest {

    public static void main(String[] args) throws IOException {
//        printSystemProperty("user.dir");//当前工作目录
//        printSystemProperty("user.home");//用户的主目录
//        printSystemProperty("file.separator");//文件分隔符（在 UNIX 系统中是“/”）


        File directory = new File("");//设定为当前文件夹
        System.out.println(directory.getPath());
        System.out.println(directory.getAbsolutePath());
        System.out.println(directory.getCanonicalPath());
        System.out.println(directory.getCanonicalFile());

        System.out.println("-------------------------------");
        directory = new File("../");//设定为当前文件夹
        System.out.println(directory.getPath());
        System.out.println(directory.getAbsolutePath());
        System.out.println(directory.getCanonicalPath());
        System.out.println(directory.getCanonicalFile());


        ServiceLoader<MyTest> sl = ServiceLoader.load(MyTest.class);
    }

    private static void printSystemProperty(String property) {
        System.out.println(System.getProperty(property));
    }

}
