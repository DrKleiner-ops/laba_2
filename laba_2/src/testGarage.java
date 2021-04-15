public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage = new GarageCar(); //создаем новый гараж
        Car myCar1 = new Car("Ford", "АЕ404А", 200, "Mustang", 2, false); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж
        myGarage.addCar(new Car());//добавляем еще одну машину
        Truck myTruck = new Truck();//создаем грузовик
        myGarage.addCar(myTruck); //добавляем его в гараж
        myGarage.printGarage(); //выводи на экран содержимое гаража
        myGarage.remGarage(myCar1);
        if (myGarage.findCar(myCar1)) { //ищем машину
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
