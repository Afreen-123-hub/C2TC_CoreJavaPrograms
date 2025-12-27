package com.tnsif.changecode.assignment;

class A3 {
    void display() {
        System.out.println("A display");
    }
}

class B3 extends A3 {

    void display() {
        System.out.println("B display");
    }

    public static void main(String[] args) {
        B3 obj = new B3();
        obj.display();
    }
}
