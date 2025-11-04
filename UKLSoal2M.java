import java.util.Scanner;

public class UKLSoal2M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        if (!input.hasNextInt()) {
            System.out.println("Input bukan bilangan bulat.");
            input.close();
            return;
        }
        int bil = input.nextInt();
        if (bil % 2 == 0) {
            System.out.println(bil + " adalah bilangan genap.");
        } else {
            System.out.println(bil + " adalah bilangan ganjil.");
        }
        input.close();
    }
   
    
}
