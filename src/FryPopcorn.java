public class FryPopcorn implements State{
    private  String state;

    public void paymentDone(Context context) {
        state = "Heat_On";
        context.setState(new FryPopcorn());
        System.out.println("We are making your popcorn!: " + state);
    }


    public void paymentNotDone(Context context) {
        state="Turn_Off";
        context.setState(new TurnOff());
        System.out.println("You need to pay to get popcorn!: " + state);
    }

    public void popcornCooked(Context context) {
        state="Disperse";
        context.setState(new DispersePopcorn());
        System.out.println("Your popcorn is ready to take!: " + state);
    }
}
