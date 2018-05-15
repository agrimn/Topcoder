package com.foxzing.topcoder.division2.level2;

import java.util.Arrays;
import java.util.Collections;

/*
    You are given two int[]s L and R, each of length n.

    Find the number of strictly increasing sequences of integers A[0] < A[1] < ... < A[n-1] such that L[i] ≤ A[i] ≤ R[i]
    for every i.

    Return this number modulo 998244353.
 */
public class IncreasingSequencesEasy {

    public IncreasingSequencesEasy() {

    }
    int [][] N;

    public int count(int[] L, int[] R) {
        //initialize the size of the array
        N = new int[R[0]-L[0]+1][L.length];
        int max = max(L);
        int min = min(R);
        System.out.println("asdas "+ max+" asdasd " +min);
        for(int k = 0 ; k <= L.length ; k++) {
            for(int i = 0; i <= R[k]-L[k]; i++) {
                if(k == L.length-1) {
                    N[i - L[k]][k] = i;
                } else if( i < L[k+1]) {
                    N[i - L[k]][k] = i;
                }
            }
        }
        printArray(N);
        return 1;
    }

    public void printArray(int[][] a) {
        for(int[] l:a) {
            for(int i:l) {
                System.out.print(i+",");
            }
            System.out.println();
        }
    }

    public int max(int[] A) {
        int max = A[0];
        for(int a:A){
            if( a> max)
                max = a;
        }
        return max;
    }

    public int min(int[] A) {
        int min = A[0];
        for(int a:A){
            if( a< min)
                min = a;
        }
        return min;
    }
}
