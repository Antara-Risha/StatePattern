public class EndMovie implements State{
    private  String state;

    public void isTime(Context context) {
        state = "Showing";
        context.setState(new StartMovie());
        System.out.println("The movie is starting now!: " + state);
    }


    public void isIntervalTime(Context context) {
        state="Pause";
        context.setState(new Interval());
        System.out.println("Break Time!: " + state);
    }

    public void isFinish(Context context) {
        state="Finish";
        context.setState(new EndMovie());
        System.out.println("The End!: " + state);
    }

    public void hasInterrupt(Context context) {
        state="Interrupt";
        context.setState(new EndMovie());
        System.out.println("Sorry we are facing some trouble!: " + state);
    }
}
