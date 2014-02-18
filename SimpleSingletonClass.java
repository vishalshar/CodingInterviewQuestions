/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author vishal
 */
public class SimpleSingletonClass 
{
    public static SimpleSingletonClass instance = null;
    
    private SimpleSingletonClass()
    {
        /**
         * To block object initialization
         */
    }
    
    public static SimpleSingletonClass getInstance()
    {
        if(instance == null)
            instance = new SimpleSingletonClass();
        return instance;
    }
}
