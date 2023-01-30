package com.shreyas.app.controller;


import com.shreyas.app.model.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HeaderController {
    @PostMapping("/send/data")
    public ResponseEntity sendData(@RequestBody List<Data> datas, @RequestHeader("sessionid") String sessionid){

        if(sessionid == null){
            return  new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        datas.forEach(data-> System.out.println("Received data is"+data.toString()));
        return  new ResponseEntity(HttpStatus.OK);
    }

    }
