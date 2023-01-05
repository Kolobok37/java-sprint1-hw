public class Converter {
    static int convertToKm(int steps){      //Перевод шагов в км
        return steps*75/100000;
    }
    static int convertToKKal(int steps){    //Перевод шагов в ккал
        return steps*50/1000;

    }
}
