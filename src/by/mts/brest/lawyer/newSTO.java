package by.mts.brest.lawyer;

public class newSTO {

   public static void main(String[] args) {

            STO sto1;
            sto1 = new STO(5, 100);

            sto1.getSTO();
            sto1.stoOpen();


            @Override
            public void stoOpen() {
                System.out.println("STO Status = open");
            }

            @Override
            public void stoClose() {
                System.out.println("STO Status = close");

            }




        }






    }

}
