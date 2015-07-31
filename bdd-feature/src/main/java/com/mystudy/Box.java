package com.mystudy;

/**
 * Created with IntelliJ IDEA.
 * User: DGrytsai
 * Date: 30.07.15
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class Box  extends Square{

    static int deep;

      static int getVolume(){
        return (getSquare()*deep);
    }
    public static void setParams(int w, int h, int d){
        widht = w;
        hight = h;
        deep = d;

    }
}
