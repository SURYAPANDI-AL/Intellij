package com.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadMyFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the file location :");
        String file = scanner.next();
        file = file.replace("\\","\\\\");
        System.out.println(file);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while(line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
