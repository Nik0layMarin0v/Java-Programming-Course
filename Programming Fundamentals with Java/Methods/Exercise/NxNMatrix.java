package methods.exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            line(num);
        }
    }
    
    public static void line(int n) {
        String text = "";
        for (int i = 0; i < n; i++) {
            text = text + n + " ";
        }
        System.out.println(text);
    }
}
