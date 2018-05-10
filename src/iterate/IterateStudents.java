/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterate;

import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author thiarlles.gomes
 */
public class IterateStudents {

   public static void main (String args[]) {
       Student studentOne = new Student();
       studentOne.setAgeStudent(36);
       studentOne.setNameStudent("Thiarlles");
       
       Student studentTwo = new Student();
       studentTwo.setAgeStudent(45);
       studentTwo.setNameStudent("Paulo");
       
       List<Student>students = new ArrayList<>();
       students.add(studentOne);
       students.add(studentTwo);
       
       students.forEach(p-> System.out.println(p.getAgeStudent() + p.getNameStudent()));
       
       students.forEach(p-> System.out.println(p.getNameStudent()));
               
       // Lets's use the streams to iterate the students..
       students.stream()
               .filter(s -> s.getNameStudent().contains("T"))
               .sorted()
               .forEach(s-> System.out.println(s.getAgeStudent()));
   }    
}
