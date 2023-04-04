
public interface State {
    public  void enter(Context context);
    public void payOK(Context context);
    public  void payFailed(Context context);
}
