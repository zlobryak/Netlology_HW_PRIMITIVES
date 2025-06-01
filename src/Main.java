import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

//Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println();
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

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
                    if(Calck.taxEarnings(earnings) < Calck.taxEarningsMinusSpendings(earnings, spendings)) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + Calck.taxEarnings(earnings) + " рублей");
                        System.out.println("Налог на другой системе:" + Calck.taxEarningsMinusSpendings(earnings, spendings) + " рублей");
                        System.out.println("Экономия: " + Calck.ecoCalck(earnings, spendings) + " рублей");

                    }else{
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: "+ Calck.taxEarningsMinusSpendings(earnings, spendings) + " рублей");
                        System.out.println("Налог на другой системе:" + Calck.taxEarnings(earnings) + " рублей");
                        System.out.println("Экономия: " + Calck.ecoCalck(earnings, spendings) + " рублей");

                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}