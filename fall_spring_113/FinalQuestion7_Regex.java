/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

import java.util.Arrays;

/**
 *
 * @author zer3
 */
public class FinalQuestion7_Regex {
    public static void main(String[] args) {
        String strs[] = "AA1/b*eU".split("[^a-zA-Z]");
        String str = strs[3];
        System.out.println(Arrays.toString(strs));
        StringBuilder sb = new StringBuilder(str);
        if (str == sb.toString()){
            sb.reverse();
            str.concat(sb.toString());
            System.out.println(str);
        }
        else{
            sb.append(str.concat("AYBU"));
            System.out.println(sb);
        }
    }
}
