/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //Declaramos un arreglo de enteros y  lo inicializamos
        int x[]={1,34,6,8};
        
        float []y=new float[4];
        float z;
//Todos los arreglos son tratados por el compilador como objetos
       
        //System.out.println(x[4]);
        A objeto=new A();
        System.out.println(objeto.m);
        System.out.println(y[2]);
        //System.out.println(z);
        //Vamos a iterar el arreglo x
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        //El mismo ciclo for para x pero mejorado
        for(int w:x){
            System.out.println(w);
        }
        
    }
}

class A{
    float m;
}