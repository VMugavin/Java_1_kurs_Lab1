import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.nextLine();
        System.out.println("Введите свой год рождения");
        int year = in.nextInt();
        int voz = 2024 - year;
        System.out.println("Вы " + name + ", вам " + voz);
    }
}
