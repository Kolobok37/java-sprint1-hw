import java.util.Scanner;

public class StepTracker {
    MonthData[] monthToData = new MonthData[12];     //Создание массива классов MonthDate
    int goalByStepsPerDay = 10000;       //Цель по умолчанию
    Scanner scan;
    String[] monthName = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};      //Названия месяцев
    StepTracker(Scanner scanner) {     //Конструктор класса
        scan = scanner;
        for (int i = 0; i < 12; i++) {
            monthToData[i] = new MonthData();
            monthToData[i].monthName = monthName[i];
        }
    }
    void addNewNumberStepsPerDay() {      // ввод и проверка данных за день
        System.out.println("Введите номер месяца от 0 до 11 (включительно): ");
        int monthNumber = scan.nextInt();
            if ( monthNumber >= 12 ||monthNumber < 0) {     // проверка введённого месяца
                System.out.println("Введён неправильный номер месяца");
                return;
            }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scan.nextInt();
            if (dayNumber >= 31 || dayNumber <= 0) {        // проверка введённого дня
                System.out.println("Введён неправильный номер дня");
                return;
            }
        System.out.println("Введите количество шагов");
        int stepQuantity = scan.nextInt();
        if (stepQuantity < 0) {         // проверка количества шагов
                System.out.println("Введено неправильное колличество шагов");
                return;
            }
        if (stepQuantity>=goalByStepsPerDay){
            System.out.println("Вы достигли цели шагов на день! Так держать!");
        }
        monthToData[monthNumber].days[dayNumber-1]=stepQuantity;        // сохранение данных
        }
    void changeStepGoal(){   //Смена цели
        System.out.println("Введите новую цель шагов:");
        int newGoal=scan.nextInt();//Установка новой цели
        if(newGoal<=0){   //Проверка введёных данных
            System.out.println("Введено неправильное колличество шагов");
            return;
        }
        goalByStepsPerDay=newGoal;
        System.out.println("Новая цель шагов: "+goalByStepsPerDay+ "! Вперёд!");
    }
    void printStatistic(){   //Cтатистика за месяц
        System.out.println("Введите месяц: ");
        int monthNumber = scan.nextInt();
        MonthData month = monthToData[monthNumber];
        System.out.println("Статистика за " + month.monthName + ": ");
        month.printDaysAndStepsFromMonth();
        System.out.println("Общее колличество шагов за месяц: " + month.sumStepsFromMonth());
        System.out.println("Максимальное пройденное количество шагов в месяце: : "+month.maxSteps());
        System.out.println("Среднее колличество шагов за день: "+ (month.averageValue()));
        System.out.println("Пройденная дистанция (в км): " + Converter.convertToKm(month.sumStepsFromMonth()));
        System.out.println("Количество сожжённых килокалорий: " + Converter.convertToKKal(month.sumStepsFromMonth()));
        System.out.println("Лучшая серия выполненой цели по шагам на день: "+month.bestSeries(goalByStepsPerDay));
    }
    }


