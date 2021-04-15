import java.util.Scanner;

public class test {
    //Добавить к гаражу возможность удаления из него машины,
    // а к классу Auto добавить поле с гос. номером.
    public static void main(String[] args) {
        Auto myAuto1 = new Auto();
        Scanner in = new Scanner(System.in);
        /**System.out.print("Введите фирму: ");
         String nazv=in.next();
         myAuto1.setFirm(nazv);
         System.out.print("Введите максимальную скорость: ");
         myAuto1.setMaxSpeed(s);
         System.out.println("Какой-то автомобиль: "+myAuto1.getFirm()+" "+myAuto1.getMaxSpeed());
         **/
        // int s=in.nextInt();
        // System.out.println();
        Car myCar1 = new Car("Ford", "АЕ404А", 200, "Mustang", 2, false);
        Car myCar2 = new Car();

        System.out.print("Введите фирму-производитель легкового авто: ");
        String nazv = in.next();
        myCar2.setFirm(nazv);

        System.out.print("Введите гос. номер легкового авто: ");
        String nom = in.next(); //метод next() позволяет вводить строки, но без пробелов
        myCar2.setNumber(nom);

        System.out.print("Введите максимальную скорость легкового авто: ");
        int s = in.nextInt();
        myCar2.setMaxSpeed(s);

        System.out.print("Введите модель легкового авто: ");
        nazv = in.next();
        myCar2.setModel(nazv);

        System.out.print("Введите кол-во дверей легкового авто: ");
        s = in.nextInt();
        myCar2.setNumDoors(s);

        System.out.print("Введите признак полного привода легкового авто (true/false): ");
        Boolean f = in.nextBoolean();
        myCar2.setFullTime(f);


        GarageCar myGarage = new GarageCar(); //создаем новый гараж
        // Car myCar1=new Car("Ford","АЕ404А", 200,"Mustang",2,false); //создаем легковую машину
        myGarage.addCar(myCar1); // добавляем ее в гараж
        myGarage.addCar(myCar2);//добавляем еще одну машину
        Truck myTruck = new Truck();//создаем грузовик
        myTruck.setAllInfo();
        myGarage.addCar(myTruck); //добавляем его в гараж
        myGarage.printGarage(); //выводи на экран содержимое гаража

        System.out.println("Желаете удалить машину из гаража? (true/false): ");
        boolean t = in.nextBoolean();
        if (t) {
            System.out.println("Какую машину желаете удалить?: (1/2/3)");
            int fin = in.nextInt();
            switch (fin) {
                case 1:
                    myGarage.remGarage(myCar1);
                    break;
                case 2:
                    myGarage.remGarage(myCar2);
                    break;
                case 3:
                    myGarage.remGarage(myTruck);
                    break;
                default:
                    System.out.println("Столько места в гараже нету!");
            }

            myGarage.printGarage(); //выводи на экран содержимое гаража


        }
        /**if (myGarage.findCar(myCar1)) { //ищем машину
         System.out.println("Да");
         }
         else {
         System.out.println("Нет");
         }**/


        /**System.out.println();
         System.out.println("Первый легковой автомобиль: "+myCar1.toString());
         System.out.println("Второй легковой автомобиль: "+myCar2.toString());
         Truck myTruck=new Truck();
         myTruck.setAllInfo();
         System.out.println(myTruck.toString());**/
    }
}
