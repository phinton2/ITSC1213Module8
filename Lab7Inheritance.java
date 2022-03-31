/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1213module8;
import java.util.*;
import java.util.Collections;

/**
 *
 * @author Paydreanne E. Hinton
 * instructor Professor Van Custodio
 * courseSection ITSC1213-106-27949
 * lab 6 & 7; Module 9, Module 10
 * The following program executes the Lab 7 Inheritance Program
 */
public class Lab7Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PART A
        System.out.println("*** Part A ***");
        Person p = new Student("Raya", "Whitaker", 800555555); // changed person to student
        
        p.display();
        
        // PART B
        System.out.println("\n*** Part B ***");
        Student s1 = new Student("Xavier", "Cato", 900111222, "CS", 3.5, 75);
        s1.setTransfer(true);
        s1.setBalance(100);
        
        s1.addCourse("Java Programming");
        s1.addCourse("Calculus");
        
        s1.display();
        // Module 7 Part C
        System.out.println(s1);

        
        // PART C
        System.out.println("\n*** Part C ***");
        Student s2 = new Student("Kathrine", "Johnson", 900, "CS", 4.0, 100);
        Student s3 = new Student("Roy", "Clay", 901, "Biology", 3.2, 85);
        Student s4 = new Student("Kimberly", "Bryant", 902, "Electrical Engineering", 3.0, 80);
        
        Professor prof1 = new Professor("Mary", "Castro", 300, "CS", 80000);
        prof1.addAdvisee(s2);
        prof1.addAdvisee(s3);
        prof1.addAdvisee(s4);
        
        prof1.display();
        // Module 7 Part C
        System.out.println(prof1);
        
        if (prof1.removeAdvisee(902)) {
            System.out.println("The advisee has been removed.\n\n");
        }
        else {
            System.out.println("This student is not an advisee of Professor " + prof1.getFirstName() + " " + prof1.getLastName() + "\n\n");
        }
        
        
        System.out.println("***********************");
        System.out.println("MODULE 7 PARTS C AND D");
        System.out.println("***********************");
        // Module 7 Part C
        System.out.println("Is Student 1 the same as Student 2?");
        System.out.println(s1.equals(s4) + "\n"); // prints false
        Student s05 = new Student("Xavier", "Cato", 900111222, "CS", 3.5, 75);
        System.out.println("Is Student 1 the same as Student 5?");
        System.out.println(s1.equals(s05)); // prints true
        
        // Module 7 Part D
        // This person array can hold the subclass obejcts too
        Person[] personArray = {s1, s2, prof1};
        // The shape ArrayList can add subclass objects too
        ArrayList<Person> personList = new ArrayList();
        personList.add(s1);
        personList.add(s2);
        personList.add(prof1);
        System.out.println("\nContent of personList:");
        for (Person person : personList) {
            System.out.println(person);
        }
        
        
        
        
        System.out.println("\n\n\n===========================");
        System.out.println("MODULE 9 PARTS D, E, AND F");
        System.out.println("===========================");
        System.out.println("\n*** Part D ***");
        ArrayList<Person> list = new ArrayList();
        
        list.add(p);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(prof1);
        
        Person p2 = new Student("Elle", "Kambol", 800);
        list.add(p2);
        
        Professor prof2 = new Professor("Frank", "Black", 801, "Math", 85000);
        list.add(prof2);
        
        Student s5 = new Student("Grace", "Maxeem", 903, "Psychology", 3.4, 95);
        list.add(s5);
        
        for (Person person : list) {
            person.display();
        }
        
        
        System.out.println("\n\n*** Part E ***");
        for (Person person : list) {
            if (matchId(person, 903) == true) {
                person.display();
            }
        }
        
        
        System.out.println("\n\n*** Part F ***");
        Person p3 = new Student("Maya", "Adams", 700, "Music", 3.5, 105);
        System.out.println(((Student)p3).getGPA());
        
        Person p4 = new Student("Bob", "Lowe", 701);
        if (p4 instanceof Student) {
            System.out.println(((Student)p4).getGPA());
            Student exus = ((Student)p4); // INTERESTING...
        }
        
        System.out.println("Students eligible for scholarship: ");
        for (Person person : list) {
            if (person instanceof Student && ((Student)person).getGPA() > 3.5) {
                System.out.println("\t" + person.getFirstName() + " " + person.getLastName());
            }
        }
        System.out.println("\nProfessors in CS: ");
        for (Person person : list) {
            if (person instanceof Professor && ((Professor)person).getDepartment().equals("CS")) {
                System.out.println("\t" + person.getFirstName() + " " + person.getLastName());
            }
        }
        

        // LAB 10 - PART C
        System.out.println("\n\nLAB 10 PART C");
        int compareStudents = s4.compareTo(s1);
        System.out.println(compareStudents);
        // LAB 10 - PART C
        ArrayList<Student> students = new ArrayList();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.getGPA());
        }
    }
        
    
        // PART E
        public static boolean matchId(Person p, int id) {
            if (p.getId() == id) {
                return true;
            } else {
                return false;
            }
        }
}
