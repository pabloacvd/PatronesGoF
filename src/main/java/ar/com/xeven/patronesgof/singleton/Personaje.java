package ar.com.xeven.patronesgof.singleton;

import lombok.Getter;
import lombok.Setter;

// Personaje Singleton
@Getter
@Setter
public class Personaje {

    // forma eager (instancio el objeto cuando inicia el sistema
    //private static Personaje personaje = new Personaje("Default", 0);

    // forma lazy (lo instancio cuando lo necesito)
    private static Personaje personaje;

    private String nombre;
    private Integer puntaje;

    private Personaje(String nombre, Integer puntaje){
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public static Personaje getPersonaje(){
        if(personaje == null)
            personaje = new Personaje("default", 0);
        return personaje;
    }

    public void sumarPuntos(Integer puntosNuevos){
        this.puntaje += puntosNuevos;
    }

}
