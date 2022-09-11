import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String patronymic;
    private int department;
    private int wages;
    private static int sequenceumNumber = 1;
    private Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && wages == employee.wages && firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && patronymic.equals(employee.patronymic) && id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymic, department, wages, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department=" + department +
                ", wages=" + wages +
                ", id=" + id +
                '}';
    }

    public Employee(String lastName, String firstName, String patronymic, int department, int wages) {
        this.id = sequenceumNumber++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.department = department;
        this.wages = wages;


    }

    public Integer id() {
        return this.id();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }
}
//1. Создать класс Employee, который содержит информацию о ФИО.., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//    1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//    2. Посчитать сумму затрат на зарплаты в месяц.
//    3. Найти сотрудника с минимальной зарплатой.
//    4. Найти сотрудника с максимальной зарплатой.
//    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//    6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
//
//    - **Критерии оценки**
//
//        – Корректно создан класс Employee.
//
//        – Реализованы геттеры для всех полей класса.
//
//        – Реализованы сеттеры для всех полей класса.
//
//        – Создано поле типа Employee[10] для хранения записей о сотрудниках.
//
//        – Созданы методы, которые корректно выводят информацию:
//
//        - список всех сотрудников со всеми данными,
//        - поиск сотрудника с минимальной зарплатой,
//        - поиск сотрудника с максимальной зарплатой,
//        - подсчет среднего значения зарплат,
//        - список Ф. И. О. всех сотрудников.
//
//        – Программа работает корректно при изменении любых данных о сотрудниках и выводит верный результат.