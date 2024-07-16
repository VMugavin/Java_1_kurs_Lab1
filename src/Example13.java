import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int frstNum = in.nextInt();
        System.out.println("Введите второе число");
        int scndNum = in.nextInt();
        System.out.println("Сумма = " + (frstNum + scndNum));
    }
}
