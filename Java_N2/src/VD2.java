import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class VD2 {

	public static void main(String[] args) {
		String[] ten = {"Kiet", "Phuc", "Vu", "Toan", "Nghia"};
		String[] ho = {"Pham", "Nguyen", "Ho", "Le"};
		String[] chulot = {"Ngoc", "Van" , "Duc", "Dang"};
		System.out.println("Nhap n= ");
		Scanner nhap = new Scanner(System.in);
		String tamn = nhap.nextLine();
		int n = Integer.parseInt(tamn);
		for (int i = 0; i < n; i++) {
			Random r = new Random();
			String t = ten[r.nextInt(ten.length)];
			String h = ho[r.nextInt(ho.length)];
			String cl = chulot[r.nextInt(chulot.length)];
			System.out.println(i+1 + ". " + h + " " + cl+ " " + t);
			System.out.println("-------------");
//		for (String gt : ten)
//			System.out.println(gt);
		}
	}

}
