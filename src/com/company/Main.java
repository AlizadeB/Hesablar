package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil edin : ");
        int eded1 = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin : ");
        int eded2 = scanner.nextInt();
        System.out.print("Riyazi əməliyyatı seçin (+ - * / ) : ");
        String emeliyyat = scanner.next();
        double netice = 0;
        switch (emeliyyat) {
            case "+":
                netice = Emeliyyatlar.toplama(eded1, eded2);
                break;
            case "-":
                netice = Emeliyyatlar.cixma(eded1, eded2);
                break;
            case "*":
                netice = Emeliyyatlar.vurma(eded1, eded2);
                break;
            case "/":
                netice = Emeliyyatlar.bolme(eded1, eded2);
                break;
        }
        System.out.println("Nəticə=" + netice);
    }
}
