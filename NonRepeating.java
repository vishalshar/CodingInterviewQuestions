/*
 * Given a string 'aabbcdccefff', find the first Non-duplicate character i.e. 'd'
 */
package javaapplication;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author vishal
 */
public class NonRepeating 
{
    public static void main(String args[])
    {
        findFirstNonRepeatingCharacter("aaaadbbbbcffeedssffhhhh");
        findFirstNonRepeatingCharacterUsingHashTable("aaaadbbbbcffeedssffhhhh");
    }
    /**
     * Complexity O(n^2)
     * */
    public static void findFirstNonRepeatingCharacter(String str)
    {
        if(str==null)
            return;
        
        int count = 0;
        int i=0,j=0;
        for( i=0;i<str.length();i++)
        {
            count = 0;
            for( j=0;j<str.length();j++)
            {
                if(str.charAt(j) == str.charAt(i) && i!=j)
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
    /**
     * Complexity O(n)
     * */
    public static void findFirstNonRepeatingCharacterUsingHashTable(String str)
    {
        LinkedHashMap<String,Integer> temp = new LinkedHashMap<String,Integer>();
        
        for(int i=0;i<str.length();i++)
        {
            if(temp.get(""+str.charAt(i))!=null)
            {
                int value = (temp.get(""+str.charAt(i)));
                temp.put(""+str.charAt(i),++value);
            }
            else
                temp.put(""+str.charAt(i),0);
        }
        
        Set<String> str2 = temp.keySet();
        
        for(String x: str2)
        {
            if(temp.get(x)==0)
            {
                System.out.println(x);
                break;
            }
        }
    }
}
