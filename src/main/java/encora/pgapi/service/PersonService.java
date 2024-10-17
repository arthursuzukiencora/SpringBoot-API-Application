package encora.pgapi.service;

import java.util.List;

import encora.pgapi.dto.request.PersonRequestDTO;
import encora.pgapi.dto.response.PersonResponseDTO;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(Long id, PersonRequestDTO personDTO);

    String delete(Long id);


}