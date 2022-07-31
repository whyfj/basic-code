package lxf.test;

public class test1 {
    public static void main(String[] args) {
        user user = new user(18, "fjc");
        System.out.println(user);
    }
}

class user{
    int age;
    String name;

    public user() {
    }

    public user(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}