package com.example.springmvc.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RestHomeController {

  @RequestMapping(value = "home", method = RequestMethod.GET)
  ResponseEntity<String> home() {
    return ResponseEntity.ok().body("{\"message\":\"Hello world!\"}");
  }
}
