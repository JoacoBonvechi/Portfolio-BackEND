
package com.mycompany.practicaspoo;

public class PracticasPOO {

    public static void main(String[] args) {
        
    Auto auto1 = new Auto();
    Auto auto2 = new Auto(1, "AA111JO", 5, "rojo", true,65,4,"Volkswagen","Gol Trend");
    Moto moto = new Moto(125,1765,2,"Yamaha","ZrMicro");
    Camion camion = new Camion(6,true,4326,6,"Mercedez","modelo xd");
    
    Vehiculo vector[] = new Vehiculo [4];
    vector[0] = auto1;
    vector[1] = auto2;
    vector[2] = moto;
    vector[3] = camion;
    
    
    
    auto2.encender();
    auto2.acelerar(60);
    auto2.frenar(30);
    auto2.apagar();
    System.out.println("el valor de id es " + auto2.getId());
    auto2.setId(35);
    System.out.println("el valor de id es " + auto2.getId());
    
    
    
    System.out.println("El id de auto 1 es " + auto1.getId());
    System.out.println("El color de auto 1 es " + auto1.getColor());
    
    auto1.setId(15);
    auto1.setPatente("AB569PO");
    auto1.setCant_puertas(3);
    auto1.setColor("Azul");
    auto1.setCaja_manual(false);
    
    System.out.println("---------------");
    System.out.println("El id de auto 1 es " + auto1.getId());
    System.out.println("El color de auto 1 es " + auto1.getColor());
    
    System.out.println(auto2.toString());
    System.out.println(auto1.toString());
    
    
    };
    
    
    
}
