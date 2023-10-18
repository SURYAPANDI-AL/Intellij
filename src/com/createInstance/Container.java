package com.createInstance;

import java.util.LinkedList;
import java.util.Queue;
class MyObject{
    private int value = 10;
    public void method(String string){
        System.out.print(value);
        System.out.println(" "+string);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Container {
    private Queue<MyObject> queue = new LinkedList<>();
    public Container(int initialCapacity){
        for(int i=0;i<initialCapacity;i++){
            queue.add(new MyObject());
        }
    }

    public MyObject getObject(){
        if(queue.isEmpty()){
            return new MyObject();
        }else{
            return queue.poll();
        }
    }
    public  void closeConnection(MyObject object){
        queue.add(object);
    }

}
