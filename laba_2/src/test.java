import java.util.Scanner;
public class test {
    //Добавить к гаражу возможность удаления из него машины,
    // а к классу Auto добавить поле с гос. номером.
    public static void main(String[] args) {
        Auto myAuto1=new Auto();
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
        Car myCar1=new Car("Ford","АЕ404А", 200,"Mustang",2,false);
        Car myCar2=new Car();
        System.out.print("Введите фирму-производитель легкового авто: ");
        String nazv=in.next();
        myCar2.setFirm(nazv);
        System.out.print("Введите гос. номер легкового авто: ");
        String nom=in.next(); //метод next() позволяет вводить строки, но без пробелов
        myCar2.setNumber(nom);
        System.out.print("Введите максимальную скорость легкового авто: ");
        int s=in.nextInt();
        myCar2.setMaxSpeed(s);
        System.out.print("Введите модель легкового авто: ");
        nazv=in.next();
        myCar2.setModel(nazv);
        System.out.print("Введите кол-во дверей легкового авто: ");
        s=in.nextInt();
        myCar2.setNumDoors(s);
        System.out.print("Введите признак полного привода легкового авто (true/false): ");
        Boolean f=in.nextBoolean();
        myCar2.setFullTime(f);


        System.out.println();
        System.out.println("Первый легковой автомобиль: "+myCar1.toString());
        System.out.println("Второй легковой автомобиль: "+myCar2.toString());
        Truck myTruck=new Truck();
        myTruck.setAllInfo();
        System.out.println(myTruck.toString());
    }
}
