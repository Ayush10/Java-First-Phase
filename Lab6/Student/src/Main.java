import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.println("Enter the age of student: ");
        int age = sc.nextInt();

        System.out.println("Enter the marks in DSA: ");
        int marksOfDSA = sc.nextInt();

        System.out.println("Enter the marks in OOP: ");
        int marksOfOOP = sc.nextInt();

        System.out.println("Enter the marks in Advance Programming: ");
        int marksOfAdvanceProgramming = sc.nextInt();

        Student s1 = new Student(name, age, marksOfDSA, marksOfOOP, marksOfAdvanceProgramming);

        System.out.println("The information about the student is; ");
        s1.information();
    }
}

class Student {

    private static String nameOfStudent;
    private static int ageOfStudent;
    private static int marksOfDSA;
    private static int marksOfOOP;
    private static int marksOfAdvanceProgramming;

    public Student(String name, int age, int mark1, int mark2, int mark3) {
        nameOfStudent = name;
        ageOfStudent = age;
        marksOfDSA = mark1;
        marksOfOOP = mark2;
        marksOfAdvanceProgramming = mark3;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String name) {
        nameOfStudent = name;
    }

    public int getAgeOfStudent() {
        return ageOfStudent;
    }

    public void setAgeOfStudent(int age) {
        ageOfStudent = age;
    }

    public int getMarksOfDSA() {
        return marksOfDSA;
    }

    public void setMarksOfDSA(int mark1) {
        marksOfDSA = mark1;
    }

    public int getMarksOfOOP() {
        return marksOfOOP;
    }

    public void setMarksOfOOP(int mark2) {
        marksOfOOP = mark2;
    }

    public int getMarksOfAdvanceProgramming() {
        return marksOfAdvanceProgramming;
    }

    public void setMarksOfAdvanceProgramming(int mark3) {
        marksOfAdvanceProgramming = mark3;
    }

    public int average() {
        return (marksOfDSA + marksOfOOP + marksOfAdvanceProgramming) / 3;
    }

    public int maximum() {
        if (marksOfDSA > marksOfOOP && marksOfDSA >marksOfAdvanceProgramming) {
            return marksOfDSA;
        } else if (marksOfOOP > marksOfDSA && marksOfOOP > marksOfAdvanceProgramming) {
            return marksOfOOP;
        } else {
            return marksOfAdvanceProgramming;
        }
    }

    public String nameOfSubject() {
        if (maximum() == marksOfDSA) {
            return "Data Structure and Algorithm";
        } else if (maximum() == marksOfOOP) {
            return "Object Oriented Programming";
        } else {
            return "Advance Programming";
        }
    }

    public void information() {
        System.out.println("The name of the student is: " + nameOfStudent);
        System.out.println("The age of the " + nameOfStudent + " is: " + ageOfStudent);
        System.out.println(nameOfStudent + " scored " + marksOfDSA + " in Data Structure and Algorithm.");
        System.out.println(nameOfStudent + " scored " + marksOfOOP + " in Object Oriented Programming.");
        System.out.println(nameOfStudent + " scored " + marksOfAdvanceProgramming + " in Advanced Programming.");
        System.out.println("The average marks of the " + nameOfStudent + " is: " + average());
        System.out.println("The maximum marks score by the " + nameOfStudent + " is: " + maximum() + " in " + nameOfSubject());
    }
}
