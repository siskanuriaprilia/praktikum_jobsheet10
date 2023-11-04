import java.util.Scanner;

public class BioskopWithScanner27 {

    public static void main(String[] args) {

        Scanner input27 = new Scanner (System.in);
        int loop = 0;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (loop != 3) {
            System.out.println("Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih menu (1/2/3)");
            int menu = input27.nextInt();
            input27.nextLine();
        }
    }
}