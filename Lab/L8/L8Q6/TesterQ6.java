package L8.L8Q6;

public class TesterQ6 {
    public static void main(String[] args) {
        Stall mcd = new Stall("MCD",40);
        Stall kfc = new Stall("KFC",20);
        System.out.println("Initialized stall Mc'Donald & KFC\n");
        System.out.printf("Mc'Donald (%s)  : %d \n ", mcd.getID(), mcd.getNumBurger());
        System.out.printf("KFC      (%s)  : %d \n", kfc.getID(), kfc.getNumBurger());
        mcd.sold(6);
        kfc.sold(10);
        System.out.println();
        System.out.printf("Total number of burgers sold in all stalls: %d", Stall.trackAllBurger());
    }
}
