/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1213module8;
import java.util.*;
/**
 *
 * @author Paydreanne E. Hinton
 * instructor Professor Van Custodio
 * courseSection ITSC1213-106-27949
 * lab 6 & 7
 * The following program holds all methods pertaining to professor (subclass)
 */
 class Professor extends Person {
    private String department;
    private double salary;
    private ArrayList<Student> advisees = new ArrayList<>();
    
    public Professor (String firstName, String lastName, int id, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    
    public Professor () {
        super();
    }
    
    public Professor (int id) {
        super(id);
    }
    
    public Professor(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }
    
    public double getSalary() {
        return salary;
    }
    public ArrayList<Student> getAdvisees() {
        return advisees;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public void addAdvisee(Student s) {
        advisees.add(s);
    }
    public boolean removeAdvisee (int adviseeID) {
        boolean hasAdvisee = false;
            for (Student s : advisees) {
                if (s.getId() == adviseeID) {
                    return advisees.remove(s);
                }
            }
        if (id == adviseeID)
            hasAdvisee = true;
        
        return hasAdvisee;
    }
    
    /*
    @Override
    public String toString() {
        return "Professor name:  " + firstName + " " + lastName + "\nID: " + id + "\nDepartment: " + department + "\nSalary: " + salary + "\nCurrent Advisees: " + getAdvisees();
    }*/
    
    /*
    public void display () {
        System.out.println(toString());
    }*/
    
    // Module 7 Part B 
    /*
    @Override
    public void display() {
        super.display();
        System.out.println("Dpartment: " + department + "\tSalary: " + salary);
        System.out.println("Advisees:");
        for (Student s: advisees) {
            System.out.println("\t" + s.getFirstName() + " " + s.getLastName());
            
        }
    }*/
    
    public void display() {
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName() + "\tID: " + this.getId());
        System.out.println("Department: " + department + "\tSalary: $" + salary);
    }
    
    @Override 
    public String toString () {
        return "Professor - " + this.getFirstName() + " " + this.getLastName();
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
