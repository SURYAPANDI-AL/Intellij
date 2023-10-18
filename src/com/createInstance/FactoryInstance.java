package com.createInstance;

public class FactoryInstance {
    public static void main(String[] args) {
        Bank bankHDFC =  FactoryClass.createNewFactoryBank("HDFC");
        Bank bankICICI = FactoryClass.createNewFactoryBank("ICICI");
        int minimumBalanceICICI=bankICICI.minimumBalance();
        int minimumBalanceHDFC=bankHDFC.minimumBalance();
        System.out.println(minimumBalanceHDFC);
        System.out.println(minimumBalanceICICI);
    }
}
