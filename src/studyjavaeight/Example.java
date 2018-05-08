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
public interface Example {

   String getName(String s );     
   
   default void imprimirNome(String nome) {
     System.out.println(nome);
   }
}
