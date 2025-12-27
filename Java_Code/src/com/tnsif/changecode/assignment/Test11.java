package com.tnsif.changecode.assignment;

class E2 {
    protected int x = 5;   // changed from private to protected
}

class F2 extends E2 {
    int x = 15;

    void print() {
        System.out.println(super.x);  // accesses parent variable
    }
}

public class Test11 {
    public static void main(String[] args) {
        F2 obj = new F2();
        obj.print();
    }
}

