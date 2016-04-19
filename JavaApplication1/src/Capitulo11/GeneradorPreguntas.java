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
    
    Opcion o12p4=new Opcion("Jalisco", true);
    Opcion o13p4=new Opcion("Yucatán", false);
    Opcion o14p4=new Opcion("CDMX", false);
    Opcion o15p4=new Opcion("Puebla", false);
    
    Opcion o16p5=new Opcion("Monterrey", true);
    Opcion o17p5=new Opcion("Yucatán", false);
    Opcion o18p5=new Opcion("CDMX", false);
    Opcion o19p5=new Opcion("Puebla", false);
    
    Opcion o20p6=new Opcion("Mayote", false);
    Opcion o21p6=new Opcion("Florencia",false);
    Opcion o22p6=new Opcion("Habana",true);
    Opcion o23p6=new Opcion("Mozambique",false);
    
    Opcion o24p7=new Opcion("Mayote", false);
    Opcion o25p7=new Opcion("Florencia",false);
    Opcion o26p7=new Opcion("Maputo",true);
    Opcion o27p7=new Opcion("Mozambique",false);
    
    Opcion o28p8=new Opcion("Mayote", false);
    Opcion o29p8=new Opcion("Florencia",false);
    Opcion o30p8=new Opcion("Roma",true);
    Opcion o31p8=new Opcion("Mozambique",false);
    
    Opcion o32p9=new Opcion("Mayote", false);
    Opcion o33p9=new Opcion("Florencia",false);
    Opcion o34p9=new Opcion("Roma",false);
    Opcion o35p9=new Opcion("Washington",true);
    
    Opcion o36p10=new Opcion("Mérida", true);
    Opcion o37p10=new Opcion("Florencia",false);
    Opcion o38p10=new Opcion("Roma",false);
    Opcion o39p10=new Opcion("Washington",false);
    
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
    
    ArrayList<Opcion> opciones4=new ArrayList<Opcion>();
    opciones4.add(o12p4);
    opciones4.add(o13p4);
    opciones4.add(o14p4);
    opciones4.add(o15p4);
    
    ArrayList<Opcion> opciones5=new ArrayList<Opcion>();
    opciones5.add(o16p5);
    opciones5.add(o17p5);
    opciones5.add(o18p5);
    opciones5.add(o19p5);
    
    ArrayList<Opcion> opciones6=new ArrayList<Opcion>();
    opciones6.add(o20p6);
    opciones6.add(o21p6);
    opciones6.add(o22p6);
    opciones6.add(o23p6);
    
    ArrayList<Opcion> opciones7=new ArrayList<Opcion>();
    opciones7.add(o24p7);
    opciones7.add(o25p7);
    opciones7.add(o26p7);
    opciones7.add(o27p7);
    
    ArrayList<Opcion> opciones8=new ArrayList<Opcion>();
    opciones8.add(o28p8);
    opciones8.add(o29p8);
    opciones8.add(o30p8);
    opciones8.add(o31p8);
    
    ArrayList<Opcion> opciones9=new ArrayList<Opcion>();
    opciones9.add(o32p9);
    opciones9.add(o33p9);
    opciones9.add(o34p9);
    opciones9.add(o35p9);
    
    ArrayList<Opcion> opciones10=new ArrayList<Opcion>();
    opciones10.add(o36p10);
    opciones10.add(o37p10);
    opciones10.add(o38p10);
    opciones10.add(o39p10);
    
     Pregunta p1=new Pregunta("Capital de Rusia", opciones);
     Pregunta p2=new Pregunta("Capital de China", opciones2);
     Pregunta p3=new Pregunta("Nuevo nombre de la Capital de México", opciones3);
     Pregunta p4=new Pregunta("Capital de Guadalajara", opciones4);
     Pregunta p5=new Pregunta("Capital de Nuevo León", opciones5);
     Pregunta p6=new Pregunta("Capital de Cuba", opciones6);
     Pregunta p7=new Pregunta("Capital de Mozambique", opciones7);
     Pregunta p8=new Pregunta("Capital de Italia", opciones8);
     Pregunta p9=new Pregunta("Capital de Estados Unidos", opciones9);
     Pregunta p10=new Pregunta("Capital de Yucatán", opciones10);
     
    ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
     preguntas.add(p1);
     preguntas.add(p2);
     preguntas.add(p3);
     preguntas.add(p4);
     preguntas.add(p5);
     preguntas.add(p6);
     preguntas.add(p7);
     preguntas.add(p8);
     preguntas.add(p9);
     preguntas.add(p10);
     
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