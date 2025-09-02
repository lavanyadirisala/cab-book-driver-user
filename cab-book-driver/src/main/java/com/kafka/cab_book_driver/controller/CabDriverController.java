package com.kafka.cab_book_driver.controller;

import com.kafka.cab_book_driver.service.CabDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class CabDriverController {

    @Autowired
    CabDriverService cabDriverService;

    @PutMapping("/location")
    public ResponseEntity updateLocation(){
        return new ResponseEntity(cabDriverService.updateLocation(),HttpStatus.OK);
    }

}
