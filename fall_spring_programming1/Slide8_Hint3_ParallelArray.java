/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide8_Hint3_ParallelArray {
    public static void main(String[] args){
        char [][]studentAnswers ={
                {'A','B','C','D','E'},
                {'E','B','C','C','E'},
                {'B','E','C','D','E'},
                {'A','B','A','D','E'}
                };
        char [] key = {'A','B','A','D','E'};
        System.out.println(studentPoint(studentAnswers[3],key));
    }
    public static int studentPoint(char []studentAnswer, char[]key){
        int count = 0;
        int j = 0;
        for(char i : key){
            if (i == studentAnswer[j++]) {
                count++;
            }
        }
        return count;
    }
}
