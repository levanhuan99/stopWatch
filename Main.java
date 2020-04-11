package com.codewithme;

import java.awt.image.MemoryImageSource;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final int amount=100000;
        int[] array=new int[amount];
        int x=0,min=1,max=1000;

        for (int i=0;i<amount;i++){
             x= (int) (int)(Math.random()*((max-min)+1))+min;
            array[i]=x;
        }

        Time time=new Time();
        time.start();
        int min1;
        for(int i = 0; i < amount - 1; i++) {
            min1=i;
            for(int j = i + 1; j < amount; j++ ) {
                if(array[j] < array[min1])
                    min1=j;
            }
            if (min1!=i){
                int temp=array[min1];
                array[min1]=array[i];
                array[i]=temp;
            }

        }
        time.end();
        System.out.println("time of selection sort algorithm is "+ (time.getElapsedTime()/1000)+" s");






    }



}
