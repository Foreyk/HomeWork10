public class Main {
    public static void main(String[] args) {
        task1();
        task2();


    }

    //Задание 1,2,3

    private static void task1() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        fullName = fullName.replace('ё', 'е');
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + fullName);



    }


    //Задание 2
    private static void task2() {

    }
}