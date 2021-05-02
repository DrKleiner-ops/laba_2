//public class Laba_3 {
//}
/**
 * Класс Автомобиль - базовый класс для объектов транспорта
 * @author Слива М.В.
 */
public class Laba_3{
    /**Поле для хранения названия фирмы автомобиля */
    private String firm;
    /**Поле для хранения максимальной скорости автомобиля */
    private int maxSpeed;
    /**
     * Устанавливает значение поля {@link Auto#firm}
     * @param firma - название фирмы автомобиля */
    public void setFirm(String firma){
        firm=firma;
    }
    /**
     * Устанавливает значение поля {@link Auto#maxSpeed}
     * @param speed - значение максимальной скорости автомобиля */
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    /**
     * Возвращает значение поля {@link Auto#maxSpeed}
     *@return целое значение максимальной скорости автомобиля */
    public int getMaxSpeed(){
        return maxSpeed;
    }
    /**
     * Возвращает значение поля {@link Auto#firm}
     *@return строку с названием фирмы автомобиля */
    public String getFirm(){
        return firm;
    }
    /**
     * Создает автомобиль с фирмой "Без названия" и максимальной скоростью, равной 0*/
   // public Auto(){
    //    firm="Без названия";
     //   maxSpeed=0;
    //}
    /**
     * Создает автомобиль с задаными значениями фирмы и максимальной скорости
     * @param firma - название фирмы автомобиля
     * @param speed - значение максимальной скорости автомобиля*/
   /** public Auto(String firma, int speed){
        firm=firma;
        maxSpeed=speed;
    }*/
}
