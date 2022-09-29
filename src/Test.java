import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        int m;
        int s;
        int count = 0;
        int i = 0;
        int a1, b1;
        System.out.println("enter the values n, m, s separated by a space");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        n = Integer.parseInt(str.split(" ")[0]);
        m = Integer.parseInt(str.split(" ")[1]);
        s = Integer.parseInt(str.split(" ")[2]);

        count = check(n, m);
        int a[] = new int[n];  // массив зарплат для первой стопки (сколько резюме, столько и элементов массива)
        int b[] = new int[m];  // массив зарплат для второй стопки (сколько резюме, столько и элементов массива)

        do {
            String z = scan.nextLine();
            a1 = Integer.parseInt(z.split(" ")[0]);
            b1 = Integer.parseInt(z.split(" ")[1]);
            a[i] = a1;
            b[i] = b1;
            i++;

        } while (i < count);

        int[] result;
        result = merge(a, b);

        System.out.println();
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        int count2 = 0;
        int sum = 0;
        for (int h = 0; h < result.length; h++) {
            if (sum <= s) {
                sum = sum + result[h];
                count2++;
            }
        }
        if (sum > s) {
            System.out.println(count2 - 1);
        } else System.out.println(count2);

    }

    public static int[] merge(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        return c;
    }

    public static int check(int n, int m) {
        int c;
        if (n > m) c = n;
        else c = m;
        return c;
    }
}