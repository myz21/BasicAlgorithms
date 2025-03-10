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
public class Slide7_Merging {

    public static int mergeIntoC(int[] A, int sizeA, int[] B, int sizeB, int[] C) {
        int kA = 0;
        int kB = 0;
        int kC = 0;
        int mutualValue = -1;
        while (kA < sizeA && kB < sizeB) {
            if (A[kA] < B[kB]) {
                if(mutualValue != A[kA])
                 C[kC++] = A[kA++];
                 else
                    kA++;
            } else if (A[kA] > B[kB]) {
                if(mutualValue != B[kB])
                C[kC++] = B[kB++];
                else
                    kB++;
            } else {
                if(mutualValue != A[kA]){
                    mutualValue = A[kA];    
                    C[kC++] = B[kB++];
                    kA++;
                }
                else{
                    kA++;
                    kB++;
                }
                }
        }
        while (kA < sizeA) {
            C[kC++] = A[kA++];
        }
        while (kB < sizeB) {
            C[kC++] = B[kB++];
        }
        return kC;
    }
    public static void main(String[] args) {
        int [] A ={0,0,0-2,1,4,4,9,16,25}; 
        int [] B = {1,1,1,1,1,4,4,4,8,27,64,125,216};
        int sizeA = A.length;
        int sizeB = B.length;
        
        Arrays.sort(A);
        A = Arrays.copyOfRange(A, A.length-sizeA,A.length);
        System.out.println(Arrays.toString(A));
        
        Arrays.sort(B);
        B = Arrays.copyOfRange(B, B.length-sizeB,B.length);
        System.out.println(Arrays.toString(B));
        /*int [] C = new int [sizeA+sizeB];
        int c = mergeIntoC(A,sizeA,B,sizeB,C);
        C = Arrays.copyOfRange(C, 0, c);
        System.out.println(Arrays.toString(C));*/
        int [] D = new int[sizeA+sizeB];
        int d = mergeIntoD(A,sizeA,B,sizeB,D);
        D = Arrays.copyOfRange(D, 0, d);
        System.out.println(Arrays.toString(D));
      }
    public static int mergeIntoD(int[]A, int sizeA, int[]B, int sizeB,int[]D){
        int kA = 0;
        int kB = 0;
        int kD = 0;
        int repeatedVariable = -1;
        while(kA<sizeA && kB<sizeB){
            if (A[kA]<B[kB]) {
                if(repeatedVariable != A[kA])
                    D[kD++] = A[kA++];
                else
                    kA++;
                
            }
            else if(B[kB]<A[kA]){
                if(repeatedVariable != B[kB])
                     D[kD++] = B[kB++];
                else
                    kB++;
            }
            else{
               if(repeatedVariable != A[kA])
               {
               repeatedVariable = A[kA];
               D[kD++] = A[kA++];
               kB++; 
               }
               else
               {
               kB++;
               kA++;
               }
            }
        }
        while(kA<sizeA)
            D[kD++] = A[kA++];
        
        while(kB<sizeB)
            D[kD++] = B[kB++];
            
        return kD;
    }
} 
