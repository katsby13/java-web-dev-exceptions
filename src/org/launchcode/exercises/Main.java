package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Divide(8,2);
        Divide(8,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Katlyn", null);

        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
        System.out.println(CheckFileExtension(studentFiles.get("Katlyn")));
    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Y cannot equal zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            int sum = x/y;
            System.out.println(sum);
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        int result = 0;
        if (fileName == null) {
            try {
                throw new NullPointerException("File can't equal null!");
            } catch (NullPointerException e) {
                e.printStackTrace();
                result = -1;}
        } else if (fileName == "") {
            try {
                throw new Exception("Empty string present");
            } catch (Exception e) {
                e.printStackTrace();
                result = -1;}
        } else if (fileName.endsWith(".java")) {
                result = 1;
            }
        return result;
    }
}
