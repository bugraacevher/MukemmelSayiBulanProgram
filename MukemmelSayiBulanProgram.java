package Giris;

import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    //mukemmel sayi = bir sayinin kendisi haric pozitif tam sayi carpanlari(kalansiz bolen sayilarin) toplami kendisine esit olan sayi mukemmel sayidir
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayi giriniz : ");
        int a = input.nextInt();

        int toplam = 0 ;

        for (int i= 1; i < a ;i++){
            while(a % i == 0) {
                toplam += i;
                break;
            }
        }
        if ( toplam == a) {
            System.out.println(a + " muko sayi");
        }else{
            System.out.println(a + " muko degil");
        }
    }
}
