import java.util.Scanner;

public class meleeWeapon extends weapon{
    private int Size;
    private String Vid;
    private int Weight;



    public meleeWeapon() {
        super();
        Size = 0;
        Vid = " ";
        Weight = 0;
    }

    public meleeWeapon(String number  , String country,  Boolean s, int dli, String vid, int ves) {
        super(number, country, s);
        Size = dli;
        Vid = vid;
        Weight = ves;
    }

    public void setSize(int dli){
        Size=dli;
    }

    public int getSize(){
        return Size;
    }

    public void setWeight(int ves){
        Weight = ves;
    }

    public int getWeight(){
        return Weight;
    }

    public void setVid(String vid){
        Vid=vid;
    }

    public String getVid(){
        return Vid;
    }

    public void setAllInfo() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите страну-производитель холодного оружия: ");
        String strana = in.next(); //метод next() позволяет вводить строки, но без пробелов
        setProducerCountry(strana);
        System.out.print("Введите вес холодного оружия: ");
        Weight = in.nextInt(); //метод next() позволяет вводить строки, но без пробелов
        System.out.print("Введите вид холодного оружия: ");
        Vid = in.next();
        System.out.print("Серийный номер: ");
        String ser= in.next();
        setSerialNumber(ser);
        System.out.print("Находится ли это оружие на вооружении? (true/false): ");
        boolean v = in.nextBoolean();
        setInService(v);
        System.out.print("Введите размер холодного оружия: ");
        Size = in.nextInt();
        System.out.println();
    }

    public String toString() {
        return "\n\tХолодное оружие" + "\n\t" + "Страна производитель: " + getProducerCountry() + "\n\t" + "Серийный номер: "
                + getSerialNumber() + "\n\t" + "Вид холодного оружия: "
                + Vid + "\n\t" + "Размер: " + Size + "\n\t" + "Вес: " + Weight + "\n\t" + "Находится ли на вооружении: "
                + getInService() + "\n";
    }

}
