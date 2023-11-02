import java.util.Scanner;

public class BioskopWithScanner27 {

    public static void main(String[] args) {

        Scanner input27 = new Scanner (System.in);
        int baris = 4,kolom = 2;
        String nama, next;
        String [][] penonton = new String[4][2];

        while (true) 
        {
            System.out.println("Masukkan nama: ");
            nama = input27.nextLine();
            System.out.println("Masukkan baris: ");
            baris = input27.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = input27.nextInt();
            input27.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = input27.nextLine();

            if (next.equalsIgnoreCase("n"))
            {
                break;
            }
        }        
    }
}
