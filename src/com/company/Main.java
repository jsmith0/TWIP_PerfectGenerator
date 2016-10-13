package com.company;

import java.util.Scanner;

public class Main {

    public static Object[] names = new Object [100];
    public static int times=0;
    public static void main(String[] args) {
        outerloop:
        while(true)
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter your name.");
            String name1 = kb.next().trim();
            int sto = perfectRandom.perfsqr();
            System.out.println("Nice to meet you, " + name1 + ". Your lucky number is " + perfectRandom.perfsqr() + ".\n");

            names[times]=new String(name1+" your number is "+sto);
            times++;
           while(true) {
               System.out.println("Type \"0\" to end the code. Type \"1\" to see a list of all of the prior entries. Type \"2\" to enter another name.");
               int response = kb.nextInt();
               if (response == 0) {
                   break outerloop;
               }
               else if (response == 1) {
                   for (Object x : names) {
                       if (x != null) {
                           System.out.println(x.toString());
                       }
                   }
                   break;
               }
               else if (response == 2) {
                break;
               }
               else if (response != 0 || response != 1 || response != 2){
                   System.out.println("Please enter a valid number.");
               }
           }

        }
    }
}
