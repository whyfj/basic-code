package com.bishi.io;

import java.util.*;
//public class Mainn {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t>0){
//            int a = sc.nextInt();
//            if(400<=a && a<=599){
//                System.out.println("Yes");
//            }else{
//                System.out.println("No");
//            }
//            t--;
//        }
//        sc.close();
//    }
//}

//public class Mainn {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        HashMap<Integer, Integer> Map = new HashMap<>();
//        ArrayList<Integer> res = new ArrayList<>();
//        while (t>0){
//            int a = sc.nextInt();
//            int ans = 0;
//            for (int i=1; i<=a; i++){
//                ans += sum(i , Map);
//            }
//            res.add(ans);
//            t--;
//        }
//        for (int i: res){
//            System.out.println(i);
//        }
//        sc.close();
//    }
//
//    public static int sum(int a, HashMap<Integer, Integer> map) {
//        if (map.containsKey(a)){
//            return map.get(a);
//        }
//        int t = 1;
//        while (a > 0){
//            if ((a & 1) == 1){
//                int temp = (int) (Math.pow(2,t) -1);
//                if (!map.containsKey(a)) map.put(a,temp);
//                return temp;
//            }else {
//                a = a/2;
//                t++;
//            }
//        }
//        return 0;
//    }
//}

public class Mainn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < t; i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> temp = new ArrayList<>(arr);
        Collections.sort(temp);
        int min = temp.get(0);
        int max = temp.get(t-1);
        if (min == max) {
            System.out.println(2);
            return;
        }
        int minIndex = arr.indexOf(min) + 1;
        int maxIndex = arr.indexOf(max) + 1;
        int[] res = new int[3];
        res[0] = Math.max(maxIndex, minIndex);
        res[1] = Math.max(t-maxIndex+1, t-minIndex+1);
        int x = maxIndex > minIndex? maxIndex-minIndex:minIndex-maxIndex;
        res[2] = t - x + 1;
        Arrays.sort(res);
        System.out.println(res[0]);
    }
}
