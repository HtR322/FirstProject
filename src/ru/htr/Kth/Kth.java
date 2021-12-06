package ru.htr.Kth;

import java.util.Scanner;
import ru.htr.Kth.KthOper;

public class Kth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();
        System.out.println("k = " + k);
        var Kthoper = new KthOper();
        int res = Kthoper.GetDigit(k);
        System.out.println(res);
    }
}
