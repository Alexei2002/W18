// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void  task1() {
        int age = 12;

        if (age > 18){
            System.out.println("Совершеннолетний");
        } else {
            System.out.println(" Несовершеннолетний");
        }
    }
    public static void  task2(){
        int temperature = 8;

        if  (temperature < 5){
            System.out.println("Нужно надеть шапку");
        } else{
            System.out.println("Не нужно надевать шапку");
        }
    }
    public static void  task3(){
        int speed = 60;

        if (speed >60){
            System.out.println("Штрафы");
        }else {
            System.out.println("Можно ездить спокойно");
        }
    }
    public static void  task4(){
        int age = 11;

        if (age >= 2&& age <= 6){
            System.out.println("Дутский сад");
        } else if (age > 6 && age <= 18){
            System.out.println("Школа");
        }else if (age > 18 && age < 24){
            System.out.println("Университет");
        }else  if (age>= 25){
            System.out.println("Работа");
        }
    }
    public static void  task5(){
        int age = 2;
        boolean withAdult = true;

        if (age< 5){
            System.out.println("Не может кататься на атракционе");
        } else if (age >= 5 && age< 14 && withAdult){
            System.out.println("Можно кататься только в сопровождении взрослых");
        }else  if (age >= 14){
            System.out.println("Можно кататься без сопровождения взрослого");
        }else{
            System.out.println("кататься нельзя");
        }
    }

    public static void  task6(){
        int capacity = 81;
        int seatPlaces = 80;

        int peoaleNumber = 70;
        if (peoaleNumber == capacity){
            System.out.println("Вагон полностью забит");
        }else  if (peoaleNumber < seatPlaces) {
            System.out.println("Есть сидячие места");
        }else {
            System.out.println("Есть стоячие места");
        }
    }
    public static void  task7() {
        int one = 100, two = 20, three = 30;

        if (one > two && one > three){
            System.out.println(one);
        }else if (two > three) {
            System.out.println(two);
        }else {
            System.out.println(three);
        }
    }

}