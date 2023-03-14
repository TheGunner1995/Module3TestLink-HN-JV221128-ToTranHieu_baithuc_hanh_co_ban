package rekkei.bai3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] num;
        num = new double[50];
        System.out.println("mảng số nguyên là : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Math.floor(Math.random()*100);
        }
        System.out.println(Arrays.toString(num));
        double min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min >= num[i]){
                min = num[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);
        double max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max <= num[i]){
                max = num[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là : " + max);
        System.out.println("Sắp xếp mảng tăng dần : ");
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
       int cout = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j == 0){
                    cout++;
                    break;
                }
            }
        }
        System.out.println("Số lần số nguyên tố xuất hiện trong mảng là " +(num.length - cout));
    }
}
