import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

//Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            System.out.println("3 <Enter>");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            String moneyStr;
            int money;
            switch (operation) {

                case 1:
                    System.out.println("Введите сумму дохода:");
                    moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                    money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    // действия при выборе второй операции
                    System.out.println("Введите сумму дохода:");
                    moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
                    money = Integer.parseInt(moneyStr);
                    spendings += money;
                    break;
                case 3:
                    // действия при выборе третьей операции
                    int sum = Calck.taxEarningsMinusSpendings(earnings, spendings);
                    System.out.println(sum);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}