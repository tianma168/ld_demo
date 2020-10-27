package com.fastshow.scim2.util;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.common.io.Flushables;
import java.io.*;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileHandler {

    private static final String FILE_NAME = "/usr/java/apache-tomcat-9.0.4 2/webapps/userinfo.txt";

    public static void writeMethod(String userInfo) {
        try {
            File file = new File(FILE_NAME);
            Files.append(userInfo,file, Charsets.UTF_8);
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }
    }

    public static List<String> readMethod() {
        List<String> result = new ArrayList<>();
        try {
            List<String> lines = Files.readLines(new File(FILE_NAME), Charset.defaultCharset());
            for (String line : lines) {
                result.add(line);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}