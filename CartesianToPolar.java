import java.util.Scanner;

public class CartesianToPolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble();

        System.out.println(Math.atan2(a, b));
    }
}
