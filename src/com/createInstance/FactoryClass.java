package com.createInstance;

public class FactoryClass {
    public static Bank createNewFactoryBank(String name){
        if(name.equals("HDFC")){
            return new HDFC();
        }else if(name.equals("ICICI")) {
            return new ICICI();
        }else{
            throw new IllegalArgumentException();
        }
    }

}

interface Bank{
    int minimumBalance();
}

class HDFC implements Bank{

    @Override
    public int minimumBalance() {
        return 1000;
    }
}

class ICICI implements Bank{

    @Override
    public int minimumBalance() {
        return 5000;
    }
}