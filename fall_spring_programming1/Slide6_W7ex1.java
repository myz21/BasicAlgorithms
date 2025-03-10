
package fall_spring_113;
public class Slide6_W7ex1 {
    static Slide6_Student st1 = new Slide6_Student(101, "Ahmet");
   public static void swapObj (Slide6_Student st2){
    Slide6_Student temp;
    temp = st1;
    st1 = st2;
    st2 = temp; 
}
    
    public static void changeName(Slide6_Student st, String name){
        st.name = name;
    }
    
    public static void main(String[] args) {
        //Student mySt1 = new Student(101, "Muhammed");
        Slide6_Student mySt2 = new Slide6_Student(500, "Filiz");     
        /*changeName(mySt2, "Eda");
        System.out.println(mySt2.name);*/
        
        swapObj(mySt2);
        System.out.println(st1.name);
        System.out.println(mySt2.name);
    }
}
