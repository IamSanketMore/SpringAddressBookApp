package com.ideaclan.addressbook.DTO;

import javax.validation.constraints.Pattern;

public class AddressBookDTO
{
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$" , message = " First Name is Invalid")
    public String firstName;
    public String lastName;
    public String address;
    public int zip;
    public String city;
    public String state;

    public AddressBookDTO(String firstName, String lastName, String address, int zip, String city, String state)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressBook Data{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
