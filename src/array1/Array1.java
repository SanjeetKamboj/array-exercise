/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Scanner;

/**
 *
 * @author kamboj-s36
 */
public class Array1 {

   
    public static void main(String[] args) {
        
        Scanner scanInput = new Scanner(System.in);
        String input = scanInput.nextLine();
        String[] stringArray = input.split(" ");
        int arrayLength = stringArray.length;
        int[] intArray = new int[stringArray.length]; 
        int y = arrayLength;
        for(int i = 0;i < stringArray.length;i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        
        //printArray(intArray,arrayLength);
        System.out.println("Original array");
        for(int i = 0; i < arrayLength;i++ ){
            printArray(intArray,arrayLength,i);
            }
        
        System.out.println(" ");
        System.out.println("Reverse array");
        for(int r = arrayLength; r > 0;r-- ){
            
            y = y - 1;
            printArray(intArray,arrayLength,y);
            }
    }

   
    public static void printArray(int[] array, int length, int i){
        System.out.println((("Array"+(i+1) + " = " + array[i])));
    }
    }

