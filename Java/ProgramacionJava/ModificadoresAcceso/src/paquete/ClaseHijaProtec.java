/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;


public class ClaseHijaProtec extends Clase2{
    
    public ClaseHijaProtec(){
        super();
        this.atributoProtected = "modificacion de atributo Protected ";
        System.out.println("atributoProtegido = " + this.atributoProtected);
        this.metodoProtecte();
    }
}


