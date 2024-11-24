/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide9_Cat2 {
    static int i = 0;
    static int x = 5;
    public static void meth (Cat cat, int x){
        x = 100;
        cat.setName("Tarcin");
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Jerry");
        
        //int x = 5;
        meth(cat1, x);
        
        System.out.println(cat1.getName()+" "+x);
    }

}
