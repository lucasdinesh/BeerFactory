package com.example.BeerFactory.controller;

import com.example.BeerFactory.model.BeerDTO;
import com.example.BeerFactory.model.BeerEntity;
import com.example.BeerFactory.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "api")
@Controller
@RequiredArgsConstructor
@Slf4j
public class BeerController {
    private final BeerService beerService;

    @PostMapping(path = "v1/beer")
    public BeerEntity postBeer(@RequestBody BeerDTO beer){
        log.debug(beer.toString());
        var response = beerService.postBeer(beer);
        log.debug(response.toString());
        return response;
    }
}
