/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.InputOutput;

import java.net.*;
import java.io.*;




public class MiPrimeraConexion {
    public static void main(String[] args) throws Exception{
        //primero vamos a usar una clase que se llama URL
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        //ahora tipo de conexion
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        //obtiene los datos
        InputStream input=con.getInputStream();
        
        InputStreamReader isr=new InputStreamReader (input);
        BufferedReader reader=new BufferedReader(isr);
        String lineaActual="no ha leido nada";
        boolean encontrado=false;
        int miLinea=0;
        while((lineaActual=reader.readLine())!=null){
         if(encontrado&&miLinea<=4){
             //vamos a despedasar la línea
             int indice= lineaActual.indexOf(">");
             int indice2= lineaActual.indexOf("</");
             String tempActual=lineaActual.substring(indice+1, indice2);
             
             System.out.println(tempActual);
             miLinea++;
         }
               if(lineaActual.contains("Outside Temp")){
                encontrado=true;
                System.out.println("dato encontrado");
                
            //String renglonActual=reader.readLine();
            //if(renglonActual.contains("Outside Te")){
              //  encontrado=true;
               // System.out.println("Si existe este renglon");
            }
                     
         //if(reader.readLine().contains("Current Conditions as of") ||renglones==100){
         //System.out.println(reader.readLine());
         }
        //String hi="<td width=class summary_timestamp>Current Conditions as of 18:55 C</td></tr>";
         //int indice3= hi.indexOf("summary_timestamp");
         //int indice4= hi.indexOf("</td>");
         //String viejo=hi.substring(indice3, indice4);
         //System.out.println(viejo);
         
    //String hola="<td width=class summary_data> C</td>";
         //int indice1= hola.indexOf("summary_data");
         //int indice2= hola.indexOf("</td>");
         //String nuevo=hola.substring(indice1+13, indice2);
         //System.out.println(nuevo);
    }
    
   
         
        //System.out.println("Número de renglones: "+renglones);
    }
    


