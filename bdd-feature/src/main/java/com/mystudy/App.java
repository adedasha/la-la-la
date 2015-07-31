package com.mystudy;


import static com.mystudy.Box.getVolume;
import static com.mystudy.Box.setParams;
import static com.mystudy.Square.getSquare;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


       setParams(20, 8, 5);
        int volume = getVolume();
        int square = getSquare();

        System.out.println ("V = " + volume );
        System.out.println ("S = " + square );
    }
}
