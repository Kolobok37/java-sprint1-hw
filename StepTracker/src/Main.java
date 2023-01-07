import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Создание классов Scanner, StepTracker и Main
        StepTracker stepObject = new StepTracker();
        System.out.println("Добро пожаловать! Вы как всегда хороши!");  //Запуск меню
        printMenu(scanner, stepObject);
        System.out.println("Хорошего дня!");
    }
    public static void  printMenu(Scanner scanner, StepTracker stepObject) {    //Метод который печатает меню и в который вводятся данные
        while (true) {
            System.out.println("Выберите действие:\n0 -Выход из меню. \n1 - Добавить колличество шагов за день.\n2 - Установить цель.\n3 - Посмотреть статистику за месяц.");
            int command = scanner.nextInt();
            if (command == 1) {
                stepObject.addNewNumberStepsPerDay(scanner); //Добавление и проверка шагов
            } else if (command ==2) {
                System.out.println("Введите новую цель шагов: ");
                int goalByStepsPerDay=scanner.nextInt();
                stepObject.changeStepGoal(goalByStepsPerDay);
            } else if (command==3) {
                System.out.println("Введите месяц: ");      //Cтатистика за месяц
                int mouthNumber = scanner.nextInt();
                stepObject.printStatistic(mouthNumber);
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



