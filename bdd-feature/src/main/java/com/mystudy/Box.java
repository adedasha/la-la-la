package com.mystudy;

/**
 * Created with IntelliJ IDEA.
 * User: DGrytsai
 * Date: 30.07.15
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class Box {
    int hight;
    int widht;
    int deep;

    int getVolume(){
        return (widht*hight*deep);
    }
    public void setDim(int w, int h, int d){
        widht = w;
        hight = h;
        deep = d;

    }
}
