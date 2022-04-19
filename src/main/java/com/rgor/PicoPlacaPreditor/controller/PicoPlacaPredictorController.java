/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.rgor.PicoPlacaPreditor.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 *
 * @author rortiz
 */
@RestController
@RequestMapping("/")
public class PicoPlacaPredictorController {
    
    
    @GetMapping("/predict/{plate}")
    public String get(@PathVariable String plate) {
        return "helllo"+plate;
    }
    
    
}
