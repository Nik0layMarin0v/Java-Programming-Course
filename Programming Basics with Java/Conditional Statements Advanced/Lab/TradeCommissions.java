package AdvancedConditionalStatements.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

//        Град	    0 ≤ s ≤ 500	    500 < s ≤ 1 000	    1 000 < s ≤ 10 000	    s > 10 000
//        Sofia	    5%	            7%	                8%	                    12%
//        Varna	    4.5%	        7.5%	            10%	                    13%
//        Plovdiv	5.5%	        8%	                12%	                    14.5%

        switch (town) {
            case "Sofia":
                if (sales <= 500 && sales >= 0) {
                    System.out.printf("%.2f", 0.05 * sales);
                } else if (sales <= 1000 && sales > 500) {
                    System.out.printf("%.2f", 0.07 * sales);
                } else if (sales <= 10000 && sales > 1000) {
                    System.out.printf("%.2f", 0.08 * sales);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", 0.12 * sales);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales <= 500 && sales >= 0) {
                    System.out.printf("%.2f", 0.045 * sales);
                } else if (sales <= 1000 && sales > 500) {
                    System.out.printf("%.2f", 0.075 * sales);
                } else if (sales <= 10000 && sales > 1000) {
                    System.out.printf("%.2f", 0.1 * sales);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", 0.13 * sales);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales <= 500 && sales >= 0) {
                    System.out.printf("%.2f", 0.055 * sales);
                } else if (sales <= 1000 && sales > 500) {
                    System.out.printf("%.2f",0.08 * sales);
                } else if (sales <= 10000 && sales > 1000) {
                    System.out.printf("%.2f", 0.12 * sales);
                } else if (sales > 10000) {
                    System.out.printf("%.2f", 0.145 * sales);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
