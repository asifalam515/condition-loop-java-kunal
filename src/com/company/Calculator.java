package com.company;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
int ans=0;
        Scanner input=new Scanner(System.in);
//        Take input from users till user does not press x or X;
        while (true){
//            take the operator as input
            System.out.println("Enter the operator");
            char op=input.next().trim().charAt(0);
            if (op=='+'|| op=='-'||op=='*'||op =='/'||op=='%'){
//                 input two number
                System.out.println("Enter two numbers");
                int num1=input.nextInt();
                int num2=input.nextInt();
                if (op=='+'){
                ans=num1+num2;
                }
                if (op=='-'){
                    ans=num1-num2;
                }
                if (op=='*'){
                    ans=num1*num2;
                }
                if (op=='/'){
                   if(num2!=0){
                       ans=num1/num2
                   }
                }
                if (op=='%'){
                    ans=num1%num2;
                }
            }
            else if (op=='x'||op=='X'){
              break;
            }
            else{
                System.out.println("invallid operation");
            }
        }
        System.out.println(ans);
    }
}
