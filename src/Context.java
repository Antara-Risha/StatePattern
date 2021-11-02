public class Context {
    private State state;

    public Context(){
    //        state = null;
        this.state= state;
    }

    public void setState(State state){
        this.state = state;

    }

    public State getState(){
        return state;
    }

}