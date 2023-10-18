package com.collection;

import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=10;i++){
            System.out.println("The element being pushed : "+stack.push(i));
            System.out.println("The element being pushed : "+stack.push(null));
        }
        for(int i=1;i<=10;i++){
            System.out.println("The element being pop : "+stack.pop());
        }

        System.out.println("check the stack empty or not : "+stack.empty()+" "+stack.size());

        for(int i=1;i<=10;i++){
            System.out.println("The element being pushed : "+stack.push(i+10));
        }

        for(int i=1;i<=10;i++){
            System.out.println("The element being searched : "+(i+10)+" "+ stack.search(i+10) + " peek on stack "+stack.peek() );
        }
        while(!stack.isEmpty()){
            System.out.println("The element being pop : "+stack.pop());
        }
    }
}
