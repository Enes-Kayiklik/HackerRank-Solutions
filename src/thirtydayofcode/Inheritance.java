package thirtydayofcode;

import java.util.Arrays;
import java.util.Scanner;

class Personn {
    protected String firstName;
    protected String lastName;
    protected int id;

    // Constructor
    Personn(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + this.lastName + ", " + this.firstName + "\n" +
                "ID: " + this.id);
    }
}

class Student extends Personn {
    private final int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);

        this.testScores = testScores;
    }

    public String calculate() {
        int average = Arrays.stream(this.testScores).sum() / this.testScores.length;

        if (average >= 90) {
            return "O";
        } else if (average >= 80) {
            return "E";
        } else if (average >= 70) {
            return "A";
        } else if (average >= 55) {
            return "P";
        } else if (average >= 40) {
            return "D";
        } else return "T";
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}