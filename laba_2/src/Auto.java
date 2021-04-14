public class Auto {      //Добавить к гаражу возможность удаления из него машины,
                            // а к классу Auto добавить поле с гос. номером.
    private String firm; //создаем закрытый член нашего класса с названием фирмы автомобиля
    private String gNum;
    private int maxSpeed; // закрытый член класса, содержащий максимальную скорость
    public void setFirm(String firma){ //открытая функция (метод класса) для задания
        firm=firma; //значения фирмы автомобиля
    }
    public void setMaxSpeed(int speed){ //открытая функция (метод класса) для задания
        maxSpeed=speed; //значения максимальной скорости автомобиля
    }
    public void setNumber (String number){ //открытая функция (метод класса) для задания
        gNum=number; //значения гос. номера автомобиля
    }

    public int getMaxSpeed(){ //открытая функция (метод класса) для вывода значения
        return maxSpeed; //максимальной скорости
    }
    public String getFirm(){ //открытая функция (метод класса) для вывода значения
        return firm; //заданной фирмы
    }
    public String getNumber(){
        return gNum;
}
    public Auto(){ // конструктор класса (без параметров)
        firm="Без названия";
        maxSpeed=0;
        gNum="Без номера";
    }
    public Auto(String firma, String number, int speed){ //конструктор класса (с параметрами)
        firm=firma;
        maxSpeed=speed;
        gNum=number;
    }

}