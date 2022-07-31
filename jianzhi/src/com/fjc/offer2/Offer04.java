package com.fjc.offer2;

public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrit, int target) {
        int i = matrit.length - 1, j = 0;
        while (i >=0 && j < matrit[0].length) {
            if (matrit[i][j] > target) i--;
            else if(matrit[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}
