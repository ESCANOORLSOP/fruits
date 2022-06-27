package com.sriram.fruits;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class api {
    @Autowired
    private FruitRepository fruitRepository;
    //post a value in the database
    @PostMapping(value = "/save")
    public String save(@RequestBody Fruitsinfo fruitsinfo) {
        fruitRepository.save(fruitsinfo);
        return "saved";
    }
    //getall values in the database
    @GetMapping(value="/getall")
    public List<Fruitsinfo> getallfruitvalues()
    {
        return fruitRepository.findAll();
    }
    @GetMapping(value="/get/{id}")
    public String get(@PathVariable String id)
    {
        Fruitsinfo fruitsinfo=fruitRepository.findFruitsinfoById(id);
        //System.out.println(fruitsinfo.getFruitName());
        return fruitsinfo.toString();
    }
}
