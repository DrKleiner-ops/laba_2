import java.util.Scanner;



// Базовый класс – оружие. Производные – огнестрельное и холодное.
    // Создать класс ОружейнаяПалата, который может содержать оба вида объектов.
    // Предусмотреть метод подсчета отдельно огнестрельного и холодного оружия
    // (использовать оператор instanceof).

public class laba_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько оружия вы хотите добавить?:");
        int n, mas[];
        n=in.nextInt();
        mas = new int[n];
        for (n=0; n< mas.length; n++){
            System.out.println("Введите"+ (n+1)+ "оружие: ");

        }

    }
}
