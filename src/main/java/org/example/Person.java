package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    String email;
    String education;
    String nationality;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person (String email, String education, String nationality, String firstName,String lastName, int age) {
        super();
        this.email = email;
        this.education = education;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age>=13 && this.age<=19;
    }

}


