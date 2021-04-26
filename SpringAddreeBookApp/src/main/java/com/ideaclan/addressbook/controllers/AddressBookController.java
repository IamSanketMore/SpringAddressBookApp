package com.ideaclan.addressbook.controllers;

import com.ideaclan.addressbook.DTO.AddressBookDTO;
import com.ideaclan.addressbook.DTO.ResponseDTO;
import com.ideaclan.addressbook.model.AddressBookData;
import com.ideaclan.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController
{
    @Autowired
    private IAddressBookService addressBookService;

    @GetMapping(value = { "", "/", "/get" })
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addressBookData = addressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Successfully Get AddressBook data", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{bookId}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("bookId") int bookId) {
        AddressBookData addressBookData = addressBookService.getAddressBookById(bookId);
        ResponseDTO responseDTO = new ResponseDTO("Successfully Get AddressBook data", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Successfully created the data ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{bookId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("bookId") int bookId,
                                                             @Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.updateAddressBookData(bookId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated address book of Id : ", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{bookId}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("bookId") int bookId) {
        addressBookService.deleteAddressBookData(bookId);
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully the contact ", bookId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}
