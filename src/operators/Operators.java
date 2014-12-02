/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author marieleger
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      integerTest();
//      mathTest();
      incrementAndModulus();
      compoundAssignmentTest();
      toggleValue();
    }

    //<editor-fold defaultstate="collapsed" desc="Integer Test">
    private static void integerTest() {
        int radius = 2 ;
        double pi = 3.142592653;
        double d;
        int i;
        
        
        d =pi ;
        System.out.println("d = " + d);
        
        d = radius;
        System.out.println("d = " + d);
        
        
        i = (int) pi;
        System.out.println("i =" + i);
    }
//</editor-fold>

    private static void mathTest() {
       
        int i = 10;
        int n = i++%5;
        System.out.println("n = " + n);
        System.out.println("i = " + i);
        
        i = 10;
        int m = ++i%5;
        System.out.println("m = " +m);
        System.out.println("i =" + i);
      
    }
    
   
    public static void incrementAndModulus () {
        
         int i = 10;
        int n = i++%5;
        System.out.println("n = " + n);
        System.out.println("i = " + i);
        
        i = 10;
        int m = ++i%5;
        System.out.println("m = " +m);
        System.out.println("i =" + i);
      
        
    }
public static void compoundAssignmentTest(){
     int result = 1+2;

     System.out.println(result);
     
     result = result - 1;
     System.out.println(result);
     
     result = result *2 ; 
     System.out.println(result);
     
       result = result /2 ; 
     System.out.println(result);
     
       result = result +8; 
     result = result % 7;
        System.out.println(result);
     
 }
   
  public static boolean toggleValue (boolean myValue)  {
}
}