package com.tnsif.changecode.assignment;

import java.util.Scanner;

class C1 {
}

class D1 extends C1 {
}

public class Test_7 {
    public static void main(String[] args) {

        C1 obj = new D1();   // upcasting (already correct)
        C1 b = (C1) obj;    // downcasting not needed, but valid

        System.out.println("Casting successful");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // corrected input
        System.out.println("Entered number: " + n);

        sc.close();
    }
}

