package com.fjc.pattern.factory.simple;

public class CarFactory {
    //    方法1
    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new Wuling();
        }else if (car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }
    //    方法2
    public static Car getWuling(){
        return new Wuling();
    }
    public static Car getTesla(){
        return new Tesla();
    }
}
