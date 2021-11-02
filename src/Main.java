public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartMovie Screen = new StartMovie();
        Screen.isTime(context);
        Screen.isIntervalTime(context);
        Screen.isFinish(context);
        Screen.hasInterrupt(context);


        Interval Break = new Interval();
        Break.isTime(context);
        Break.isIntervalTime(context);
        Break.isFinish(context);
        Break.hasInterrupt(context);

        EndMovie Stop = new EndMovie();
        Stop.isTime(context);
        Stop.isIntervalTime(context);
        Stop.isFinish(context);
        Stop.hasInterrupt(context);

        Interrupt Pause = new Interrupt();
        Pause.isTime(context);
        Pause.isIntervalTime(context);
        Pause.isFinish(context);
        Pause.hasInterrupt(context);

    }
}
