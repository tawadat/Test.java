import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int m;
        int s;
        int count = 0;

        System.out.println("Ввод: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        n = Integer.parseInt(str.split(" ")[0]);
        m = Integer.parseInt(str.split(" ")[1]);
        s = Integer.parseInt(str.split(" ")[2]);

        count = setCounter(n, m);
        int a[] = new int[n];
        int b[] = new int[m];
        int a1 = 0;
        int b1 = 0;
        for (int i = 0; i < count; i++) {
            String z = scan.nextLine();
            try {
                a1 = Integer.parseInt(z.split(" ")[0]);
            } catch (NumberFormatException e) {
            }

            try {
                b1 = Integer.parseInt(z.split(" ")[1]);
            } catch (NumberFormatException e) {
            }


            if (a.length > i) {
                a[i] = a1;
            }
            if (b.length > i) {
                b[i] = b1;
            }
        }
        int[] result;
        result = merge(a, b);

        System.out.println();
        Arrays.sort(result);
        int count2 = 0;
        int sum = 0;
        for (int h = 0; h < result.length; h++) {
            if (sum < s) {
                sum = sum + result[h];
                count2++;
            }
        }
        if (sum > s) {
            System.out.println("Вывод: " + "\n" + (count2 - 1));

        } else System.out.println("Вывод:" + "\n" + count2);

    }

    private static int[] merge(int a[], int b[]) {
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

    private static int setCounter(int n, int m) {
        int c;
        if (n > m) c = n;
        else c = m;
        return c;
    }
}

