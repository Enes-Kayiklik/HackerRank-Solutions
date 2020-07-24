package thirtydayofcode;

import java.util.Scanner;

public class DataTypes {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                (Integer.parseInt(scan.nextLine()) + 4) + "\n" +
                        (Double.parseDouble(scan.nextLine()) + 4.0) + "\n" +
                        "HackerRank ".concat(scan.nextLine()));
    }
}
