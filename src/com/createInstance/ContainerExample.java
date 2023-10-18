package com.createInstance;

public class ContainerExample {
    public static void main(String[] args) {
        Container container = new Container(10);
        for(int i=1;i<=100;i++){
            MyObject object =container.getObject();
            System.out.println(object.getValue());
            object.setValue(i);
            object.method("method called");
            container.closeConnection(object);
        }
    }
}
