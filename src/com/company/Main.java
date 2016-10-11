package com.company;

import java.util.Scanner;

public class Main {

   public static int var = 0;
    public static Object[] names = new Object [100];

    public static void main(String[] args) {
        while(true)
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter your name.");
            String name1 = kb.next();
            System.out.println("Nice to meet you, " + name1 + ". Your lucky number is " + perfectRandom.perfsqr());

            System.out.println("Type \"0\" to end the code. \nType \"1\" to see a list of all of the prior entries. \n" +
                    "Type \"2\" to enter another name.");
            int response = kb.nextInt();
            if (response == 0) {
                //how do i have the program cut off?????
                break;
            } else if (response == 1) {
                var++;
                        names[var] = object;
                break;
            } else if (response == 2)
                System.out.println("Type in another name");
            }
        }
}
