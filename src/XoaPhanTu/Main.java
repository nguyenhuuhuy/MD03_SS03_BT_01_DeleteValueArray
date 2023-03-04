package XoaPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size, i, x;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int A[] = new int[size];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();

        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo c = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1
        for (x = i = 0; i < size; i++) {
            if (A[i] != k) {
                A[x] = A[i];
                x++;
            }
        }

        size = x;  // lúc này số phần tử trong mảng sẽ bằng c

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
