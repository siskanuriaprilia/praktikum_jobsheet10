import java.util.Scanner;

public class BioskopWithScanner27 {

    public static void main(String[] args) {

        Scanner input27 = new Scanner (System.in);
        int loop = 0;
        String nama, next;
        String[][] penonton = new String[4][2];

        loop = 0;
        while (loop == 0) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = input27.nextInt();
            input27.nextLine();

            switch (menu) 
            {
                case 1:
                    System.out.println("Masukkan nama penonton: ");
                    nama = input27.nextLine();
                break;

                case 2:
                        System.out.println("Daftar Penonton:");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 2; j++) 
                            {
                                if (penonton[i][j] == null) 
                                {
                                    System.out.print("*** ");
                                } 
                                else 
                                {
                                    System.out.print(penonton[i][j] + " ");
                                }
                            }
                            System.out.println();
                        }
                        break;
    
                    case 3:
                        System.out.println("Terima kasih. Program selesai.");
                        loop = 1;
                        break;
                    default:
                        System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
                }
    
                System.out.print("Lanjutkan? (y/n): ");
                next = sc.nextLine();
    
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }
    }
}

        

        