package com.bishi.io;


import java.util.Scanner;

public class Rongyao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] lines_before = new String[n];
        String[] lines_after = new String[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            lines_before[i] = sc.nextLine();
        }
        for(int j = 0; j < n; j++){
            lines_after[j] = sc.nextLine();
        }

        int result = 0;
        for (int i = 0; i<lines_after.length;i++){
            String line1 = lines_before[i];
            String line2 = lines_after[i];
            result += minDistance(line1,line2);
        }
        System.out.println(result);
    }

    private static int minDistance(String line1, String line2) {
        int n = line1.length();
        int m = line2.length();
        if (n*m == 0){
            return n + m;
        }
        int[][] D = new int[n+1][m+1];
        for (int i=0; i < n+1; i++){
            D[i][0] = i;
        }
        for (int i=0; i < m+1; i++){
            D[0][i] = i;
        }
        for (int i = 1; i<n+1; i++){

            for (int j = 1; j < m+1; j++){
               int left =  D[i-1][j] + 1;
               int down =  D[i][j-1] + 1;
               int left_down = D[i-1][j-1];
               if (line1.charAt(i-1) != line2.charAt(j-1)){
                   left_down +=1;
               }
               D[i][j] = Math.min(Math.min(left,down),left_down);
            }

        }
        return D[n][m];
    }

}