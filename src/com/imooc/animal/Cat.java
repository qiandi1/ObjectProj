//【1】更新-Cat类
package com.imooc.animal;
public class Cat {
    String name;
    int month;
    double weight;
    String species;

    public void run(){
        System.out.println("小猫快跑");
    }
    public void run(String name){
        System.out.println(name+"快跑");
    }
    public void eat(){
        System.out.println("小猫吃鱼");
    }
}
