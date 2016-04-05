/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11;

/**
 *
 * @author T-101
 */
import java.util.*;
import javax.swing.JRadioButton;
public class GeneradorPreguntas {
    
public static ArrayList<Pregunta>obtenerTodasLasPeguntas(){
    //Vamos a craer una sola pregunta con tres opciones
    Opcion o1=new Opcion("Moscu", true);
    Opcion o2=new Opcion("Florencia",false);
    Opcion o3=new Opcion("Paris",false);
     Opcion o4=new Opcion("Mizcalco",false);
    
    Opcion o4p2=new Opcion("Tokio", false);
    Opcion o5p2=new Opcion("Beijing", true);
    Opcion o6p2=new Opcion("Seul", false);
    Opcion o7p2=new Opcion("Pyonjiang", false);
    
    Opcion o8p3=new Opcion("Morelia", false);
    Opcion o9p3=new Opcion("Yucatán", false);
    Opcion o10p3=new Opcion("CDMX", true);
    Opcion o11p3=new Opcion("Puebla", false);
    
    ArrayList<Opcion> opciones=new ArrayList<Opcion>();
    opciones.add(o1);
    opciones.add(o2);
    opciones.add(o3);
    opciones.add(o4);
    
    ArrayList<Opcion> opciones2=new ArrayList<Opcion>();
    opciones2.add(o4p2);
    opciones2.add(o5p2);
    opciones2.add(o6p2);
    opciones2.add(o7p2);
    
    ArrayList<Opcion> opciones3=new ArrayList<Opcion>();
    opciones3.add(o8p3);
    opciones3.add(o9p3);
    opciones3.add(o10p3);
    opciones3.add(o11p3);
    
     Pregunta p1=new Pregunta("Capital de Rusia", opciones);
     Pregunta p2=new Pregunta("Capital de China", opciones2);
     Pregunta p3=new Pregunta("Nuevo nombre de la Capital de México", opciones3);
      
    ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
     preguntas.add(p1);
     preguntas.add(p2);
     preguntas.add(p3);
      
      return preguntas; 
      
      
    }
    

public static boolean checarRespuesta(Pregunta p,JRadioButton[] radios){
boolean respuesta=false;
String seleccion="";
for(JRadioButton radio:radios){
if(radio.isSelected()){
seleccion= radio.getText();
}
}
for(Opcion o:p.getOpciones()){
if(o.isEstatus()){
if(o.getTitulo().equals(seleccion))respuesta=true;
}
}
return respuesta;
}
}