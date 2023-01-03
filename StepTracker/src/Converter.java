public class Converter {
    static int convertToKm(int steps){
        int distance;
        distance = steps*75/100000;       //Перевод шагов в км
        return distance;
    }
    static int convertToKKal(int steps){
        int kKal;
        kKal=steps*50/1000;
        return kKal;

    }
}
