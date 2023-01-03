public class StepTracker {
    static MonthData[] monthToData = new MonthData[12];                                                     //Создание массива классов MonthDate
    static int goalByStepsPerDay = 10000;                                                                   //Цель по умолчанию
    String[] monthName = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};          //Названия месяцев
    StepTracker() {                                                                                         //Конструктор класса

        for (int i = 0; i < 12; i++) {
            monthToData[i] = new MonthData();
            monthToData[i].monthName = monthName[i];
        }
    }
    static  void addNewNumberStepsPerDay(int monthNumber,int dayNumber,int stepQuantity) {                  // ввод и проверка данных за день
            if ( monthNumber >= 12 ||monthNumber < 0) {
                System.out.println("Введён неправильный номер месяца");
                return;
            }
            if (dayNumber >= 31 || dayNumber <= 0) {
                System.out.println("Введён неправильный номер дня");
                return;
            }
            if (stepQuantity < 0) {
                System.out.println("Введено неправильное колличество шагов");
                return;
            }// проверка количества шагов

            // сохранение данных
        if (stepQuantity>=goalByStepsPerDay){
            System.out.println("Вы достигли цели шагов на день! Так держать!");
        }
        monthToData[monthNumber].days[dayNumber-1]=stepQuantity;
        }
    static void changeStepGoal(int goalByStepsPerDay){                                                        //Установка новой цели
        if(goalByStepsPerDay<=0){
            System.out.println("Введено неправильное колличество шагов");
            return;
        }
        StepTracker.goalByStepsPerDay=goalByStepsPerDay;
        System.out.println("Новая цель шагов: "+goalByStepsPerDay+ "! Вперёд!");
    }
    static void printStatistic(int numberMonth){                                                              //Печать статистики
        System.out.println("Статистика за " + monthToData[numberMonth].monthName + ": ");
        monthToData[numberMonth].printDaysAndStepsFromMonth();
        System.out.println("Общее колличество шагов за месяц: " + monthToData[numberMonth].sumStepsFromMonth());
        System.out.println("Максимальное пройденное количество шагов в месяце: : "+monthToData[numberMonth].maxSteps());
        System.out.println("Среднее колличество шагов за день: "+ (monthToData[numberMonth].sumStepsFromMonth()/30));
        System.out.println("Пройденная дистанция (в км): " + Converter.convertToKm(monthToData[numberMonth].sumStepsFromMonth()));
        System.out.println("Количество сожжённых килокалорий: " + Converter.convertToKKal(monthToData[numberMonth].sumStepsFromMonth()));
        System.out.println("Лучшая серия выполненой цели по шагам на день: "+monthToData[numberMonth].bestSeries(goalByStepsPerDay));
    }
    }


