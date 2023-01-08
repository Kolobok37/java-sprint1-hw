import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Создание классов Scanner, StepTracker
        StepTracker stepObject = new StepTracker(scanner);
        System.out.println("Добро пожаловать! Вы как всегда хороши!");  //Запуск меню
        printMenu(scanner, stepObject);
        System.out.println("Хорошего дня!");;
    }
    public static void  printMenu(Scanner scanner, StepTracker stepObject) {    //Метод который печатает меню и в который вводятся данные
        while (true) {
            System.out.println("Выберите действие:\n1 - Добавить колличество шагов за день.\n2 - Установить цель.\n3 - Посмотреть статистику за месяц.\n0 -Выход из меню. ");
            int command = scanner.nextInt();
            if (command == 1) {
                stepObject.addNewNumberStepsPerDay(); //Добавление и проверка шагов
            } else if (command ==2) {
                stepObject.changeStepGoal(); //Установка новой цели
            } else if (command==3) {
                stepObject.printStatistic(); //Вывод статистики
            }
    else if(command == 0) {     // Выход из программы
    break;
        }
    else {
                System.out.println("Такой команды не существует. Пожалуйста, повторите ввод команды.");
            }
            System.out.println();
        }
        }
    }



