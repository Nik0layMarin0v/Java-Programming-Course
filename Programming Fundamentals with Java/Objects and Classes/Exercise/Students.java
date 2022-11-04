package objectsAndClasses.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {
        String firstName;
        String secondName;
        Double grade;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public Double getGrade() {
            return grade;
        }
        public void setGrade(double grade) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> allStudentsData = new ArrayList<>();
        List<String> gradesOrder = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            Student currStudent = new Student();

            currStudent.setFirstName(studentInfo[0]);
            currStudent.setSecondName(studentInfo[1]);
            currStudent.setGrade(Double.parseDouble(studentInfo[2]));

            allStudentsData.add(currStudent);
            String newList = studentInfo[2] + " " + studentInfo[0] + " " + studentInfo[1];
            gradesOrder.add(newList);
        }
        Collections.sort(gradesOrder);
        Collections.reverse(gradesOrder);
        for (String student: gradesOrder) {
            String[] studentsData =  student.split(" ");
            System.out.printf("%s %s: %s%n", studentsData[1], studentsData[2], studentsData[0]);
        }
    }

}
