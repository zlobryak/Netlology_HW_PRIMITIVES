public class Calck {
    public static int tax;
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
    public static int taxEarnings (int earnings) {
        tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            // если расходы оказались больше, то налог посчитается отрицательным
            return 0;
        }
    }
    public static int ecoCalck(int ernings, int spendings){
        return Math.abs(taxEarnings(ernings) - taxEarningsMinusSpendings(ernings, spendings));
    }
    }