package com;

class Parent{
    private int asset ;
    Parent(){
        this.addAsset(500);
    }

    public int getAsset() {
        return asset;
    }

    public void addAsset(int asset) {
        this.asset += asset;
    }
}
class Child extends Parent{
    private int asset;
    Child(){
        this.addAsset(super.getAsset() +500);
    }

    @Override
    public int getAsset() {
        return asset;
    }

    @Override
    public void addAsset(int asset) {
        this.asset += asset;
    }
}

class GrandChild extends Child{
    private int asset;
    GrandChild(){
        this.addAsset(super.getAsset() +500);
    }

    @Override
    public int getAsset() {
        return asset;
    }

    @Override
    public void addAsset(int asset) {
        this.asset += asset;
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent child = new Child();
        Parent grandChild = new GrandChild();

        System.out.println("parent asset -> "+parent.getAsset());
        System.out.println("child asset -> "+child.getAsset());
        System.out.println("grand child asset -> "+grandChild.getAsset());
        System.out.println();

        parent.addAsset(200);

        System.out.println("parent asset -> "+parent.getAsset());
        System.out.println("child asset -> "+child.getAsset());
        System.out.println("grand child asset -> "+grandChild.getAsset());
        System.out.println();

        child.addAsset(200);

        System.out.println("parent asset -> "+parent.getAsset());
        System.out.println("child asset -> "+child.getAsset());
        System.out.println("grand child asset -> "+grandChild.getAsset());
        System.out.println();

    }
}
