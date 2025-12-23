package L8.L8Q6;

public class Stall {
    private String id;
    private int numBurger;
    private static int totalNum = 0;
    
    public Stall(String id, int numBurger) {
        this.id = id;
        this.numBurger = numBurger;
    }

    public void sold(int amount) {
        System.out.printf("\n=== Number of burger sold in %s === \n",id);
        System.out.println("Before: " + numBurger);
        numBurger += amount;
        System.out.println("After: "+ numBurger +"\n");
        totalNum += numBurger;
    }

    public String getID() {
        return id;
    }

    public int getNumBurger() {
        return numBurger;
    }

    public static int trackAllBurger() {
        return totalNum;
    }
}
