/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_TowerOfHanoiRecursion {
    public static void move (int n, char fromTower, char toTower, char auxTower){
        if (n==1) {
            System.out.printf("Move disc %d from %c to %c tower.\n",n,fromTower,toTower);
        }
        else {
            move(n-1,fromTower,auxTower,toTower);
            System.out.printf("Move disc %d from %c to %c tower.\n",n,fromTower,toTower);
            move(n-1,auxTower,toTower,fromTower);
        }
       }
    public static void main(String[] args) {
        char from = 'a';
        char to = 'b';
        char aux = 'c';
        int n = 3;
        System.out.println("For 3 disc, the moves are: ");
        move(3, from, to ,aux);
    }
}
