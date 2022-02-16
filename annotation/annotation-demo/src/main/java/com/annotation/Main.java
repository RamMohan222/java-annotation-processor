package com.annotation;

public class Main {

    public static void main(String[] args) {
        // The @BuilderProperty creates the dynamic builder class for Person with the help of annotation processor
        Person person = new PersonBuilder().setAge(29).setName("Ram").build();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
