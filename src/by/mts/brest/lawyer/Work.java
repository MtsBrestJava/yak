package by.mts.brest.lawyer;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Work {

    public static void main(String[] args) throws IOException {

        //ArrayList<Worker> zpSTO = new ArrayList();

        Worker Mehanik = new Worker("Mihalich",5.4f,28);
        System.out.println(Mehanik);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a ZP:");
        int ZP = in.nextInt();

        for (ZP != 0; ZP > 0; Mehanik.ZP = ZP) {
            Mehanik.worked();
            System.out.println("ZP: Mehanik = " + Mehanik.ZP); }
        in.close();

        String workerDatabase = "C:\\Java\\detector\\worker_file.txt";
        new File(workerDatabase).getParentFile().mkdirs();
        FileWriter worker = new FileWriter(workerDatabase);
        worker.write(Mehanik.ZP+System.getProperty("line.separator"));

        worker.close();



    }
}
