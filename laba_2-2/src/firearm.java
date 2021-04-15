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



}