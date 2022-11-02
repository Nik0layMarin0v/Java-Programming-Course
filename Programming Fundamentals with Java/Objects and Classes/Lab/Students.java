package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getHometown() {
            return hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentInfo = new ArrayList<>();
        String[] studentData = scanner.nextLine().split(" ");
        while (!studentData[0].equals("end")) {
            Student currStudent = new Student();

            currStudent.setFirstName(studentData[0]);
            currStudent.setLastName(studentData[1]);
            currStudent.setAge(Integer.parseInt(studentData[2]));
            currStudent.setHometown(studentData[3]);

            studentInfo.add(currStudent);

            studentData = scanner.nextLine().split(" ");
        }
        String town = scanner.nextLine();
        for (int i = 0; i < studentInfo.size(); i++) {
            if (studentInfo.get(i).getHometown().equals(town)) {
                System.out.printf("%s %s is %d years old%n", studentInfo.get(i).getFirstName(), studentInfo.get(i).getLastName(), studentInfo.get(i).getAge());
            }
        }
    }

}
