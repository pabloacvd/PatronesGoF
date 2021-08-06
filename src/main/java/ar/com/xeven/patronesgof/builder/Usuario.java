package ar.com.xeven.patronesgof.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario{
    private String nombre;
    private String apellido;
    private Role role;

    public String informarLoQuePuedeHacer(){
        return this.nombre+" "+role.getPermiso();
    }
}