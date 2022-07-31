package com.kuang.reflection;

public class Test02 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("com.kuang.reflection.User");
        System.out.println(c1);
        User user = new User();
        Class c2 = user.getClass();
        Class c3 = c2.getSuperclass();
        System.out.println(c3);
    }
}

class User{
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}