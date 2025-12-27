package com.tnsif.changecode.assignment;

class C3 {
    final void show() {
        System.out.println("C3");
    }
}

class D3 extends C3 {
    
}

public class Test_9 {
    public static void main(String[] args) {
        C3 obj = new D3();   
        obj.show();         // calls C3's show()
    }
}
