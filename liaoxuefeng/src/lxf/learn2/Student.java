package lxf.learn2;

// this 的用法
public class Student{
    private String name;
    private int age;
    public Student(){}
    public Student(String name,int age){
        this();
        this.setName(name);
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
}