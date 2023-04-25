package com.example.BeerFactory.service;

import com.example.BeerFactory.model.BeerDTO;
import com.example.BeerFactory.model.BeerEntity;
import com.example.BeerFactory.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BeerService {
    private final BeerRepository beerRepository;

    public BeerEntity postBeer(BeerDTO beerDTO){
        var beer = BeerEntity.builder().beerName(beerDTO.getBeerName())
                .upc(beerDTO.getUpc())
                .price(beerDTO.getPrice())
                .quantityOnHand(beerDTO.getQuantityOnHand())
                .beerStyle(beerDTO.getBeerStyle())
                .build();
        return beerRepository.save(beer);
    }

}
