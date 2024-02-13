package Assignment_2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentFunction s = new StudentFunction();
        System.out.println("1. to add student \t 2. to delete student \t 3. search student \t 4. to update details");
        int n = sc.nextInt();
        switch (n){
            case 1:
                s.addStudent();
            case 2:
                s.deleteStudent();
            case 3:
                s.searchStudent();
            case 4:
                s.updateStudent();
            default:
                System.out.println("Enter correct number");

        }

    }
}