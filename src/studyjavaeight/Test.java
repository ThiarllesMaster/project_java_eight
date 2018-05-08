/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjavaeight;

/**
 *
 * @author thiarlles.gomes
 */
public class Test {
  
    public static void main (String [] args ) {
      Example e = (String p)->  p ;
      System.out.println(e.getName("Teste"));
      
      Example ex = new ExampleClass();
      ex.imprimirNome("Thiarlles");
    }
    
}
