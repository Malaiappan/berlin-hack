/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iata.ndc.trial.controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.client.ClientProtocolException;
import org.iata.ndc.ClientException;
import org.iata.ndc.NdcClient;
import org.iata.ndc.schema.AirShoppingRQ;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.iata.ndc.trial.domain.FlightConnection;
import com.iata.ndc.trial.domain.ba.BALocationsResponseWrapper;
import com.iata.ndc.trial.responsemappers.AirShoppingResonseMapper;

/**
 *
 * @author malai
 */
@Controller
@RequestMapping(value = "/ndc")
public class DefaultController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) throws JAXBException, ClientProtocolException, ClientException, IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("AirShopping.xml").getFile());
        JAXBContext jaxbContext = JAXBContext.newInstance(AirShoppingRQ.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        AirShoppingRQ request = (AirShoppingRQ) jaxbUnmarshaller.unmarshal(file);
        NdcClient client = new NdcClient("http://iata.api.mashery.com/athena/api", "jhttds6eh5bgq92zvqnruehx");
        List<FlightConnection> response = new AirShoppingResonseMapper().mapAirShoppingResponse(client.airShopping(request));

       return "index";
   }

    @RequestMapping(value = "/ba", method = RequestMethod.GET)
    public String getCal() {
        
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> converters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.getObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        converters.add(converter);
        restTemplate.setMessageConverters(converters);
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("client-key", "zmd9apqgg2jwekf8zgqg5ybf");
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        ResponseEntity<BALocationsResponseWrapper> baLocationsResponse = restTemplate.exchange("https://api.ba.com/rest-v1/v1/balocations", HttpMethod.GET, new HttpEntity<Object>(headers),
                        BALocationsResponseWrapper.class);
        System.out.println(baLocationsResponse.getBody().getGetBALocationsResponse().getCountry().size());
        return "index";
    }

    @RequestMapping(value = "/sita", method = RequestMethod.GET)
    public String getSita() {

        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> converters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.getObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        converters.add(converter);
        restTemplate.setMessageConverters(converters);

        HttpHeaders headers = new HttpHeaders();
        headers.add("client-key", "zmd9apqgg2jwekf8zgqg5ybf");
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<BALocationsResponseWrapper> baLocationsResponse = restTemplate.exchange("https://api.ba.com/rest-v1/v1/balocations", HttpMethod.GET, new HttpEntity<Object>(headers),
                        BALocationsResponseWrapper.class);
        System.out.println(baLocationsResponse.getBody().getGetBALocationsResponse().getCountry().size());
        return "index";
    }

    @RequestMapping(value = "/offers", method = RequestMethod.GET)
    public String getOffers() {
        return "offers";
    }
    
}
