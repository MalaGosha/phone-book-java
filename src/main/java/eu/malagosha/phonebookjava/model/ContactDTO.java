package eu.malagosha.phonebookjava.model;

import eu.malagosha.phonebookjava.entity.ContactEntity;


public class ContactDTO {
    private Long id;
    private String name;
    private String surname;
    private int phoneNumber;
    private String createDate;
    private String modifiedDate;


    public ContactDTO(ContactEntity contactEntity) {
        this.id = contactEntity.getId();
        this.name = contactEntity.getName();
        this.surname = contactEntity.getSurname();
        this.phoneNumber = contactEntity.getPhoneNumber();
        this.createDate = contactEntity.getCreateDate();
        this.modifiedDate = contactEntity.getModifiedDate();
    }

    public ContactDTO() {
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

    @Override
    public String toString() {
        return "ContactDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", createDate='" + createDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                '}';
    }
}
