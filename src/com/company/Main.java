package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name.");
        String name1 = kb.next();
        System.out.println("Nice to meet you, " + name1 + ". Your lucky number is " + perfectRandom.perfsqr());

    }
}
