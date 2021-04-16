import java.util.Scanner;


// Базовый класс – оружие. Производные – огнестрельное и холодное.
// Создать класс ОружейнаяПалата, который может содержать оба вида объектов.
// Предусмотреть метод подсчета отдельно огнестрельного и холодного оружия
// (использовать оператор instanceof).

public class laba_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, ind;
        boolean o;
        boolean p = true;
        armory myArmory = new armory();
        while (p) {
            System.out.println("Огнестрельное? (true/false): ");
            o = in.nextBoolean();

            if (o) {
                System.out.println("Введите " + (++n) + " оружие: ");
                firearm myFire = new firearm();
                myFire.setAllInfoFire();
                myArmory.addWeapon(myFire);
                myArmory.weaponIndex(myFire);
            } else {
                System.out.println("Введите" + (++n) + "оружие: ");
                meleeWeapon myMelee = new meleeWeapon();
                myMelee.setAllInfoMelee();
                myArmory.addWeapon(myMelee);
                myArmory.weaponIndex(myMelee);
            }

            System.out.println("Добавить еще оружие? (true/false): ");
            p = in.nextBoolean();
        }
        myArmory.printArmory();
    }
}
