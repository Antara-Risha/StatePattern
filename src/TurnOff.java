public class TurnOff implements State{
    private String state;

    public void paymentDone(Context context) {
        state = "Heat_On";
        System.out.println("We are making your popcorn!: "+state);
        context.setState(new FryPopcorn());
    }

    public void paymentNotDone(Context context) {
        state = "Turn_Off";
        System.out.println("You need to pay to get popcorn!: "+state);
        context.setState(new TurnOff());
    }

    public void popcornCooked(Context context) {
        state="Disperse";
        context.setState(new DispersePopcorn());
        System.out.println("Your popcorn is ready to take!: " + state);
    }
}
