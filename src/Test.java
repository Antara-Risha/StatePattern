public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        FryPopcorn fryPopcorn = new FryPopcorn();
        fryPopcorn.paymentDone(context);
        fryPopcorn.paymentNotDone(context);
        fryPopcorn.popcornCooked(context);


        TurnOff turnOff = new TurnOff();
        turnOff.paymentDone(context);
        turnOff.paymentNotDone(context);
        turnOff.popcornCooked(context);

        DispersePopcorn dispersedPopcorn = new DispersePopcorn();
        dispersedPopcorn.paymentDone(context);
        dispersedPopcorn.paymentNotDone(context);
        dispersedPopcorn.popcornCooked(context);
    }
}
