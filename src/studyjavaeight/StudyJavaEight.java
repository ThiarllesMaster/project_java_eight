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
public class StudyJavaEight {

    public interface Num {
      double getValue();
    }
   
    public static void main(String[] args) {
       Num n;
       n=()->33.11;
       System.out.println(n.getValue()); 
    }
    
}
