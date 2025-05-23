public class CreditPaymentService {
    public int calculate(int creditAmount, double annualRate, int years) {

        /*формула платежа
        a = p * r * (1 + r)^n / ((1 + r)^n — 1), где:
            a — аннуитетный платёж = creditAmount
            p — сумма кредита
            r — месячная процентная ставка (годовая ставка делится на 12 и переводится в десятичную дробь); monthRate = monthly interest rate
            n — общее количество платежей (количество месяцев). tnp = total number of payments
        */
        int tnp = years * 12;//перевожу год в месяца
        double monthRate = annualRate / 12 * 0.01;//перевожу годовую ставку в месяц и дробь

        double creditPayment = creditAmount * monthRate * Math.pow(1 + monthRate, tnp) / ((Math.pow(1 + monthRate, tnp) - 1));//вычисляю точное значение
        return (int) creditPayment;//возвращаю целочисленное значение

    }
}