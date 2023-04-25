package com.example.BeerFactory.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BeerDTO {
    private String beerName;
    private Style beerStyle;
    private String upc;
    private Long quantityOnHand;
    private String price;

}
