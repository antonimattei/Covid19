package com.example.data.covid19.controller;

import com.example.data.covid19.model.Covid;
import com.example.data.covid19.service.Covid19Service;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/covid19",produces = MediaType.APPLICATION_JSON_VALUE)
public class Covid19Controller {

    @Autowired
    private Covid19Service covid19Service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Covid> getCovid19Data() throws UnirestException {
        return ResponseEntity.ok(covid19Service.getCovid19Data());
    }


}
