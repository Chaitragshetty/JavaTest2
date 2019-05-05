
//program to calculate average marks of student
spackage com.stackroute.pe2;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Student student = new Student();
        student.grade();
    }
}

class Student {
    Scanner s = new Scanner(System.in);
    int numberstudent, minimumGrade, maximumGrade;
    float average, sum = 0;
//method to calculatr average marks of students
    public void grade() {

        System.out.println("Enter the number of students: ");
        numberstudent = s.nextInt();
        int[] grade = new int[numberstudent];

        for (int i = 0; i < numberstudent; i++) {
            System.out.println("Enter the grade for student " + i + ": ");
            grade[i] = s.nextInt();
            sum = sum + grade[i];
        }
//Displaying minimum maximum marks of student using array sort function
        average = sum / numberstudent;
        System.out.println("The average is: " + average);
        Arrays.sort(grade);
        System.out.println("minimum is" + grade[0]);
        System.out.println("maximum is" + grade[numberstudent - 1]);

    }
}