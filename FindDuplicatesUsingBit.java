/*
 * Code to find if a string has unique characters using bit shift
 *  
 */
package javaapplication;

/**
 *
 * @author vishal
 */
public class FindDuplicatesUsingBit {

    public static void main(String args[]) {
       System.out.println(checkUnique("xyzz"));
    }
    public static boolean checkUnique(String str)
    {
        int check = 0;
        for(int i=0;i<str.length();i++)
        {
            int val = str.charAt(i)-'a';
            if((check & (1<<val)) >0 )
                return false;
            
            check |= (1<<val);
        }
        return true;
    }
}
