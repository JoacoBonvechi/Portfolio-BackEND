
package com.mycompany.practicaspoo;


public class Camion extends Vehiculo{
    int cant_ejes;
    boolean acoplado;

    public Camion(int cant_ejes, boolean acoplado, int num_registro, int cant_ruedas, String marca, String modelo) {
        super(num_registro, cant_ruedas, marca, modelo);
        this.cant_ejes = cant_ejes;
        this.acoplado = acoplado;
    }

    public Camion() {
    }

    public int getCant_ejes() {
        return cant_ejes;
    }

    public void setCant_ejes(int cant_ejes) {
        this.cant_ejes = cant_ejes;
    }

    public boolean isAcoplado() {
        return acoplado;
    }

    public void setAcoplado(boolean acoplado) {
        this.acoplado = acoplado;
    }

    
    
}
