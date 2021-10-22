package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = scan.nextDouble();
        balance= Math.floor(balance * 100);
        int count = 0;

        while(balance >0){
            if (balance >= 200){
                balance -= 200;
                count ++;
            }else if (balance >= 100 ){
                balance -= 100;
                count ++;
            }else if (balance >= 50){
                balance -= 50;
                count ++;
            }else if (balance >= 20 ){
                balance -= 20;
                count ++;
            }else if ( balance >= 10 ){
                balance -= 10;
                count ++;

            }else if (balance >= 5 ){
                balance -= 5;
                count ++;

            }else if (balance >= 2){
                balance -= 2;
                count ++;

            }else if (balance >= 1) {
                balance -= 1;
                count ++;
            }
        }
        System.out.println(count);
    }
}
