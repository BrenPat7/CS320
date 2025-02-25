package com.test.contacts;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class servicetest {

    private Service service;

    @BeforeEach
    public void setUp() {
        
        service = new Service();
    }

    @Test
    public void testAddcontact() {
        Contactapp contact = new Contactapp("12345", "John", "Doe", "1234567890", "123 Main St");
        service.addcontact(contact);

        Contactapp retrieved = service.getContact("12345");
        assertNotNull(retrieved);
        assertEquals("John", retrieved.getfirstName());

        assertThrows(IllegalArgumentException.class, () -> {
            service.addcontact(contact);
        });
    }


    @Test
    public void testDeleteContact() {
  
        Contactapp contact = new Contactapp("12345", "John", "Doe", "1234567890", "123 Main St");
        service.addcontact(contact);
        service.deleteContact("12345");

        assertNull(service.getContact("12345"));  

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("99999");
        });
    }

    @Test
    public void testUpdateContact() {
      
        Contactapp contact = new Contactapp("12345", "John", "Doe", "123 Main St", "1234567890");
        service.addcontact(contact);
       
        service.updateContact("12345", "Jane", "Smith", "456 New Address",  "0987654321");
        Contactapp retrieved = service.getContact("12345");
        assertNotNull(retrieved);
        assertEquals("Jane", retrieved.getfirstName());
        assertEquals("Smith", retrieved.getlastName());
        assertEquals("0987654321", retrieved.getphone());
        assertEquals("456 New Address", retrieved.getaddress());

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateContact("99999", "No", "One", "Somewhere", "1234567890");
        });
    }
}
