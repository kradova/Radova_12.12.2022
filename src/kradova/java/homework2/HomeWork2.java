package homework2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        Scanner in = new Scanner(System.in);


        /** TemperatureConversion */
        double c;
        double k;
        double f;

        ps.println("Введіть значення температури в градусах Цельсія:");
        c = in.nextDouble();
        k = c + 273.16;
        f = (9 * c / 5) + 32;

        ps.println(c + " C; " + f + " F; " + k + "K;");


        /** AreaOfTheTriangle */
        int k1 = 8;
        int k2 = 6;

        int s = (k1 * k2) / 2;

        ps.println("Площа трикутника = " + s);


        /** Parallelepiped */
        int x;
        int y;
        int z;

        ps.println("Введіть сторону 1:");
        x = in.nextInt();

        ps.println("Введіть сторону 2:");
        y = in.nextInt();

        ps.println("Введіть сторону 3:");
        z = in.nextInt();

        int volume = x * y * z;
        ps.println("Об'єм паралалепіпеда = " + volume);

        int length = x + y + z;
        ps.println("Сумарна довжина = " + length);
    }
}
