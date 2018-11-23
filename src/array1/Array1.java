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
        int index = 0;
        int arrayLength;
        int[] intArray; 
        int arrayActualLength;
        int y;
        String stringIndex;
        
        
        System.out.println("Enter array. Use spacebar to seperate numbers:");
        Scanner scanInput = new Scanner(System.in);
        String input = scanInput.nextLine();
        
        //System.out.println("Array length =" + arrayLength);
        String[] stringArray = input.split(" ");
        arrayActualLength = stringArray.length;
        intArray = new int[stringArray.length]; 
        
        System.out.println("Actual length =  " + arrayActualLength );
        System.out.println("");
        System.out.println("Enter the length of array: ");
        String stringLengthInput = scanInput.nextLine();
        arrayLength = Integer.parseInt(stringLengthInput);
        //y = arrayLength;
        
        for(int i = 0;i < stringArray.length;i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }// end for
        
        //printArray(intArray,arrayLength);
//        System.out.println("Original array");
//        for(int i = 0; i < arrayLength;i++ ){
//            printArray(intArray,arrayLength,i);
//            }
//        
//        System.out.println(" ");
//        System.out.println("Reverse array");
//        for(int r = arrayLength; r > 0;r-- ){
//            //System.out.println("R = " + r);
//            printArray(intArray,arrayLength,r-1);
//            }
        
        while (index > -1){
    
        System.out.println("  ");    
        System.out.println("Enter index : ");
        stringIndex = scanInput.nextLine();
        index = Integer.parseInt(stringIndex);
        //System.out.println("Current index = "+ index);
        
        if (index > 0 && index < arrayLength+1){
            printArray(intArray, arrayLength, index-1);
        }// end if
        else  {//System.out.println("Program Stoped because you entered "+ index + ",a number that is less than 0...");
              System.out.print("Index "+ index+ " does not exist, you played your self...");
        }// end else
         }// end while
        System.out.print("program ended");
          }// end main

    public static void printArray(int[] array, int length, int i){
        System.out.println((("Array"+(i+1) + " = " + array[i])));
    }// end printArray
     }// end class

