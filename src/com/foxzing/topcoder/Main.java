package com.foxzing.topcoder;

import com.foxzing.topcoder.division2.level2.IncreasingSequencesEasy;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] a = {1, 3, 1, 4};
//        int[] b = {6, 5, 4, 6};
        int[] a = {1,3,1};
        int[] b = {6,5,4};
//        int[] a = {1};
//        int[] b = {6};
        new IncreasingSequencesEasy().count(a,b);
    }
}
