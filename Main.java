package ru.vsu.cs.baturin_v_a;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Введите радиус: R = ");
        double r = readRadius();

        System.out.println("Площадь заштрихованной фигуры S = " + countSol(r));
    }
    
    private static double readRadius() {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        if (n <= 0) {
            System.out.println("Error: R <= 0");
            System.exit(0);
        }
        return n;
    }
    
    private static double countSol(double n) {
        return (((n * 2 * n * 2) - (Math.PI * n * n)) / 2);
    }
}

