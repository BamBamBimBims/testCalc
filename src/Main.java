import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] num = line.split(" ");
        String num1 = num[0];
        String x = num[1];              // Оператор
        String num2 = num[2];
        boolean res1 = line.equals(num1 + " " + x + " " + num2);
        boolean res2 = line.contains(".");
        if (!(res1) || (res2)) {
            throw new FileNotFoundException("throws Exception");
        }
        int a = Integer.parseInt(num1); // Первый операнд
        int c = Integer.parseInt(num2); // Второй операнд
        if ((a > 10) || (a < 1) || (c > 10) || (c < 1)) {
            throw new FileNotFoundException("throws Exception");
        }
        switch (x) {
            case "+":
                System.out.println(a + c);
                break;
            case "-":
                System.out.println(a - c);
                break;
            case "*":
                System.out.println(a * c);
                break;
            case "/":
                System.out.println(a / c);
                break;
            default:
                throw new FileNotFoundException("throws Exception");
        } sc.close();
    }
}