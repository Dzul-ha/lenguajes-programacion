/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E.T.E;

/**
 *
 * @author T-101
 */
public class Direccion {
    private String calle;
    private int numero;
    private String municipio;
    private String telefono;

    public Direccion(String calle, int numero, String municipio, String telefono) {
        this.calle = calle;
        this.numero = numero;
        this.municipio = municipio;
        this.telefono = telefono;
    }

    public Direccion(String sur_11, int i, String ecatepunk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
