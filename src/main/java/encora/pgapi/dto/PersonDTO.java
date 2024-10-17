package encora.pgapi.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonDTO {
    @Column(name = "id", nullable=false, unique=true)
    private Long id;

    @Column(name = "name", nullable=false, unique = false)
    private String name;

    @Column(name = "cpf", nullable= false, unique = true)
    private String cpf;

    @Column(name = "age", nullable=false, unique= true)
    private Integer age;
    
}
