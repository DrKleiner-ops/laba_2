public class Auto {
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
    }
    public Auto(String firma, int speed){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
    }
}