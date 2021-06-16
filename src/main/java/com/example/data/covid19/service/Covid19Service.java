package com.example.data.covid19.service;

import com.example.data.covid19.model.Covid;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Service;



@Service
public class Covid19Service {

    public Covid getCovid19Data() throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://api.apify.com/v2/key-value-stores/TyToNta7jGKkpszMZ/records/LATEST?disableRedirect=true").asString();
        Gson gson = new Gson();
        return gson.fromJson(response.getBody(), Covid.class);
    }

}
