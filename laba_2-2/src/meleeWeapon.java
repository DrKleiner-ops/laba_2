import java.util.Scanner;
/**
 * Класс Холодное орудие -базовый класс для объектов транспорта
 * @since 1.0
 * @version realise
 * @author Климшин В.И.*/
public class meleeWeapon extends weapon {
    /**Поле для хранения Размера холодного оружия */
    private int Size;
    /**Поле для хранения Вида холоднрого оружия */
    private String Vid;
    private int Weight;


    public meleeWeapon() {
        super();
        Size = 0;
        Vid = " ";
        Weight = 0;
    }

    public meleeWeapon(String number, String country, Boolean s, int dli, String vid, int ves) {
        super(number, country, s);
        Size = dli;
        Vid = vid;
        Weight = ves;
    }
    /**
     *  Устанавливает значение поля {@link meleeWeapon#Size}
     *  @param dli -Длина холодного оружия */
    public void setSize(int dli) {
        Size = dli;
    }
    /**
     *  Возвращает значение поля {@link meleeWeapon#Size}
     *  @return  целое значение длины оружия */
    public int getSize() {
        return Size;
    }
    /**
     *  Устанавливает значение поля {@link meleeWeapon#Weight}
     *  @param ves -Вес холодного оружия */
    public void setWeight(int ves) {
        Weight = ves;
    }
    /**
     *  Возвращает значение поля {@link meleeWeapon#Weight}
     *  @return  целое значение веса оружия */
    public int getWeight() {
        return Weight;
    }
    /**
     *  Устанавливает значение поля {@link meleeWeapon#Vid}
     *  @param vid -Вид холодного оружия */
    public void setVid(String vid) {
        Vid = vid;
    }
    /**
     *  Возвращает значение поля {@link meleeWeapon#Vid}
     *  @return  строку вида оружия */
    public String getVid() {
        return Vid;
    }

    /**
     *  Устанавливает все занияния для класса Холодное оружие из класса Оружие и класса Холодное оружие: 
     * @see weapon#setSerialNumber(String) 
     * @see weapon#setInService(boolean) 
     * @see weapon#setProducerCountry(String)
     * @see meleeWeapon#setSize(int) 
     * @see meleeWeapon#setVid(String) 
     * @see meleeWeapon#setWeight(int) */

    public void setAllInfoMelee() {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите страну-производитель холодного оружия: ");
        String strana = in.next(); //метод next() позволяет вводить строки, но без пробелов
        setProducerCountry(strana);

        System.out.print("Введите вес холодного оружия: ");
        Weight = in.nextInt(); //метод next() позволяет вводить строки, но без пробелов

        System.out.print("Введите вид холодного оружия: ");
        Vid = in.next();

        System.out.print("Серийный номер: ");
        String ser = in.next();
        setSerialNumber(ser);

        System.out.print("Введите размер холодного оружия: ");
        Size = in.nextInt();

        System.out.print("Находится ли это оружие на вооружении? (true/false): ");
        boolean v = in.nextBoolean();
        setInService(v);
        System.out.println();
    }

    public String toString() {
        return "\n\tХолодное оружие" + "\n\t" + "Страна производитель: " + getProducerCountry() + "\n\t" + "Серийный номер: "
                + getSerialNumber() + "\n\t" + "Вид холодного оружия: "
                + Vid + "\n\t" + "Размер: " + Size + "\n\t" + "Вес: " + Weight + "\n\t" + "Находится ли на вооружении: "
                + getInService() + "\n";
    }

}
