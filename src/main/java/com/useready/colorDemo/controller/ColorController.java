package com.useready.colorDemo.controller;

import com.useready.colorDemo.model.Color;
import com.useready.colorDemo.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/colorDemo")
public class ColorController {
@Autowired
private ColorService colorService;

@GetMapping(path="/colors", produces = "application/json")
    public List<Color> getAllcolor(){
     return colorService.getALlColor();
}
}
