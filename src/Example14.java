import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int inNum = in.nextInt();

        System.out.println((inNum - 1) + " " + inNum + " " + (inNum + 1) + " " + ( Math.pow((inNum * 3), 2)));
    }
}
