/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class dailytask {
    public static void main(String[] args){
        
        day3 day = new day3();
        day.num1 =20;
        System.out.println("num 1:" + day.num1);
        day.addition();
        
        //23+45
      day.addition(23,45);
      //23+45
        System.out.println("Addition"+day.addition(20, 30));
        
         float fsum =day.addition(123.45f,12.12f);
         System.out.println("flaot sum =" +fsum);
         
         
         int numbers[] ={1,5,2,3,4};
            day.additon(numbers);
            
            
    }
            
    
}
