public interface State {
    public void isTime(Context context); //movie starting time
    public  void isIntervalTime(Context context); //movie interval time
    public void isFinish(Context context); //movie finishing time
    public void hasInterrupt(Context context); //if any interrupt occurs
}
