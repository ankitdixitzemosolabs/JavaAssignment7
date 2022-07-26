package question1;

public class Hamster implements Rodent {
    public Hamster() {
        System.out.println("Hii , Iam question1.Hamster from question1.Rodent Family");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I don't run very fast ");
    }

    @Override
    public void getMyLooks() {
        System.out.println(" I have short tails or no tails, and much rounder, stouter faces");

    }
}
