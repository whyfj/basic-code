package com.kuang.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//反射操作注解
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.kuang.reflection.Student2");
        Annotation[] annotation = c1.getAnnotations();
        for (Annotation annotation1 : annotation) {
            System.out.println(annotation1);
        }

        //获得注解的value的值
        Tablekuang tablekuang = (Tablekuang)c1.getAnnotation(Tablekuang.class);
        String value = tablekuang.value();
        System.out.println(value);

        //获得类的指定注解
        Field f = c1.getDeclaredField("id");
        Fieldkuang annotation1 = f.getAnnotation(Fieldkuang.class);
        System.out.println(annotation1.columnName());
        System.out.println(annotation1.type());
        System.out.println(annotation1.length());
    }
}

@Tablekuang("db_student")
class Student2 {
    @Fieldkuang(columnName = "db_id",type = "int",length = 10)
    private int id;
    @Fieldkuang(columnName = "db_id",type = "int",length = 10)
    private int age;
    @Fieldkuang(columnName = "db_id",type = "varchar",length = 10)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablekuang{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldkuang{
    String columnName();
    String type();
    int length();
}