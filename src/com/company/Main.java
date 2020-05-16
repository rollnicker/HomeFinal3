package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Введите вашу сумму в рублях: ");
	float rub = scan.nextFloat();
	System.out.print("Введите текущий курс доллара через запятую: ");
	float dol = scan.nextFloat();
	float conv = (rub / dol);
        System.out.printf("%.2f", conv);
    }
}
