package ru.vsu.cs.baturin_v_a;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        
        System.out.print("Введите число n = ");
        double n = readN();

        System.out.print("Введите число k = ");
        int k = readK();

        System.out.println("Пример с введенными данными будет равен = " + calcSol(n, k));
    }

    private static int readK() {
        Scanner sc = new Scanner(System.in);

        int k;
        return  k = sc.nextInt();
    }

    private static int readN() {
        Scanner sc = new Scanner(System.in);

        int n;
        return  n = sc.nextInt();
    }

    private static double calcSol(double n, int k) {
        double a = 0;

        for (int i = 1; i <= n; i++) {
            a += Math.pow(i, k);
            System.out.println(i);
            System.out.println(a);
        }

        return a;
    }
}
