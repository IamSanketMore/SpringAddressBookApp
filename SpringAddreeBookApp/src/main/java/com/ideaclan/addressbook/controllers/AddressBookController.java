package com.ideaclan.addressbook.controllers;

import com.ideaclan.addressbook.DTO.AddressBookDTO;
import com.ideaclan.addressbook.DTO.ResponseDTO;
import com.ideaclan.addressbook.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController
{
    @GetMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData contactData = null;
        contactData = new AddressBookData(1, new AddressBookDTO("Sanket", "More","Depour Dhule",425005,"Dhule","MH"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", contactData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{bookId}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("bookId") int bookId) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(1, new AddressBookDTO("Sanket", "More","Depour Dhule",425005,"Dhule","MH"));
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful", contactData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(1, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Address Book Contact Successfully", contactData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(1, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Address Book Contact Successfully", contactData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{bookId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("bookId") int bookId) {
        ResponseDTO respDTO = new ResponseDTO("Deleted Address Book Contact Successfully", "Deleted Id: " + bookId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

}
