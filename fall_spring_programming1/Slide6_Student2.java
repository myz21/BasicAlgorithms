/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide6_Student2 {
   public static void swapObj (Slide6_Student st1, Slide6_Student st2){
    Slide6_Student temp;
    temp = st1;
    st1 = st2;
    st2 = temp; 
}
   public static void changeName(Slide6_Student st, String name) {
       st.name = name;
   }
   public static void main(String[] args) { 
       Slide6_Student mySt1 = new Slide6_Student(101, "Muhammed");
       Slide6_Student mySt2 = new Slide6_Student(500, "Filiz"); 
      /*changeName(mySt2, "Eda"); 
       System.out.println(mySt2.name);*/
        swapObj(mySt1, mySt2); 
        System.out.println(mySt1.name);
}
}