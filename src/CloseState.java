public class CloseState implements State{
    private String state;
    public void enter(Context context) {
        state="close";
        context.setState(new CloseState());
        System.out.println("You didn't get the ticket You can't enter : " + state);
    }

    public void payOK(Context context) {
        state = "open";
        System.out.println("Ticket taken You can enter: "+state);
        context.setState(new OpenState());
    }

    public void payFailed(Context context) {
        state = "close";
        System.out.println("You didn't get the ticket You can't enter: "+state);
        context.setState(new CloseState());
    }
}
