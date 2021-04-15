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

    public firearm(String number  , String country,  Boolean s, String typ, String mod, int size) {
        super(number, country, s);
        Type = typ;
        Model = mod;
        MagazineSize = size;
    }

   public void setType(String typ){
        Type=typ;
   }

   public String getType(){
        return Type;
   }

    public void setModel(String mod){
        Model=mod;
    }

    public String getModel(){
        return Model;
    }

    public void setMagazineSize(int size){
        MagazineSize=size;
    }

    public int getMagazineSize(){
        return MagazineSize;
    }

    public void setAllInfo() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите страну-производитель огнестрельного оружия: ");
        String stran = in.next(); //метод next() позволяет вводить строки, но без пробелов
        setProducerCountry(stran);
        System.out.print("Введите тип огнестрельного оружия: ");
        String tip = in.next(); //метод next() позволяет вводить строки, но без пробелов
        System.out.print("Введите модель огнестрельного оружия: ");
        String mo = in.next();
        System.out.print("Серийный номер: ");
        String ser= in.next();
        setSerialNumber(ser);
        System.out.print("Находится ли это оружие на вооружении? (true/false): ");
        boolean v = in.nextBoolean();
        setInService(v);
        System.out.print("Введите размер магазина: ");
        MagazineSize = in.nextInt();
        System.out.println();
    }
}