import java.util.*;


public class Main {

    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        //Въвеждане на число от клавиатурата

        System.out.print("Въведете число:");
        Scanner sc = new Scanner(System.in);
        int argument = sc.nextInt();

        //Извиква се метода за повдигане на квадрат

        int number = square(argument);

        //Печат на резултата

        System.out.println();
        System.out.println(number);
    }
}
