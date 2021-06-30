package lambdas;

public class Main {
    public static void main(String[] args) {

        OnOneListener onOneListener = new OnOneListener() {
            @Override
            public void onOne(String message) {
                System.out.println("One: "+ message);
            }
        };

        OnOneListener oneListener2 = (String message) -> {
            System.out.println("One Lambda: " + message);
        };

        onOneListener.onOne("Sin Lambda :C");

        oneListener2.onOne("Con lambda :)");
    }
}
