package com.ideaclan.addressbook.service;

import com.ideaclan.addressbook.DTO.AddressBookDTO;
import com.ideaclan.addressbook.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService
{
    private List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookById(int bookId) {
        return addressBookDataList.get(bookId-1);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDataList.size()+1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int bookId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookById(bookId);
        addressBookData.setFirstName(addressBookDTO.firstName);
        addressBookData.setLastName(addressBookDTO.lastName);
        addressBookData.setAddress(addressBookDTO.address);
        addressBookData.setZip(addressBookDTO.zip);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookDataList.set(bookId-1,addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int bookId) {
       addressBookDataList.remove(bookId-1);
    }
}
