package com.swampsnakes.racio;
import java.util.Scanner;

/**
 * Created by User on 12.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        RacioTimTable RTT = new RacioTimTable ();
        Day Til = new Day ();
        System.out.println("Укажите количество часов, которое вы тратите на работу с твердым графиком и укажите точные часы работы. Я работаю с ");
        RTT.work = in.nextFloat();
        System.out.println("До ");
        RTT.work1 = in.nextFloat();
        Til.setArr1(RTT.work,RTT.work1);
        Til.pr();
        System.out.println("Укажите количество часов, которое вы тратите на учебу с четким расписание и укажите точные часы работы");
        RTT.study = in.nextFloat();
        System.out.println("До ");
        RTT.study1 = in.nextFloat();
        System.out.println("Укажите количество часов, которое вы тратите на тренировку с твердым графиком и укажите точные часы работы");
        RTT.traning = in.nextFloat();
        System.out.println("До ");
        RTT.traning1 = in.nextFloat();



    }


}
