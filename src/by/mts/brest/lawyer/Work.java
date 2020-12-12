package by.mts.brest.lawyer;

import java.util.Scanner;

public class Work {

    public static void main(String[] args) {

        Worker Mehanik = new Worker("Mihalich",5.4f,28);
        System.out.println(Mehanik);

        Mehanik.worked();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a command:");
        int num = in.nextInt();




    }
}
