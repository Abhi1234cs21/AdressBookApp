package com.example.AdressBookApp.service;



import com.example.AdressBookApp.dto.ContactDTO;

import java.util.List;

public interface IContactService {

    List<ContactDTO> getAllContacts();

    ContactDTO getContactById(Long id);

    ContactDTO addContact(ContactDTO contactDTO);

    ContactDTO updateContact(Long id, ContactDTO contactDTO);

    boolean deleteContact(Long id);
}