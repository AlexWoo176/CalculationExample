package codegym;

import java.util.Scanner;

public class CalculationExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Hay nhap y: ");
        int y = scanner.nextInt();

        CalculationExample calcu = new CalculationExample();
        calcu.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }
        catch (Exception ex)
        {
            System.out.println("Xay ra ngoai le: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
