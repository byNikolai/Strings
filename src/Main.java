public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String format = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + format);
    }
}
