package com.briozing.controller;

import com.briozing.models.RequestVO;
import com.briozing.models.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class Calculator {

    //    @GetMapping(value="/", produces = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<String> defaultApi(){
//
//        return new ResponseEntity<>("{\"message\" : \"defaultApi\"}", HttpStatus.OK);
//    }

    @PostMapping(value="/add",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseVO> add(@RequestBody RequestVO requestVO){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setResult(requestVO.getValue1() + requestVO.getValue2());
        return new ResponseEntity<>(responseVO, HttpStatus.OK);
    }

    @PostMapping(value="/subtract",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseVO> subtract(@RequestBody RequestVO requestVO){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setResult(requestVO.getValue1()-requestVO.getValue2());
        return new ResponseEntity<>(responseVO, HttpStatus.OK);
    }

    @PostMapping(value="/multiply",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseVO> multiply(@RequestBody RequestVO requestVO){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setResult(requestVO.getValue1() * requestVO.getValue2());
        return new ResponseEntity<>(responseVO, HttpStatus.OK);
    }

    @PostMapping(value="/divide",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseVO> divide(@RequestBody RequestVO requestVO){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setResult(requestVO.getValue1() / requestVO.getValue2());
        return new ResponseEntity<>(responseVO, HttpStatus.OK);
    }
}
