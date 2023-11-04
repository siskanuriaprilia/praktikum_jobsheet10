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
                if (penonton[baris - 1][kolom - 1] == null)
                { 
                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton telah diinput.");
                }
            }
            else
            {
                System.out.println("Kursi tersebut sudah terisi oleh penonton lain.");
            }
            {
                System.out.println("Nomor baris/kolom kursi tidak tersedia.");
            }
            break;
        case 2:
            System.out.println("Daftar penonton:");
            for(int i = 0; i < 4; i++)
            {
            for (int j = 0; j < 2; j++)
            {
                if(penonton[i][j] == null)
                {
                    System.out.println("*** ");
                }
                else
                {
                    System.out.println(penonton[i][j] + " ");
                }
            }
            System.out.println();
            }
            break;
        }
      }
    }
}

