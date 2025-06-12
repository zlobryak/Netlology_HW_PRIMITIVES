public class ShowMessage {

    public static void choose() {
        System.out.println();
        System.out.println("Выберите операцию и введите её номер:");
        System.out.println("1. Добавить новый доход");
        System.out.println("2. Добавить новый расход");
        System.out.println("3. Выбрать систему налогообложения");
    }

    public static void usn(int taxEarnings, int taxEarningsMinusSpendings, int taxEconomy) {
        System.out.println("Мы советуем вам УСН доходы");
        System.out.println("Ваш налог составит: " + taxEarnings + " рублей");
        System.out.println("Налог на другой системе:" + taxEarningsMinusSpendings + " рублей");
        System.out.println("Экономия: " + taxEconomy + " рублей");
    }

    public static void earningsMinusSpendings(int taxEarningsMinusSpendings, int taxEarnings, int taxEconomy) {
        System.out.println("Мы советуем вам УСН доходы минус расходы");
        System.out.println("Ваш налог составит: " + taxEarningsMinusSpendings + " рублей");
        System.out.println("Налог на другой системе:" + taxEarnings + " рублей");
        System.out.println("Экономия: " + taxEconomy + " рублей");
    }
}
