package com.kuang.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.kuang.reflection.User");
        User user = new User();
        c1 = user.getClass();
        //获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        //获得类的属性
        Field[] fields = c1.getFields(); //只能找到public属性

        fields = c1.getDeclaredFields(); //能找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        //获得指定属性
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("===================");
        Method[] methods = c1.getMethods(); //获得本类及其父类的所有方法
        for (Method method: methods) {
            System.out.println(method);
        }
        System.out.println("===================");
        methods = c1.getDeclaredMethods(); //获得本类的所有方法
        for (Method method: methods) {
            System.out.println(method);
        }

        //获得在指定方法
        //重载
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得构造器
        System.out.println("===================");
        //获得public
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        //获得全部
        constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //获得指定的构造器
       Constructor declaredConstructors = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定：" + declaredConstructors);
    }
}
