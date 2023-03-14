package rekkei.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương bạn muốn tính ");
        int n = scanner.nextInt();
        if (n>=0){
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                if (i%2 == 0){
                    sum += i;
                }
            }
            System.out.println("tổng các số chẵn từ 0 - số bạn nhập là : " +sum);
        }else {
            System.out.println("Số bạn nhập không phải là số nguyên dương");
        }
    }
}
