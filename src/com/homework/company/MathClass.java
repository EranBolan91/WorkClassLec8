package com.homework.company;

/**
 * Created by Bolandian on 22/01/2017.
 */
public class MathClass {

    static void factorial(int num){
        int temp =1;
        for (int i = 1; i <= num; i++) {
            temp = temp*i;
        }
        System.out.println(temp);
    }

}
