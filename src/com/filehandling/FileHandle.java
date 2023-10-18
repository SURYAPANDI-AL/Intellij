package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandle {
    //FileReader, FileWriter, BufferReader, BufferWriter, PrintWriter.

    public static void main(String[] args) throws IOException {
        //basic file creating
        File file = new File("MyFrictional1.txt");

       // if(file.exists()){
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("hi");
            fileWriter.flush();
            fileWriter.close();
       // }
        FileReader fileReader = new FileReader(file);
        int i=fileReader.read();
        while(i!=-1){
            System.out.print((char)i);
            i=fileReader.read();
        }
        fileReader.close();
    }
}
