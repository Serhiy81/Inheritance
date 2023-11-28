package app;

public class Main {

    static double sum;
    static double tax;
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        Service service = new Service(10);
        Win win = new Win(3,"win");
        sum = win.number;
        String name = win.name;

        sum = service.calcSum();
        tax = service.calcPersent();

        System.out.printf(" You played: %.2f %s %n Tax on winnings is: %.2f %s %n" +
                        " Congratulations is "+ name + " !",
                sum,CURRENCY,tax,CURRENCY);


    }

}
