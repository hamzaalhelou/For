/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloops.example;

/**
 *
 * @author Omen
 */
public class Main {

    public static void main(String[] args){
        
        
    /*             
                      زياده او نقصان     شرط        هيئة 
        for( initialisation ; condition ; increment أو decrement )
{
    // statements
}
    
*/
   
        //0 20 +1
        //FIRST EXAMPLE: COUNT From 0 to 20
//
//       for(int i=0  ; i<=20 ; ++i){
//           System.out.println("I = "+i);
//        }

        //SECOND Exapmple: Count from 0 to 20 only even numbers    عدد زوجي
   
//       for(int i =0; i<=20; i += 2){
//           System.out.println("Even Number: "+i);
//        }

        //Third Exapmple: Count from 0 to 10 only odd numbers   عدد فردي

//        for(int i =1; i<=20; i += 2){
//            System.out.println("Odd Number: "+i);
//        }
     
        //Fourth Exapmple: Count from 10 to 0 :: Reverse

//        for(int i =10 ; i>=0; --i){
//            System.out.println("Number: " + i);
//         }
//
//        //Fifth Example: Break
//
//         for (int i =0 ; i < 10 ; i++) {
//             if (i == 5) {
//                 break;
//             }
//        
//             System.out.println("Value is: " + i);
//             
//         }

    

//        //Sixth Example: Continue 
         for (int i = 0; i < 10; i++) {
             if (i <= 5) {
                 continue;
             }
             System.out.println("Value is: " + i);
             
         }


// 
//        //Seventh Example: Mod %
//   
//         for (int i =0; i <= 20; i++) {
//             if (i % 2 == 0) {
//                 System.out.println("i: "+i);
//             }
//      }

   }
}
