package com.mystudy;

import static com.mystudy.Box.getVolume;
import static com.mystudy.Box.setDim;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


       setDim(20, 46, 75);
        int volume = getVolume();


        System.out.println ("V= " + volume );
    }
}
