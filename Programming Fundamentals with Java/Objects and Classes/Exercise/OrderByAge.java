package objectsAndClasses.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person {
        String name;
        String ID;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] currentData = scanner.nextLine().split(" ");
        List<Person> people = new ArrayList<>();
        List<String> ageOrder = new ArrayList<>();

        while (!currentData[0].equals("End")) {
            Person currPerson = new Person();
            currPerson.setName(currentData[0]);
            currPerson.setID(currentData[1]);
            currPerson.setAge(Integer.parseInt(currentData[2]));

            people.add(currPerson);
            currentData = scanner.nextLine().split(" ");
        }

        for (Person person: people) {
            String newLine = "";
            if (person.getAge() / 10 == 0) {
                newLine = "0" + person.getAge() + " " + person.getName() + " " + person.getID();
            } else {
                newLine = person.getAge() + " " + person.getName() + " " + person.getID();
            }
            ageOrder.add(newLine);
        }
        Collections.sort(ageOrder);
        for (String data: ageOrder) {
            String[] personInfo = data.split(" ");
            System.out.printf("%s with ID: %s is %d years old.%n", personInfo[1], personInfo[2], Integer.parseInt(personInfo[0]));
        }
    }
}
