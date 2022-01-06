package com.day01.demo1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class FileTest {

    public static File[] getLocalFiles(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    // 重载方法
    public static File[] getLocalFiles(String path, final String regex) {
        return getLocalFiles(new File(path), regex);
    }

    public static void main(String[] args) {
        String dir = "d:";
        File[] files = FileTest.getLocalFiles(dir, "\\d*\\.txt");
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
