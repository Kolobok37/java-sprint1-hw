import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                               //Создание класса Scanner
        StepTracker a = new StepTracker();                                      //Создание класса StepTracker
        System.out.println("Добро пожаловать! Вы как всегда хороши!");          //Запуск меню
        printMenu(scanner);
        System.out.println("Хорошего дня!");
    }


    public static void printMenu(Scanner scanner) {                             //Метод который печатает меню и в который вводятся данные
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить колличество шагов за день.");
            System.out.println("2 - Установить цель.");
            System.out.println("3 - Посмотреть статистику за месяц.");
            System.out.println("0 -Выход из меню.");
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Введите номер месяца от 0 до 11 (включительно): ");
                int monthNumber = scanner.nextInt();
                System.out.println("Введите день от 1 до 30 (включительно)");
                int dayNumber = scanner.nextInt();
                System.out.println("Введите количество шагов");
                int stepQuantity = scanner.nextInt();// ввод и проверка дня
                StepTracker.addNewNumberStepsPerDay(monthNumber,dayNumber,stepQuantity);//Добавление и проверка шагов
            } else if (command ==2) {
                System.out.println("Введите новую цель шагов: ");
                int goalByStepsPerDay=scanner.nextInt();
                StepTracker.changeStepGoal(goalByStepsPerDay);
            } else if (command==3) {
                System.out.println("Введите месяц: ");//Cтатистика за месяц
                int mouthNumber = scanner.nextInt();
                StepTracker.printStatistic(mouthNumber);
            }
    else if(command == 0) {                                            // Выход из программы
    break;
        }
    else {
                System.out.println("Такой команды не существует. Пожалуйста, повторите ввод команды.");
            }
            System.out.println();
        }
        }
    }



