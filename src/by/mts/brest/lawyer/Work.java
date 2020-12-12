package by.mts.brest.lawyer;

import java.util.Scanner;

public class Work {

    public static void main(String[] args) {

        Worker Mehanik = new Worker("Mihalich",5.4f,28);
        System.out.println(Mehanik);

        Mehanik.ZP = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a command:");
        String num = in.nextInt();
        for (num == "need work" +  + Mehanik.ZP++) {
            Mehanik.worked(); }
        while (num != "need work") {
            System.out.println("command not recognized, need new command input ");
        }






        in.close();




    }
}
