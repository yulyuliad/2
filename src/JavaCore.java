import java.util.Scanner;

public class JavaCore {

    public static void main(String[] args) {
       HelloName();
    }

    public static void reverseArgumements() {
        char[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Type args: ");
        String name = in.nextLine();
        a = name.toCharArray();
        for (int i = name.length() - 1; i > -1; i--) {
            System.out.println(a[i]);
        }
    }

    public static void HelloName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void randomNumbers() {
        char[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Type numbers: ");
        String name = in.nextLine();
        a = name.toCharArray();
        System.out.println(a);
        for (int i = 0; i < name.length(); i++) {
            System.out.println(a[i]);
        }
    }

    public static void Password() {
        String password = "pas1";
        Scanner in = new Scanner(System.in);
        System.out.print("Type password: ");
        String name = in.nextLine();
        if (name.equals(password)) System.out.println("Password is correct");
        else System.out.println("Password isn't correct");
    }

    public static void Numbers() {
        String[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Type numbers: ");
        String name = in.nextLine();
        a = name.split(" ");
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < a.length; i++) {
            sum += Integer.parseInt(a[i]);
            mult *= Integer.parseInt(a[i]);
        }
        System.out.println(sum);
        System.out.println(mult);
    }

    public static void Number() {
        String[] a;
        String chet = "";
        String nechet = "";
        String stroka;
        int max = 0, min = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Type numbers: ");
        String name = in.nextLine();
        a = name.split(" ");
        max = Integer.parseInt(a[0]);
        min = Integer.parseInt(a[0]);
        for (
                int i = 0;
                i < a.length; i++)

        {
            if (Integer.parseInt(a[i]) % 2 == 0)
                chet += a[i] + " ";
            else
                nechet += a[i] + " ";
            if (min > Integer.parseInt(a[i])) min = Integer.parseInt(a[i]);
            if (max < Integer.parseInt(a[i])) max = Integer.parseInt(a[i]);
            if (Integer.parseInt(a[i]) % 3 == 0 || Integer.parseInt(a[i]) % 9 == 0)
                System.out.println("Делятся на 3 или 9: " + a[i] + " ");
            if (Integer.parseInt(a[i]) % 5 == 0 && Integer.parseInt(a[i]) % 7 == 0)
                System.out.println("Делятся на 5 или 7: " + a[i] + " ");
            if (Integer.parseInt(a[i]) > 99 && Integer.parseInt(a[i]) < 1000) {
                stroka = a[i];
                if ((stroka.charAt(2) != stroka.charAt(1)) && (stroka.charAt(2) != stroka.charAt(0)) && (stroka.charAt(1) != stroka.charAt(0)))
                    System.out.println("3-значные с разными цифрами: " + a[i]);
            }
        }
        System.out.println("Четные: " + chet);
        System.out.println("Нечетные: " + nechet);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

    public static void LuckyNumbers() {
        String[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Type numbers: ");
        String name = in.nextLine();
        int sum1 = 0;
        int sum2 = 0;

        if (name.length() % 2 == 0) {
            for (int i = 0; i < name.length(); i++) {
                if (i < name.length() / 2)
                    sum1 += Character.getNumericValue(name.charAt(i));
                else
                    sum2 += Character.getNumericValue((name.charAt(i)));

            }
            if (sum1 == sum2)
                System.out.println("Lucky number");
            else
                System.out.println("Not lucky number");
        } else
            System.out.println("it's incorrect. Type another number");
    }
}