import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой возраст");
        int voz = in.nextInt();
        int year = 2024 - voz;
        System.out.println("Вы родились в " + year + " году");
    }
}
