package ar.com.peliculas.domain;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {

    private String name;

    public Pelicula() {

    }

    public Pelicula(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Pelicula{" + "name=" + this.name + '}';
    }

}
