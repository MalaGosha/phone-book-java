package eu.malagosha.phonebookjava.entity;

import eu.malagosha.phonebookjava.model.ContactDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactEntity {

    public ContactEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String surname;
    private String fullName;
    private int phoneNumber;
    private String createDate;
    private String modifiedDate;

    public ContactEntity(ContactDTO newContactDTO) {
        this.id = newContactDTO.getId();
        this.name = newContactDTO.getName();
        this.surname = newContactDTO.getSurname();
        this.fullName = newContactDTO.getName() + " " + newContactDTO.getSurname();
        this.phoneNumber = newContactDTO.getPhoneNumber();
        this.createDate = newContactDTO.getCreateDate();
        this.modifiedDate = newContactDTO.getModifiedDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
