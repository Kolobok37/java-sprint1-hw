public class MonthData {//Хранение данных и вывод информации

        int[] days  = new int[30];
        String monthName;
void InputStep(int step,int day){
    days[day] = step;
    }
    void printDaysAndStepsFromMonth(){
for (int i=0;i<30;i++){
    System.out.println(((i+1)+" день: "+ days[i]));
}
    }
    int sumStepsFromMonth(){
        int sumSteps = 0;
        for (int i = 0; i < 30; i++) {
            sumSteps+=days[i];
        }
        return sumSteps;
    }
    int maxSteps(){
    int maxSteps =0;
    for(int i = 0; i < 30; i++){
        if (maxSteps  < days[i]) {
            maxSteps =days[i];
        }
        }
    return  maxSteps ;
    }
    int bestSeries(int goalByStepsPerDay){
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
    }
