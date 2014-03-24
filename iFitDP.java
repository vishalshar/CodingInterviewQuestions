/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.DynamicProgramming;

/**
 *
 * @author vishal
 */
public class iFitDP {

public static void main(String args[])
    {
        int data[]= {0,1,4,9,24};
        int m = 100;
        knapsack(data,m);
    }

public static void knapsack(int data[],int m)
    {
        int p [][] = new int [data.length][m+1];
        
        p[0][0]=1;
       
        for(int i=1;i<data.length;i++)
            p[i][0]=1;

        for(int i=1;i<data.length;i++)
        {
            for(int k=1;k<=m;k++)
            {
                if((k-data[i])>= 0 )
                {
                    //p[i][k] = Math.max(p[i-1][k], p[i-1][k-data[i]]);
                    p[i][k] = (p[i-1][k]+ p[i][k-data[i]]);
                }
                else
                {
                    p[i][k]=p[i-1][k];
                }
            }
        }
        
        //Prints the table
        System.out.print("  ");
        for(int i=0;i<=m;i++)
            System.out.print(i+" ");
        System.out.println();
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+" ");
            for(int j=0;j<=m;j++)
                System.out.print(p[i][j]+" ");
            System.out.println();
        }
    }
}
