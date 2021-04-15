import java.util.ArrayList;
import java.util.Scanner;


public class armory {
    private ArrayList<weapon> masWeapon = new ArrayList<weapon>();//массив с оружием

    public void addCar(weapon m) {//метод для добавления
        masWeapon.add(m);
    }

    public armory() {
    }

    public Boolean findWeapon(weapon m) { //для выяснения – есть ли машина m в гараже
        return masWeapon.contains(m);
    }

    public armory(ArrayList<weapon> n) {//конструктор для внесения существующего списка машин
//в гараж
        masWeapon = n;
    }

    public void printArmory() { //для вывода на экран списка машин в гараже
        System.out.println("В оружейной: ");
        for (weapon a : masWeapon) { //
            System.out.println("\t" + a.toString());
        }
    }

    public void instofArmory() {
        System.out.println("Проверка оружия на принадлежность");

        for (weapon i : masWeapon) {
          //  Scanner in = new Scanner(System.in);

            if (i instanceof firearm) {
                System.out.println("Это огнестрельное оружие");
            } else {
                System.out.println("Это холодное оружие");
            }
        }
    }

    public void remArmory(weapon r) {
        masWeapon.remove(r);

    }
}