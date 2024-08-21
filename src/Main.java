// Exercício de fixação (Set)

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> studentsA = new HashSet<>();
        Set<Integer> studentsB = new HashSet<>();
        Set<Integer> studentsC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            studentsA.add(number);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            studentsB.add(number);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            studentsC.add(number);
        }

        Set<Integer> total = new HashSet<>(studentsA);
        total.addAll(studentsB);
        total.addAll(studentsC);

        int size = total.size();

        System.out.printf("Total students: %s", size);

        sc.close();
    }
}