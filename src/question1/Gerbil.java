package question1;

public class Gerbil implements Rodent {
    public Gerbil() {
        System.out.println("Hii , Iam question1.Gerbil from question1.Rodent Family");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I run faster than question1.Hamster but slower than question1.Mouse");
    }

    @Override
    public void getMyLooks() {
        System.out.println("I have long tails, smallish ears, and long, flat foreheads/noses");
    }
}
