package ar.com.xeven.patronesgof;

import ar.com.xeven.patronesgof.builder.Usuario;
import ar.com.xeven.patronesgof.builder.UsuarioBuilder;
import ar.com.xeven.patronesgof.singleton.Personaje;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronesGoFApplication {

    public static void main(String[] args) {
        //SpringApplication.run(PatronesGoFApplication.class, args);

        // Pruebas con patrones de construcción
            //pruebasSingleton();
            //pruebasBuilder();

        // Pruebas con patrones de estructura
            pruebasProxy();

    }



    private static void pruebasProxy() {
        Cliente cliente1 = new Cliente("pablo", "VIP");
        Cliente cliente2 = new Cliente("natalia", "Regular");

        SoporteTecnico soporteTecnico1 = new ProxySoporteTecnico(cliente1.getCategoria());
        System.out.println(soporteTecnico1.obtenerSoporte());

        SoporteTecnico soporteTecnico2 = new ProxySoporteTecnico(cliente2.getCategoria());
        System.out.println(soporteTecnico2.obtenerSoporte());
    }





    private static void pruebasBuilder() {

        Usuario pablo = new UsuarioBuilder()
                .setNombre("pablo")
                .setApellido("acevedo")
                .setRole("admin")
                .build();

        Usuario juli = new UsuarioBuilder()
                .setNombre("juli")
                .setRole("cliente")
                .build();

        Usuario pablo2 = new UsuarioBuilder(pablo)
                .setApellido("Otro apellido")
                .setRole("otro rol")
                .build();

        System.out.println(pablo.informarLoQuePuedeHacer());
        System.out.println(juli.informarLoQuePuedeHacer());
    }









    private static void pruebasSingleton() {
        Personaje mario = Personaje.getPersonaje();
        mario.setNombre("mario");
        System.out.println("Nombre: "+mario.getNombre());
        mario.sumarPuntos(100);
        System.out.println("Puntaje final: "+mario.getPuntaje());
        Personaje otroMas = Personaje.getPersonaje();
        System.out.println("Nombre del otro: "+otroMas.getNombre());
    }

}
