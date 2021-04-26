package com.ideaclan.addressbook.service;

import com.ideaclan.addressbook.DTO.AddressBookDTO;
import com.ideaclan.addressbook.model.AddressBookData;

import java.util.List;

public interface IAddressBookService
{

    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookById(int bookId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int bookId, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int bookId);
}
