import models.QuadraticEquation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Quadratic Equation---");
        System.out.print("Enter number a:");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.print("Enter number b:");
        double numberB = Double.parseDouble(sc.nextLine());
        System.out.print("Enter number c:");
        double numberC = Double.parseDouble(sc.nextLine());

        QuadraticEquation val = new QuadraticEquation(numberA, numberB, numberC);

        int discriminant = val.getDiscriminant(val);

        switch (discriminant) {
            case 1:
                double root_1 = val.getRoot1(val);
                double root_2 = val.getRoot2(val);
                System.out.printf("Phương trình có 2 nghiêm: %f và %f\n", root_1, root_2);
                break;
            case 0:
                double root_3 = val.getRoot3(val);
                System.out.printf("Phương trình có nghiệm duy nhất: %f\n", root_3);
                break;
            case -1:
                System.out.println("Phương trình vô nghiệm");
                break;
        }

    }

}

