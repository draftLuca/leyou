package com.leyou.controller;

import com.leyou.domain.Namespace;
import com.leyou.service.MongoService;
import com.leyou.vo.BaseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MongoController {

    @Autowired
    public MongoService mongoService;
    @RequestMapping("/add")
    public BaseRep add(@RequestBody Namespace namespace) {
        BaseRep baseRep = mongoService.addNamespace(namespace);
        return baseRep;
    }
}
