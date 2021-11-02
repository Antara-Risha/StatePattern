public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        OpenState openState = new OpenState();
        openState.enter(context);
        openState.payOK(context);
        openState.payFailed(context);


        CloseState closeState = new CloseState();
        closeState.enter(context);
        closeState.payOK(context);
        closeState.payFailed(context);
    }
}


