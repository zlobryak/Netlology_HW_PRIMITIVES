public class Calc {
    public static int tax;

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        tax = (earnings - spendings) * 15 / 100;

        //Информационное сообщение для вычисления количества вызовов
        //System.out.println("Считаем налог на доходы минус расходы");

        // если расходы оказались больше, то налог посчитается отрицательным
        return Math.max(tax, 0);
    }

    public static int taxEarnings(int earnings) {
        tax = earnings * 6 / 100;

        //Информационное сообщение для вычисления количества вызовов
        //System.out.println("Считаем налог на доходы");

        // если расходы оказались больше, то налог посчитается отрицательным
        return Math.max(tax, 0);
    }

    public static int ecoCalck(int taxErnings, int taxErnigsMinusspendings) {
        return Math.abs(taxErnings - taxErnigsMinusspendings);
    }
}