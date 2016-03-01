
import E.T.E.Clientes;
import E.T.E.Direccion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-101
 */
public class GenerarClientes {
    
    public static Clientes[] obtenerCliente(){
     Clientes cliente[]=new Clientes[3];
     cliente[0]=new Clientes("Ana", "Lopez", 20, 2000, new Direccion("sur 11", 20,"Ecatepunk"));
     cliente[1]=new Clientes();
     cliente[3]=new Clientes();
     //Ajustamos los nombres
     cliente[0].setNombre(" Ana");
     cliente[1].setNombre(" Pedro");
     cliente[2].setNombre(" Laura");
     
     
        return cliente;
    }
        
    
       
}
