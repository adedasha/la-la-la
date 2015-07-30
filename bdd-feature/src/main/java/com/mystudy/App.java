package com.mystudy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Box korobka = new Box();
       korobka.setDim(20,46,75);
        int volume = korobka.getVolume();


        System.out.println ("V= " + volume );
    }
}
