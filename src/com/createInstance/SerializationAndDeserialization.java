package com.createInstance;

import java.io.*;

public class SerializationAndDeserialization {

    public static void main(String[] args) {

        /*MyClass myClass = new MyClass();
        ObjectOutputStream objectOutputStream;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
            objectOutputStream.writeObject(myClass);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        ObjectInputStream objectInputStream;
        MyClass myClass1;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("file.txt"));
            myClass1 = (MyClass) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        myClass1.method();*/

        MyClass myClass = new MyClass();
        myClass.method();
        myClass.setVar(50);
        MyClass myClass1;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
            objectOutputStream.writeObject(myClass);
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.txt"));
            myClass1= (MyClass)objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        myClass1.method();
        myClass.setVar(20);
        myClass.method();
        myClass1.method();
    }
}
