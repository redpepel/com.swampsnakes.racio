package com.swampsnakes.racio;

/**
 * Created by User on 15.11.2016.
 */
public class Day {
    String[][] arr = new String[24][60]; //Это массив одного дня, разделенный соответственно на часы и минуты. В ячейки масивов вносится занятие человека - работа и т.д.

    public void setArr1 (double a, double b) {
        int chsn = (int)a; //Пользователь вводит час начала работы в виде десятичной дроби. Допустим, 1:25 будет 10.25. Иные значения будут удаляться. Благодаря этому отсечению мы указываем точно ячейку начала работы.
        int minn = (int)(chsn - a)*100; //соответственно ячейка минут
        int chsn1 =  chsn+1; //Для цикла используем переменную int chsn1, с которой идет заполенние по часам.
        int chsc = (int)b;
        float minc = (int)(chsc - b)*100; // а эта переменная заполняет минуты последнего часа. Таким образом у нас заполнено простраство массива с начала рабочего дня до его конца

        while (minn<=60){
            arr[chsn][minn] = "работа"; //заполняет первый час работой

        }
        while (chsn1<chsc){
            for (int i = 0; i < arr[i].length; i++){
                arr [chsn1][i] = "работа";
            }
            chsn1++; // остальные часы
        }
        for (int i =0; i <minc; i++ ){
            arr [chsc][i] = "работа"; // минуты последнего часа.
        }
    }
    public void pr(){ //вывод массива для проверки
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[14].length; j++) {

                System.out.print (arr[i][j]);
            }

        }
    }

}
