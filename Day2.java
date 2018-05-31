/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Day2 {
    public static void main(String[] args){
        int n1=11;
        if (n1 % 2==0){
            System.out.println();
        }
         /*char pass ='K';
         switch(pass){
             case'A':
                 case'S':
                     case'O':
                         System.out.println("valid pass");
                         break;
                         default:
                             System.out.println("INVALID PASS");
                             break;
                             
         }
*/
         /*switch(10+20){
             case 10:
                 System.out.println("value is 10");
                 break;
             case 20:
                 System.out.println("VALUE IS 20");
                 break;
             case 30:
                 System.out.println(" VALUE IS 30");
                 break;
             default:
                 System.out.println("UNDEFINE ");
                 
                    
         }
*/
        /* String province ="ON";
          switch(province){
              case"ON":
           
                  System.out.println("Ontario");
                  break;
                  case"NV":
                      System.out.println("Nova Scotia");
                       break;
                  default:
                      System.out.println("Not VALID province ");
                      break;
                      
          }
*/
          /*n1 =20;
          while (n1>10){
             System.out.println("n1 :" +n1);
              n1--;
          }
          
          do{
              System.out.println("n1 :" +n1);
              n1--;
          } while(n1 > 10);
          
          /*int i=0;
          for(; i<5 ;i++){
              System.out.println("i : " +i);
          }
         */
           
          int i=0;
          for(i=1;i<=5; i++){
               if (i==3){
                   continue;
               
              }else{
                   System.out.println("i:" +i);
               }
          }
          
          for(i=1; i<=5; i++){
              for(int j=1; j<=i ;j++){
                  System.out.print("*");
              }
              System.out.println("");
          }
          
          for(i=1; i<=5; i++){
           for(int space=5; space>i ;space--){ 
               System.out.print(" ");
           } 
           for(int j=1; j<=i;j++){
               System.out.print("* ");
           }
            System.out.println("");
          
    }  
         
    }
    
}
