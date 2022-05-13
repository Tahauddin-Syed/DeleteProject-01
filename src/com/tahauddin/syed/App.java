package com.tahauddin.syed;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentTwo.setName("Mohd");
        studentTwo.setEmail("mohd@gmail.com");
        studentTwo.setDuration("4 Months");
        studentTwo.setCourse("Python");
        studentTwo.setFees("45000");

        studentOne.setName("Syed");
        studentOne.setEmail("syed@gmail.com");
        studentOne.setCourse("java");
        studentOne.setDuration("3 Months");
        studentOne.setFees("30000");

        System.out.println(studentOne);
        System.out.println(studentTwo);

    }
}
