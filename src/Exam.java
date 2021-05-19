/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 60180
 */
public class Exam {
    private static String nombre;
    private static String descripcion;
    private static String habilidades;
    private static Integer experiencia;
    private static String nivel;
    
    public Exam(String nombre, String descripcion, String habilidades, Integer experiencia, String nivel) {
        Exam.nombre = nombre;
        Exam.descripcion = descripcion;
        Exam.habilidades = habilidades;
        Exam.experiencia = experiencia;
        Exam.nivel = nivel;
             
    }
    
    public static int sueldo(){
        int salario = 0;
        if(nivel.equalsIgnoreCase("Jr")){
            salario = 1000 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("Sr")){
            salario = 1500 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("Leader")){
            salario = 2000 * (1 + (experiencia / 10));
        } else if(nivel.equalsIgnoreCase("Boss")){
            salario = 2500 * (1 + (experiencia / 10));
        } return salario;
        
    }
}

