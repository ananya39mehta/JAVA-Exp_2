package Assignment_2;

import java.util.*;

import static Assignment_2.Main.sc;

public class StudentFunction {
    ArrayList<Student> classroom = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter number of Students to be added :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the PRN:");
            int PRN = sc.nextInt();
            System.out.println("Enter th Name:");
            String sName = sc.next();
            System.out.println("Enter the DOB:");
            int Dob = sc.nextInt();
            System.out.println("Enter the marks:");
            int marks = sc.nextInt();

            Student s = new Student(sName, PRN, Dob, marks);
            classroom.add(s);
        }//for
        printDetails();
    }//addStudent

    private void printDetails() {
        System.out.println("--------------------------STUDENT INFORMATION---------------------");
        for (int i = 0; i < classroom.size(); i++)
            print(i);

    }//printBookDetails

    private void print(int i) {
        System.out.println("PRN\t Student Name\t DOB\t Marks");
        System.out.println(classroom.get(i).getPrn() + "    " +
                classroom.get(i).getsName() + "      " +
                classroom.get(i).getDob() + "      " +
                classroom.get(i).getMarks()
        );

    }//printBook

    void deleteStudent() {
        System.out.println(("Enter the number of students you want to delete:"));
        int n2 = sc.nextInt();
        for (int j = 0; j < n2; j++) {
            System.out.println("Enter the Prn");
            int prn = sc.nextInt();
            for (int i = 0; i < classroom.size(); i++) {

                if (classroom.get(i).getPrn() == prn) {
                    classroom.remove(i);
                }
                else {
                    System.out.println("Student Not Found");
                }//else
            }//for

        }//deleteStudent
        printDetails();

    }

    public void searchStudent() {
        System.out.println("Enter the 1. for search by Prn 2. to search by Name :");
        int z = sc.nextInt();
        switch (z) {
            case 1: {
                System.out.println("Enter the Prn");
                int prn = sc.nextInt();
                for (int i = 0; i < classroom.size(); i++) {

                    if (classroom.get(i).getPrn() == prn) {
                        System.out.println("Student found");
                        print(i);
                    } else {
                        System.out.println("Student Not Found");
                    }
                }
            }

            case 2: {
                System.out.println("Enter the Name");
                String name = sc.next();
                for (int i = 0; i < classroom.size(); i++) {

                    if (classroom.get(i).getsName() == name) {
                        System.out.println("Student found");
                        print(i);
                    } else {
                        System.out.println("Student Not Found");
                    }
                }
            }

        }//switch

    }//searchStudent

    public void updateStudent() {

        //updateStudent
    }

}
