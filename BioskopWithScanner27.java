import java.util.Scanner;

public class BioskopWithScanner27 {

    public static void main(String[] args) {

        Scanner input27 = new Scanner (System.in);
        int baris,kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3)");
            int menu = input27.nextInt();
            input27.nextLine();     
        
        switch(menu){
        case 1:
            System.out.println("Masukkan nama: ");
            nama = input27.nextLine();
            System.out.println("Masukkan Baris: ");
            baris = input27.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = input27.nextInt();
            input27.nextLine();

            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <=2)
            {
                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton telah diinput.");
            }
            else
            {
                System.out.println("Nomor baris/kolom kursi tidak tersedia.");
            }
            break;
        }
      }
   }
}

