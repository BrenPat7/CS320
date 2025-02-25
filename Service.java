package com.test.contacts;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private final List<Contactapp> contacts = new ArrayList<>();

    public void addcontact(Contactapp contact) {
        for (Contactapp c : contacts) {
            if (c.getcontactId().equals(contact.getcontactId())) {
                throw new IllegalArgumentException("contact id already in use");
            }
        }
        contacts.add(contact);
    }

    // New method to retrieve a Contactapp by its contactId
    public Contactapp getContact(String contactId) {
        for (Contactapp c : contacts) {
            if (c.getcontactId().equals(contactId)) {
                return c; // Return as soon as we find a match
            }
        }
        return null; // or throw new IllegalArgumentException("Contact not found");
    }

    public void deleteContact(String contactId) {
        for (Contactapp c : contacts) {
            if (c.getcontactId().equals(contactId)) {
                contacts.remove(c);
                return;
            }
        }
        throw new IllegalArgumentException("Contact ID not found");
    }

    public void updateContact(String contactId, String firstName, String lastName,
                              String phone, String address) {
        for (Contactapp c : contacts) {
            if (c.getcontactId().equals(contactId)) {
                c.setfirstName(firstName);
                c.setlastName(lastName);
                c.setphone(phone);
                c.setaddress(address);
                return;
            }
        }
        throw new IllegalArgumentException("Contact ID not found");
    }
}
