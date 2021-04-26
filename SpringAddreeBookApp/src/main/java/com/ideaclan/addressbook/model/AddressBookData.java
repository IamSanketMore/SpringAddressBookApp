package com.ideaclan.addressbook.model;

import com.ideaclan.addressbook.DTO.AddressBookDTO;

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


    public int getAddressBookId() {
        return addressBookId;
    }

    public void setAddressBookId(int addressBookId) {
        this.addressBookId = addressBookId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
