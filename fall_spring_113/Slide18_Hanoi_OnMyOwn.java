/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_Hanoi_OnMyOwn {

    public static void hanoiTower(int discCount, char fromTower, char toTower, char auxTower) {
        //if else yazmadım
        if (discCount == 1) {
            System.out.printf("%d th disc carried from tower %c to %c.\n", discCount, fromTower, toTower);
        } else {
            //pseudocode'i yazabildim ama normal kodu yazamadım.
            hanoiTower(discCount - 1, fromTower, auxTower, toTower);
            System.out.printf("%d th disc carried from tower %c to %c.\n", discCount, fromTower, toTower);
            hanoiTower(discCount - 1, auxTower, toTower, fromTower);
            // \n yazmayı unutmusum
        }
    }
    public static void main(String[] args) {
        hanoiTower(3,'A','B','C');
    }
}
