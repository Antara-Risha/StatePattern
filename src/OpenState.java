public class OpenState implements State {
 private  String state;

    public void enter(Context context) {
        state="close";
        context.setState(new CloseState());
        System.out.println("You didn't get the ticket You can't enter : " + state);
    }

    public void payOK(Context context) {
         state = "open";
        context.setState(new OpenState());
        System.out.println("Ticket taken You can enter: " + state);
    }


    public void payFailed(Context context) {
        state="close";
        context.setState(new CloseState());
        System.out.println("You didn't get the ticket You can't enter : " + state);
    }

}
