package thirtydayofcode;

import java.util.Scanner;

class Person {
    private int age;

    public Person(int initialAge) {
        this.age = Math.max(initialAge, 0);
        if (initialAge < 0) System.out.println("Age is not valid, setting age to 0.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

    public void amIOld() {
        if (this.age < 13) System.out.println("You are young.");
        else if (this.age < 18) System.out.println("You are a teenager.");
        else System.out.println("You are old.");
    }

    public void yearPasses() {
        this.age++;
    }
}