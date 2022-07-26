package question1;

public class Mouse implements Rodent {
    public Mouse() {
        System.out.println("Hii , Iam question1.Mouse from question1.Rodent Family");
    }

    @Override
    public void getMyLooks() {
        System.out.println("I have a long tail and face");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I run Faster than all question1.Rodents");
    }
}
