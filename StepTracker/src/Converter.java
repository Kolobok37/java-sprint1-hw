public class Converter {
    static int convertToKm(int steps){                                          //Перевод шагов в км
        int distance;
        distance = steps*75/100000;
        return distance;
    }
    static int convertToKKal(int steps){                                        //Перевод шагов в ккал
        int kKal;
        kKal=steps*50/1000;
        return kKal;

    }
}
