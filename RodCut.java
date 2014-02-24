/*
* Given a rod of length n inches and an array of prices that contains prices of 
* all pieces of size smaller than n. Determine the maximum value obtainable by 
* cutting up the rod and selling the pieces. For example, if length of the rod 
* is 8 and the values of different pieces are given as following, then the 
* maximum obtainable value is 22
* 
 */
package javaapplication.DynamicProgramming;

/**
 *
 * @author vishal sharma
 */
public class RodCut 
{
    public static void main(String args[])
    {
        //int p[] = {0,1,3,3,5,8,10,8,3,10,10};
        int p[]={0, 1, 5, 8, 9, 10, 17, 17, 20};
        
        System.out.println(RodCut.minRodCut(p,(p.length)));
    }
    public static int minRodCut(int p[],int n)
    {
        int r[] = new int[n+1];
        r[0] = 0;
        
        for(int i=1;i<=n;++i)
        {
            int max = r[i];
            for(int j=1;j<i;++j)
            {
                 max = Math.max(max,p[j]+r[i-j]);
            }
            r[i] = max;
        }

        return r[n];
    }
}
