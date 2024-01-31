package mayin_tarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Mayın tarlasına hoşgeldiniz!");
		System.out.println("Lütfen oynamak istediğiniz boyutları giriniz..");
		System.out.println("Satır sayısı: ");
		row = scan.nextInt();
		System.out.println("Sütun sayısı: ");
		column = scan.nextInt();
		
		MineSweeper mayin = new MineSweeper(row, column);
		mayin.run();
		
	}

}
