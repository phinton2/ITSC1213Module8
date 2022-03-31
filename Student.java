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
 * The following program holds all methods pertaining to student (subclass)
 */
public class Student extends Person implements Comparable<Student>{
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private String course;
    private ArrayList <String> enrolledCourses = new ArrayList<String>();
    
    public Student (String firstName, String lastName, int id, String major, double gpa, int credits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
    }
    
    public Student () {
        super();
    }
    
    public Student (int id) {
        super(id);
    }
    
    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }
        
    public String getMajor () {
        return major;
    }
    public double getGPA () {
        return gpa;
    }
    public int getCredits () {
        return credits;
    }
    public boolean isTransfer() {
        return transfer;
    }
    public double getBalance () {
        return balance;
    }
    public ArrayList<String> getEnrolledCourses () {
        return enrolledCourses;
    }
    public void setMajor (String major) {
        this.major = major;
    }
    public void setGPA (double gpa) {
        this.gpa = gpa;
    }
    public void setCredits (int credits) {
        this.credits = credits;
    }
    public void setTransfer (boolean transfer) {
        this.transfer = transfer;
    }
    public void setBalance (double balance) {
        this.balance = balance;
    }
    public void addCourse (String course) {
        enrolledCourses.add(course);
    }
    public boolean dropCourse () {
        boolean hasCourse = enrolledCourses.contains(course);
        if (hasCourse == true) {
            enrolledCourses.remove(course);
        }
        return hasCourse;
    }
    public String getCourse () {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    /*
    public String toString() {
        return "\n\nStudent name:  " + firstName + " " + lastName + "\nID: " + id + "\nMajor: " + major + "\nCourses: " + enrolledCourses + "\nGPA: " + gpa + "\nCredits: " + credits;
    }*/
    
    
    /*
    public void display () {
        System.out.println(toString());
    }*/
    
    // Module 7 Part A
    @Override
    public void display(){
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("ID: " + this.getId() + "\tMajor: " + major);
        System.out.println("GPA: " + gpa + "\tCredits Applied: " + credits);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < enrolledCourses.size(); i++) {
            System.out.println("\t" + enrolledCourses.get(i));
        }
    }
    
    @Override 
    public String toString () {
        return "Student - " + this.getFirstName() + " " + this.getLastName();
    }

    
    @Override
    public int compareTo(Student o) {
        double sGPA = this.gpa;
        double oGPA = o.gpa;
        System.out.println("Students’ GPA: " + sGPA + " and " + oGPA);
        
        if (sGPA > oGPA) return 1;
        else if (sGPA < oGPA) return -1;
        else return 0;

    }
    
}
