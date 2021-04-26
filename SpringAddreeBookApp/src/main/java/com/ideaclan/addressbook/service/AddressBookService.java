package com.ideaclan.addressbook.service;

import com.ideaclan.addressbook.DTO.AddressBookDTO;
import com.ideaclan.addressbook.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService
{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookList = new ArrayList<AddressBookData>();
        addressBookList.add(new AddressBookData(1, new AddressBookDTO("Sanket", "More","Depour Dhule",425005,"Dhule","MH")));
        return addressBookList;
    }

    @Override
    public AddressBookData getAddressBookById(int contId) {
        AddressBookData addressBookData = new AddressBookData(1, new AddressBookDTO("Sanket", "More","Depour Dhule",425005,"Dhule","MH"));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int contId, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int contId) {
        // TODO Auto-generated method stub

    }
}
