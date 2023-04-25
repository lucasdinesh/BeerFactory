package com.example.BeerFactory.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BeerDTO {
    private String beerName;
    @Enumerated(EnumType.STRING)
    private Style beerStyle;
    private String upc;
    private Long quantityOnHand;
    private String price;

}
