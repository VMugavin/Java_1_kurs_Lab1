import java.util.Scanner;

public class Example6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String famil = in.nextLine(); ;
        System.out.println("Введите имя: ");
        String name = in.nextLine();;
        System.out.println("Введите отчество: ");
        String otch = in.nextLine();;
        System.out.println("Hello " + famil + " " + name + " " + otch);
    }
}
