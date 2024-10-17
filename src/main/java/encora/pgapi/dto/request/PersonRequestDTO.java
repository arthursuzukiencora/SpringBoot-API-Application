package encora.pgapi.dto.request;

import lombok.Setter;
import lombok.Getter;


@Setter
@Getter
public class PersonRequestDTO {

    private String name;


    private String cpf;


    private Integer age;

}