package objectsAndClasses.exercise;

        import java.util.Scanner;

public class OpinionPoll {

    static class Person {
        String name;
        int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] person = scanner.nextLine().split(" ");
            Person currPerson = new Person();
            currPerson.setName(person[0]);
            currPerson.setAge(Integer.parseInt(person[1]));

            if (currPerson.getAge() > 30) {
                System.out.printf("%s - %d%n", currPerson.getName(), currPerson.getAge());
            }
        }

    }
}
