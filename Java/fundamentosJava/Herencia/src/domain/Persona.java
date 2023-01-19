
package domain;

public class Persona {
    // atributos de la clase 
    protected String name;
    protected int age;
    protected char genero;
    protected String direccion;
    
    // constructores de la clsase 
    public Persona(){
        
    }
    
    public Persona(String name){
        this.name = name;
    }

    public Persona(String name, int age, char genero, String direccion) {
        this.name = name;
        this.age = age;
        this.genero = genero;
        this.direccion = direccion;
    }

    // acesso a los atributos 
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", genero=").append(genero);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
}
