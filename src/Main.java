import java.util.Scanner;

    public static void main() {
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
                    int taxEarnings = Calck.taxEarnings(earnings);
                    int taxEarningsMinusSpendings = Calck.taxEarningsMinusSpendings(earnings, spendings);
                    if(taxEarnings < taxEarningsMinusSpendings) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + taxEarnings + " рублей");
                        System.out.println("Налог на другой системе:" + taxEarningsMinusSpendings + " рублей");
                        System.out.println("Экономия: " + Calck.ecoCalck(taxEarnings, taxEarningsMinusSpendings) + " рублей");

                    }else{
                        if(taxEarnings != taxEarningsMinusSpendings) {
                            System.out.println("Мы советуем вам УСН доходы минус расходы");
                            System.out.println("Ваш налог составит: " + taxEarningsMinusSpendings + " рублей");
                            System.out.println("Налог на другой системе:" + taxEarnings + " рублей");
                            System.out.println("Экономия: " + Calck.ecoCalck(taxEarnings, taxEarningsMinusSpendings) + " рублей");
                        } else{
                            // В случае равенства налога в обоих системах
                            System.out.println("Можете выбрать любую систему налогообложения");
                        }

                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }