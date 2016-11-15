package com.swampsnakes.racio;

/**
 * Created by User on 15.11.2016.
 */
public class Day {
    String[][] arr = new String[24][60];
    public void pr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("Эта минута ", arr[i][j]);
            }

        }
    }
    public void setArr1 (float a, float b) {
        int chsn = (int)a;
        int minn = (int)(chsn - a)*100;
        int chsn1 =  chsn+1;
        int chsc = (int)b;
        float minc = (int)(chsc - b)*100;

        while (minn<=60){
            arr[chsn][minn] = "работа";

        }
        while (chsn1<chsc){
            for (int i = 0; i < arr[i].length; i++){
                arr [chsn1][i] = "работа";
            }
            chsn1++;
        }
        for (int i =0; i <minc; i++ ){
            arr [chsc][i] = "работа";
        }
    }

}
