package javacode;


import kotlincode.Challenge;
import kotlincode.KotlinCodeKt;
import kotlincode.KotlinEmployee;

public class KotlinFromJava {

    public static void main(String[] args) {

        KotlinCodeKt.sayHelloToJava("Student");

        KotlinEmployee employee = new KotlinEmployee("John", "Smith", 2010);
        employee.setStartYear(2012);

        Challenge.INSTANCE.doMath(5, 4);

//        KotlinStuff.sayHelloToJava("Student");
//
//        KotlinEmployee employee = new KotlinEmployee("John", "Smith", 2010);
//        employee.startYear=2012;
//
//        Challenge.doMath(5, 4);
//
//        employee.takesDefault("arg1");

    }
}