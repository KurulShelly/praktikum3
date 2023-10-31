import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        double luas = (alas * tinggi) / 2;

        System.out.println("Luas segitiga adalah: " + luas);

        input.close();
    }
}