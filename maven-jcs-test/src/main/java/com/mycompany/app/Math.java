package com.mycompany.app;

public class Math {
	
    int a, b;
    Math(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int add() {
        return a + b;
    }
    
    public int multiply() {
        return a * b;
    }
}