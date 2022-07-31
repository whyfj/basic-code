package lxf.learn;

public class switch_t {
    public static void main(String[] args) {
        int option = 99;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }

        int option1 = 2;
        switch (option1) {
            case 1:
                System.out.println("Selected 1");
                break;
//          如果有几个case语句执行的是同一组语句块，可以这么写：
            case 2:
            case 3:
                System.out.println("Selected 2, 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }
}
