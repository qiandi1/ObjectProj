//【1】更新-测试类CatTest
//【2】
//【3】
package com.imooc.animal;
public class CatTest {
    public static void main(String[] args) {
        Cat one=new Cat();
        Cat two=new Cat();
        one.eat();
        one.run();
        one.name = "花花";
        one.month = 2;
        one.weight = 1000;
        one.species = "英国短毛猫";
        two.name="凡凡";
        two.month = 1;
        two.weight=800;
        two.species = "中华田园猫";
        System.out.println("昵称：" + one.name);
        System.out.println("年龄：" + one.month);
        System.out.println("体重：" + one.weight);
        System.out.println("品种：" + one.species);
        System.out.println("---------------------------");
        System.out.println("昵称：" + two.name);
        System.out.println("年龄：" + two.month);
        System.out.println("体重：" + two.weight);
        System.out.println("品种：" + two.species);
        //one.run(one.name);
    }
}
