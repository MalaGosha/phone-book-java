package eu.malagosha.phonebookjava.service;

import eu.malagosha.phonebookjava.entity.ContactEntity;
import eu.malagosha.phonebookjava.model.ContactDTO;
import eu.malagosha.phonebookjava.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactService {

    private final ContactRepository repository;

    public ContactDTO getContactById(Long id) {
        ContactEntity byId = repository.getById(id);
        ContactDTO contactDTO = new ContactDTO(byId);
        return contactDTO;
    }

    public List<ContactDTO> getAllContact() {
        List<ContactEntity> allContact = repository.findAll();
        List<ContactDTO> contactDTOList = allContact.stream().map(contactEntity -> new ContactDTO(contactEntity))
                .collect(Collectors.toList());
        return contactDTOList;
    }

    public ContactDTO createContact(ContactDTO newContactDTO) {
        ContactEntity contactEntity = new ContactEntity(newContactDTO);
        ContactEntity savedContact = repository.save(contactEntity);
        ContactDTO contactDTO = new ContactDTO(savedContact);
        return contactDTO;
    }

    public void deleteContactById(Long id) {
        repository.deleteById(id);
    }

    public ContactDTO editContact(Long id, ContactDTO editContactDTO) {
        System.out.println(editContactDTO);
        ContactEntity byId = repository.getById(id);
        byId = new ContactEntity(editContactDTO);
        repository.save(byId);
        return new ContactDTO(byId);
    }
}
