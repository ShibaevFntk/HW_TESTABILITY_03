public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditPayment;

        creditPayment = service.calculate(1_000_000, 9.99, 1);
        System.out.println(creditPayment);

        creditPayment = service.calculate(1_000_000, 9.99, 2);
        System.out.println(creditPayment);

        creditPayment = service.calculate(1_000_000, 9.99, 3);
        System.out.println(creditPayment);

    }
}