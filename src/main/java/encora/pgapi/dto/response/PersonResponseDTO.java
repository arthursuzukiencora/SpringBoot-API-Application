package encora.pgapi.dto.response;



import encora.pgapi.entity.Person;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonResponseDTO {

    private Long id;

    private String name;


    private String cpf;


    private Integer age;

    public PersonResponseDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.cpf = person.getCpf();
        this.age = person.getAge();
    }


}