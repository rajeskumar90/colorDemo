package com.useready.colorDemo.service;

import com.useready.colorDemo.model.Color;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColorService {


    public List<Color> getALlColor(){
        List<Color> colorList=new ArrayList<>();
        colorList.add(new Color("red","R"));
        colorList.add(new Color("white","W"));
        colorList.add(new Color("Green","g"));
        colorList.add(new Color("Blue","B"));

        return colorList;
    }
}
