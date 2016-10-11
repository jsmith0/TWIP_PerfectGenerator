package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name.");
        String name1 = kb.next();
        System.out.println("Nice to meet you, " + name1 + ". Your lucky number is " + perfectRandom.perfsqr());

        System.out.println("Type \"0\" to end the code. \nType \"1\" to see a list of all of the prior entries. \n" +
                "Type \"2\" to enter another name.");
        String response = kb.next();
        if (response == "0")
        {
            //how do i have the program cut off?????
            System.exit(0);
        }
        else if (response == "1")
        {
            //gotta figure this one out  O.o
            System.out.println(name1 + "" + perfectRandom.perfsqr());
        }
        else if ( response == "2")
        {
            //and i gotta figure this one out too.......
            System.out.println("Type in another name");
        }
    }
}
