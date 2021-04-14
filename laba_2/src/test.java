import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Auto myAuto1=new Auto(); //создаем объект типа нашего класса
        Scanner in = new Scanner(System.in); //создаем сканер для ввода данных из консоли
        System.out.print("Введите фирму: ");
        String nazv=in.next(); //считываем название из консоли !!!только 1 слово
//т.к. in.next() считывает только символы до пробела, остальные символы отправляет
//следующему оператору, связанному с консольным вводом
        myAuto1.setFirm(nazv); //задаем значение для параметра нашего класса
        System.out.print("Введите максимальную скорость: ");
        int s=in.nextInt();
        myAuto1.setMaxSpeed(s);
        System.out.println(myAuto1.getFirm()+" "+myAuto1.getMaxSpeed());
    }
}
