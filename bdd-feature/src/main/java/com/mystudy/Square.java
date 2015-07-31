package com.mystudy;

/**
 * Created with IntelliJ IDEA.
 * User: DGrytsai
 * Date: 31.07.15
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
public class Square {
        static int hight;
        static int widht;


        static int getSquare(){
            return (widht*hight);
        }
        public static void setParams(int w, int h){
            widht = w;
            hight = h;

        }
}
