/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.scribbler;

/**+
 *
 * @author NJABULO
 */
public class SCRIBBLER {
    public static void main(String[] args) {
    int []numbers = {12,4,0,18,7,12};
    int count = 0;
    int total = 0;
    int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==12){
                System.out.println("On index "+i+" 12 Was found");
                count++;//Counts how many times 12 appears.
                sum +=numbers[i];//Calculates the sum of only the numbers equal to 12.
            }else{
                System.out.println("On index "+i+" 12 Was not found");
            }
            total += numbers[i];//Calculates the sum of every number in the array.
        }
        System.out.println("The number of twelves repeated is: "+ count); 
        System.out.println("The total number of arrays is: "+ total);
        System.out.println("The sum of twelves is: "+sum);
       }
   }
 

