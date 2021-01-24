package by.mts.brest.lawyer;

public abstract class STO {

    private String nameSTO;

    public int Workers;
    public int WorkTime;

    public STO (int Workers, int WorkTime){
        this.nameSTO = nameSTO;
       }

    public void getSTO() {
        System.out.println("nameSTO = " + nameSTO);
    }

    public abstract void stoOpen();

    public abstract void stoClose();


}
