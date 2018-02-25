public class Others {
    public static void summation() {
        int sum = 0;
        int nums[][] = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
        {

        }
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("Value is:" + y);
                sum += y;
            }
        }
        System.out.println("Summation:" + sum);
    }

    public static void lenght() {
        int[][] a = {{1, 2, 3},
                {4, 5, 6}};
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);
            }
        }

    }
    //чтение символа из потока System.in//
    public static void ReadCharRunner() {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Код символа: " + c + "=" + x);
        } catch (java.io.IOException e) {
            System.err.println("ошибка ввода" + e);
        }
    }
    public static void Array() {
        int a[][] = new int[4][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                a[i][j] = k; //заполнения массива значением из переменной к
                k++;
            }
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                System.out.println(a[i][j]);
            }
    }
}
