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
public interface StudentInterface {

    default String metodoInterface(String nome) {
      return "teste";
    }    
}
