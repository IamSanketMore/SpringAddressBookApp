package com.ideaclan.addressbook.model;

import com.ideaclan.addressbook.DTO.AddressBookDTO;
import lombok.Data;

@Data
public class AddressBookData
{
    private int addressBookId;
    private String firstName;
    private String lastName;
    private String address;
    private int zip;
    private String city;
    private String state;

    public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO)
    {
        super();
        this.addressBookId = addressBookId;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.address = addressBookDTO.address;
        this.zip = addressBookDTO.zip;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;

    }


}
