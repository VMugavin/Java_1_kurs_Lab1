import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий день недели ");
        String day = in.nextLine();
        System.out.println("Введите месяц ");
        String month = in.nextLine();
        System.out.println("Введите номер дня в месяце ");
        int dayNum = in.nextInt();
        System.out.println("Сегодня " + day + " " + dayNum + " " + month);
    }
}
