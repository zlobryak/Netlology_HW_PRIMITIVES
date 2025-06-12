import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

//Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            ShowMessage.choose(); // Выводим информацию о возможных операциях пользователю

            String input = scanner.nextLine();

            String moneyStr;
            int money;
            switch (input) {
                case "end":
                    System.out.println("Программа завершена!");
                    scanner.close();
                    return;

                case "1":
                    System.out.println("Введите сумму дохода:");
                    moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                    money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case "2":
                    // действия при выборе второй операции
                    System.out.println("Введите сумму расхода:");
                    moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                    money = Integer.parseInt(moneyStr);
                    spendings += money;
                    break;
                case "3":
                    // действия при выборе третьей операции
                    int taxEarnings = Calc.taxEarnings(earnings);
                    int taxEarningsMinusSpendings = Calc.taxEarningsMinusSpendings(earnings, spendings);
                    int taxEconomy = Calc.ecoCalck(taxEarnings, taxEarningsMinusSpendings);
                    if (taxEarnings < taxEarningsMinusSpendings) {
                        ShowMessage.usn(taxEarnings, taxEarningsMinusSpendings, taxEconomy);

                    } else {
                        if (taxEarnings != taxEarningsMinusSpendings) {
                            ShowMessage.earningsMinusSpendings(taxEarningsMinusSpendings, taxEarnings, taxEconomy);

                        } else {
                            // В случае равенства налога в обоих системах
                            System.out.println("Можете выбрать любую систему налогообложения");
                        }
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}