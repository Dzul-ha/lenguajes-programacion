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
        //lee renglon por renglon
        BufferedReader reader=new BufferedReader(isr);
        int renglones=0;
             boolean encontrado=false;
         String temperaturas[]=new String[5];
        while(reader.readLine() !=null){
         String renglonActual=reader.readLine();
            if(renglonActual.contains("Outside Te")){
                encontrado=true;
                System.out.println("Si existe este renglon");
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
    


