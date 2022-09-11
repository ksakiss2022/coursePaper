public class Main {

    private static final Employee[] allEmployee = new Employee[10];

    public static void main(String[] args) {

        Employee firstEmployee = new Employee("Петров ", "Петр", "ПетрПетрович", 4, 300_000);
        Employee secondtEmployee = new Employee("Иванов ", "Иван", "ПетрПетрович", 1, 200_000);
        Employee thirdEmployee = new Employee("Чудаков ", "Дмитрий", "Сергеевич", 3, 400_000);
        Employee fourthEmployee = new Employee("Кулик ", "Татьяна", "Ивановна", 3, 120_000);
        Employee fifthEmployee = new Employee("Лазаренко ", "Игорь", "Геннадьевич", 1, 220_000);
        Employee sixthEmployee = new Employee("Титкова ", "Галина", "Ивановна", 5, 55_000);
        Employee seventhEmployee = new Employee("Петриченко ", "Любовь", "Васильевна", 1, 500_000);
        Employee eighthEmployee = new Employee("Шведова ", "Елена", "Евгеньевна", 2, 450_000);
        Employee ninthEmployee = new Employee("Песенко ", "Валерий", "Николаевич", 1, 440_000);
        Employee tenthEmployee = new Employee("Блохина ", "Юлия", "Алексеевна", 2, 142_000);

        allEmployee[0] = firstEmployee;
        allEmployee[1] = secondtEmployee;
        allEmployee[2] = thirdEmployee;
        allEmployee[3] = fourthEmployee;
        allEmployee[4] = fifthEmployee;
        allEmployee[5] = sixthEmployee;
        allEmployee[6] = seventhEmployee;
        allEmployee[7] = eighthEmployee;
        allEmployee[8] = ninthEmployee;
        allEmployee[9] = tenthEmployee;
        //  1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        for (int i = 0; i < allEmployee.length; i++) {
            System.out.println(allEmployee[i]);
        }
    }

    //    2. Посчитать сумму затрат на зарплаты в месяц.
    public static void calculateMonthWages() {
        int sum = 0;
        for (Employee employee : allEmployee) {
            sum += employee.getWages();
        }

        System.out.println("Сумма заработной платы " + sum + " рублей");

    }

    //    3. Найти сотрудника с максимальной зарплатой.
    public static void toFindMaxWages() {
        int maxWages = -1;
        for (Employee employee : allEmployee) {
            if (employee != null) {
                if (employee.getWages() > maxWages) {
                    maxWages = employee.getWages();
                }
            }
        }
        System.out.println("максимальная запрплата " + maxWages + ".");
    }

    //    4. Найти сотрудника с минимальной зарплатой.
    public static void findMinWages() {

        int minWages = allEmployee[0].getWages();
        for (Employee employee : allEmployee) {
            if (employee != null) {
                if (employee.getWages() < minWages) {
                    minWages = employee.getWages();
                }
            }
        }
        System.out.println("минимальная зарплата " + minWages);
    }


    // 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    //   public static double averageWage () {
    //      return totalWages() / (double) allEmployee.length;
    //   }

    // 6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printFullName() {
        for (Employee employee : allEmployee) {
            {
                System.out.println(employee.toString());
            }

        }
    }
}