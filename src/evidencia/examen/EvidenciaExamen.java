/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.examen;

/**
 *
 * @author 60180
 */
public class EvidenciaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exam miExamen = new Exam("developper", "desarrollo de aplicaciones", "base de datos", 3, "Sr");
        System.out.println(Exam.sueldo());
        System.out.println("");
        System.out.println(miExamen.toString());
    }
    
}
