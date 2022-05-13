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
        studentTwo.setInstituteName("ABC");

        studentOne.setName("Syed");
        studentOne.setEmail("syed@gmail.com");
        studentOne.setCourse("java");
        studentOne.setDuration("3 Months");
        studentOne.setFees("30000");
        studentOne.setInstituteName("XYZ");

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println("Hello World");

        System.out.println("Yo Yo");
    }
}
