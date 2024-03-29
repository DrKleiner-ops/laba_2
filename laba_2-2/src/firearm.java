import java.util.Scanner;

public class firearm extends weapon {
    private String Type;
    private String Model;
    private int MagazineSize;


    public firearm() {
        super();
        Type = " ";
        Model = " ";
        MagazineSize = 0;
    }

    public firearm(String number, String country, Boolean s, String typ, String mod, int size) {
        super(number, country, s);
        Type = typ;
        Model = mod;
        MagazineSize = size;
    }

    public void setType(String typ) {
        Type = typ;
    }

    public String getType() {
        return Type;
    }

    public void setModel(String mod) {
        Model = mod;
    }

    public String getModel() {
        return Model;
    }

    public void setMagazineSize(int size) {
        MagazineSize = size;
    }

    public int getMagazineSize() {
        return MagazineSize;
    }

    public void setAllInfoFire() {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите страну-производитель огнестрельного оружия: ");
        String stran = in.next(); //метод next() позволяет вводить строки, но без пробелов
        setProducerCountry(stran);

        System.out.print("Введите тип огнестрельного оружия: ");
        Type = in.next(); //метод next() позволяет вводить строки, но без пробелов

        System.out.print("Введите модель огнестрельного оружия: ");
        Model = in.next();

        System.out.print("Серийный номер: ");
        String ser = in.next();
        setSerialNumber(ser);

        System.out.print("Введите размер магазина: ");
        MagazineSize = in.nextInt();

        System.out.print("Находится ли это оружие на вооружении? (true/false): ");
        boolean v = in.nextBoolean();
        setInService(v);

        System.out.println();
    }

    public String toString() {
        return "\n\tОгнестрельное оружие" + "\n\t" + "Страна производитель: " + getProducerCountry() + "\n\t" + "Тип оружия: " + Type + "\n\t" + "Серийный номер: "
                + getSerialNumber() + "\n\t" + "Модель: " + Model + "\n\t" + "Размер магазина: " + MagazineSize + "\n\t" + "Находится ли на вооружении: "
                + getInService() + "\n";
    }

}