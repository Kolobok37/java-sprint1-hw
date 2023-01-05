public class MonthData {

        int[] days  = new int[30];      // Массив с информацией шагов за день
        String monthName;       //Имя месяца
void InputStep(int step,int day){                                                   //Сохранение данных за день
    days[day] = step;
    }
    void printDaysAndStepsFromMonth(){      //Печать статистика по дням
for (int i=0;i<30;i++){
    System.out.println(((i+1)+" день: "+ days[i]));
}
    }
    int sumStepsFromMonth(){        //Сумма за месяц
        int sumSteps = 0;
        for (int i = 0; i < 30; i++) {
            sumSteps+=days[i];
        }
        return sumSteps;
    }
    int maxSteps(){     //Максимальное колличество шагов за месяц
    int maxSteps =0;
    for(int i = 0; i < 30; i++){
        if (maxSteps  < days[i]) {
            maxSteps =days[i];
        }
        }
    return  maxSteps ;
    }
    int bestSeries(int goalByStepsPerDay){      //Лучшая серия шагов
    int maxSeries=0;
    int countSeries=0;
    for(int i=0;i<30;i++){
        if(goalByStepsPerDay<days[i]) {
            countSeries++;
            if(countSeries>maxSeries){
                maxSeries=countSeries;
            }
        }
        else {
            countSeries=0;
        }
        }
    return maxSeries;
    }
    int averageValue(){
    return sumStepsFromMonth()/30;
    }
    }
