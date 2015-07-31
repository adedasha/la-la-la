package com.mystudy;

/**
 * Created with IntelliJ IDEA.
 * User: DGrytsai
 * Date: 30.07.15
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class Box {
    static int hight;
    static int widht;
    static int deep;

      static int getVolume(){
        return (widht*hight*deep);
    }
    public static void setDim(int w, int h, int d){
        widht = w;
        hight = h;
        deep = d;

    }
}
