import java.util.Arrays;

public class Main {

    // private static final Employee[] allEmployee = new Employee[10];

    public static void main(String[] args) {
        Employee[] employeeParameters = new Employee[10];
        Employee empl1 = new Employee("Петров ", "Петр", "ПетрПетрович", 4, 300_000);
        Employee empl2 = new Employee("Иванов ", "Иван", "ПетрПетрович", 1, 200_000);
        Employee empl3 = new Employee("Чудаков ", "Дмитрий", "Сергеевич", 3, 400_000);
        Employee empl4 = new Employee("Кулик ", "Татьяна", "Ивановна", 3, 120_000);
        Employee empl5 = new Employee("Лазаренко ", "Игорь", "Геннадьевич", 1, 220_000);
        Employee empl6 = new Employee("Титкова ", "Галина", "Ивановна", 5, 55_000);
        Employee empl7 = new Employee("Петриченко ", "Любовь", "Васильевна", 1, 500_000);
        Employee empl8 = new Employee("Шведова ", "Елена", "Евгеньевна", 2, 450_000);
        Employee empl9 = new Employee("Песенко ", "Валерий", "Николаевич", 1, 440_000);
        Employee empl10 = new Employee("Блохина ", "Юлия", "Алексеевна", 2, 142_000);

        employeeParameters[0] = empl1;
        employeeParameters[1] = empl2;
        employeeParameters[2] = empl3;
        employeeParameters[3] = empl4;
        employeeParameters[4] = empl5;
        employeeParameters[5] = empl6;
        employeeParameters[6] = empl7;
        employeeParameters[7] = empl8;
        employeeParameters[8] = empl9;
        employeeParameters[9] = empl10;


        //  1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        // for (Employee employee : employeeParameters) ;

        for (int i = 0; i < employeeParameters.length; i++) {
            System.out.println(employeeParameters[i]);
        }
        //    2. Посчитать сумму затрат на зарплаты в месяц.
        int sum = 0;
        for (int i = 0; i < employeeParameters.length; i++) {
            sum += employeeParameters[i].getWages();
        }
        System.out.println("Сумма затрат на зарплаты в меяц составила: " + sum + " руб.");


    }
}

//    3. Найти сотрудника с максимальной зарплатой.
//  int max = 0;
//for (Employee employee:employeeParameters) {
//  if (employeeParameters[i].getWages()>max);{
//max=employeeParameters[i].getWages();


//System.out.println("Максимальная зарплата" + max);


// int max = day[0];
//        for (int dayMax : day) {
//            if (dayMax > max) {
//                max = dayMax;


//    4. Найти сотрудника с минимальной зарплатой.
//public static void findMinWages() {

//  int minWages = allEmployee[0].getWages();
//for (Employee employee : allEmployee) {
//  if (employee != null) {
//    if (employee.getWages() < minWages) {
//      minWages = employee.getWages();
//}
//}
//}
//System.out.println("минимальная зарплата " + minWages);
//}


// 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//   public static double averageWage () {
//      return totalWages() / (double) allEmployee.length;
//   }

// 6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
//public static void printFullName() {
//  for (Employee employee : allEmployee) {
//    {
//      System.out.println(employee.toString());
// }

//}
//}
//}