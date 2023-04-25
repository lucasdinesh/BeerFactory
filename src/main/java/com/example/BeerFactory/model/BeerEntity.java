package com.example.BeerFactory.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String beerName;
    private String upc;

    private Style beerStyle;
    private Long quantityOnHand;
    private String price;
    @UuidGenerator
    private String uuid;

}
