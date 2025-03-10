/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;
import java.util.Scanner;
/**
 *
 * @author zer3
 */
public class LabGuide3_Q3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //a b c d icin deger ata 5,10 vs
        int a = 5, b = 5, c = 10;
        // İki boolean değeri seç
        System.out.print("Ilk boolean degerini seçin (x (a == b) "
                + "veya y (c > b) veya z (c < b) veya t (a != b)): ");
        char firstBooleanChar = scanner.next().charAt(0);
        System.out.print("Ikinci boolean degerini seçin (x veya y veya z veya t): ");
        char secondBooleanChar = scanner.next().charAt(0);

        // İşlem seçimi
        System.out.print("Kullanmak istediğiniz işlemi seçin (& veya | veya ^): ");
        char operation = scanner.next().charAt(0);
        
        boolean x = a == b;
        boolean y = c > b;
        boolean z = c < b;
        boolean t = a != b;
        
        // Seçilen boolean değerlerine göre değerleri atama
        boolean firstBoolean, secondBoolean;
        switch(firstBooleanChar) {
            case 'x':
                firstBoolean = x;
                break;
            case 'y':
                firstBoolean = y;
                break;
            case 'z':
                firstBoolean = z;
                break;
            case 't':
                firstBoolean = t;
                break;
            default:
                System.out.println("Geçersiz boolean değeri seçimi!");
                return;
        }
        switch(secondBooleanChar) {
             case 'x':
                secondBoolean = x;
                break;
            case 'y':
                secondBoolean = y;
                break;
            case 'z':
                secondBoolean = z;
                break;
            case 't':
                secondBoolean = t;
                break;
            default:
                System.out.println("Geçersiz boolean değeri seçimi!");
                return;
        }

        // Sonucu hesapla
        boolean result;
        switch(operation) {
            case '&':
                result = firstBoolean && secondBoolean;
                break;
            case '|':
                result = firstBoolean || secondBoolean;
                break;
            case '^':
                result = (firstBoolean ^ secondBoolean);
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
                return;
        }

        // Sonucu yazdır
        System.out.println("Sonuç: " + (result ? 1 : 0));
    }
}

