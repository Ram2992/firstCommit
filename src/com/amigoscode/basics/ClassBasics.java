package com.amigoscode.basics;

import java.util.Date;

public class ClassBasics {

    static ClassBasics cbObj = new ClassBasics();

    public static void main(String[] args){
        System.out.println("ClassBasics");
        cbObj.bVariables();
        cbObj.bPDataTypes();
    }

    //Variables
    public void bVariables(){
        double num = 100.01;
        String d = "Dog";
        Date f = new Date();
    }

    //Primitive data types
    public void bPDataTypes(){
        byte theByte = -128; //1 b
        short theShort = 32_767; //2 b
        int theInt = 2_147_483_646; // 4 b
        long theLong = 999_449_494_999_999_999L; // 8 b
        float theFloat = 2.4f;
        double theDouble = 2.8;
        boolean theBoolean = true;
        char theChar = 'c';

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(theFloat);
        System.out.println(theDouble);
        System.out.println(theBoolean);
        System.out.println(theChar);
    }

    //Non Primitive data types (AKA reference types)
    public void bNPDataTypes() {
        String name = new String("Amigoscode");
        int age = 20;


    }
}
