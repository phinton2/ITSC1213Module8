/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1213module8;

/**
 *
 * @author Paydreanne E. Hinton
 * instructor Professor Van Custodio
 * courseSection ITSC1213-106-27949
 * lab 6 & 7
 * The following program holds all methods pertaining to person (superclass)
 */

 public abstract class Person implements Comparable<Student> {
    // private instance variables
    protected String firstName;
    protected String lastName;
    protected int id;
    public abstract void display();
    

    
    // constructor
    public Person () {}
    public Person (int id) {
        this.id = id;
    }
    public Person (String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    
    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public int getId() {
        return id;
    }
    /*
    public void display () {
        System.out.println("Name: " + firstName + " " + lastName + "\nID: " + id);
    }*/
    public void display2 () {
        System.out.println("Name: " + firstName + " " + lastName + "\nID: " + id);
    }
    
    // Module 7 Part C
    @Override
    public boolean equals(Object other) {
        if (other == null) {
        return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return this.getId() == ((Person) other).getId();
    }
}

