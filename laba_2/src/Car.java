public class Car extends Auto{//файл Car.java
    private String model;
    private int numDoors;
    private Boolean fullTime; //полный привод
    public Car(){
        super();// вызываем конструктор класса-родителя без параметров (см. класс Auto)
        model=""; // добавляем инициализацию новых членов
        numDoors=4;
        fullTime=false;
    }

    public Car(String firma, String number, int speed, String name, int n, Boolean f){
        super(firma,number,speed); //вызываем конструктор класса-родителя с параметрами (см. класс Auto)
        model=name; // добавляем инициализацию новых членов
        numDoors=n;
        fullTime=f;
    }
    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setNumDoors(int n){
        numDoors=n;
    }
    public int getNumDoors(){
        return numDoors;
    }
    public void setFullTime(Boolean f){
        fullTime=f;
    }
    public Boolean isFullTime(){
        return fullTime;
    }
    public String toString(){
        return getFirm()+" "+getNumber()+" "+getMaxSpeed()+" "+model+" "+numDoors+" "+fullTime;
    }
}
