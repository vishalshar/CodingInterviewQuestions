/**
 *
 * Given a desired weight, n , how many plate combinations are there for n weight using 
 * 1lb,4lb,9lb,24lb ? There are 322 weight plate combinations for 100 lbs.
 * 
 * Task is, given a number n find out how many ways there are to combine plates to reach 
 * EXACTLY n using 1 , 4 , 9, 24 lb plates.

 * For example, for 100 of the combination is 2*24 + 5*4 + 3*9 + 5*1.
 * A plate may or may not be in the solution.
 * 
 *
 */
package javaapplication;

import java.math.BigInteger;

/**
 *
 * @author vishal
 */
public class iFit {

    public static void main(String args[]) {
        int arr[] = {1, 4, 9, 24};
        int sumi = 0, sumj = 0, sumk = 0, sumz = 0;
        int count = 0;

// max is n 
// change max to 100 : result will be 322 
// for 1050 : 235620 
        int max = 1050;

        for (int i = 0; i < arr.length; i++) {
            sumi = arr[i];
            for (; sumi <= max; sumi += arr[i]) {
                if (sumi == max) {
                    count++;
                    break;
                }

                for (int j = i + 1; j < arr.length; j++) {
                    sumj = arr[j];
                    for (; (sumi + sumj) <= max; sumj += arr[j]) {
                        if ((sumi + sumj) == max) {
                            count++;
                            break;
                        }

                        for (int k = j + 1; k < arr.length; k++) {
                            sumk = arr[k];
                            for (; (sumi + sumj + sumk) <= max; sumk += arr[k]) {
                                if ((sumi + sumj + sumk) == max) {
                                    count++;
                                    break;
                                }

                                for (int z = k + 1; z < arr.length; z++) {
                                    sumz = arr[z];
                                    for (; (sumi + sumj + sumk + sumz) <= max; sumz += arr[z]) {
                                        if ((sumi + sumj + sumk + sumz) == max) {
                                            count++;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println(count);
    }
}
