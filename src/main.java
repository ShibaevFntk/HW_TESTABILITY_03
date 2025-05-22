public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int a;

        a = service.calculate(1_000_000, 9.99, 1);
        System.out.println(a);

        a = service.calculate(1_000_000, 9.99, 2);
        System.out.println(a);

        a = service.calculate(1_000_000, 9.99, 3);
        System.out.println(a);

    }
}