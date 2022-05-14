package eu.malagosha.phonebookjava.controllers;

import eu.malagosha.phonebookjava.model.ContactDTO;
import eu.malagosha.phonebookjava.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/contact")
@RestController
@RequiredArgsConstructor
public class ContactController {

    private final ContactService service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<ContactDTO> getContact(@PathVariable("id") Long id) {
        System.out.println(1);
        ContactDTO contactById = service.getContactById(id);
        return new ResponseEntity<>(contactById, HttpStatus.OK);
    }


    @GetMapping(value = "/all")
    public ResponseEntity<List<ContactDTO>> getAllContacts() {
        System.out.println(2);
        List<ContactDTO> allContact = service.getAllContact();
        return new ResponseEntity<>(allContact, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ContactDTO> createContact(@RequestBody ContactDTO newContactDTO) {
        System.out.println(3);
        System.out.println(newContactDTO.toString());
        ContactDTO contact = service.createContact(newContactDTO);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ContactDTO editContact(@PathVariable("id") Long id, @RequestBody ContactDTO editContactDTO) {
        System.out.println(4);
         return service.editContact(id, editContactDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable("id") Long id) {
        System.out.println(5);
        System.out.println(id);
        service.deleteContactById(id);
        return ResponseEntity.noContent().build();
    }

}
