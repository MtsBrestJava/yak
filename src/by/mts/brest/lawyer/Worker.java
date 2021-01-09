package by.mts.brest.lawyer;

public class Worker {

    public Worker(String name, float obrazowanie, int age) {
        this.name = name;
        this.obrazowanie = obrazowanie;
        this.age = age;

    }

    float obrazowanie;
    String name;
    int ZP;
    int age;

    void worked() {
        System.out.println("Worker worked!");
    }

    void tratit_ZP() {
        System.out.println("Trachu nemnogo ZP" + --ZP);

    }

    class ZP {

        int kolvo;
        kolvo = ZP;


        public void proverZP (){
            if (ZP = 300;) {
            System.out.println("kolvo ="+ kolvo + "ZP max, need min");
        } else { if (ZP < 300){
                System.out.println("ZP norm");
            }




    }

    @Override
    public String toString() {
        return "Worker - " +
                "name: '" + name + '\'' +
                ", obrazowanie: '" + obrazowanie + '\'' +
                ", age: " + age;
    }


}
