/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

class Clase4 {
    private String atibutoPrivado = "Soy un atributo Privado"; // no se puede modificar el atributo desde otra clase 
    
    private Clase4(){
        System.out.println("Constructor Privado");
    } 
    public Clase4(String args){
        this();
        System.out.println("Constructor Publico");
    }
    private void metodoPrivado(){
        System.out.println("Soy un Metodo Privado");
    }
    public String getAtibutoPrivado() {
        return this.atibutoPrivado;
    }

    public void setAtibutoPrivado(String atibutoPrivado) {
        this.atibutoPrivado = atibutoPrivado;
    }
}
