package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= input.nextInt();
        System.out.println("Enter the value of b:");
        int b=input.nextInt();
        System.out.println("Enter the value of c:");
        int c=input.nextInt();
        if (a<b){
            System.out.println("the largest Number is :" + b);

        }
        else if (c>b){
            System.out.println("the largest Number is: " +c);
        }
        else {
            System.out.println("the largest Number is " + a);
        }
    }
}
