package com.example.BeerFactory.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class BeerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String beerName;
    private String upc;

    @Enumerated(EnumType.STRING)
    private Style beerStyle;
    private Long quantityOnHand;
    private String price;
    private UUID uuid = UUID.randomUUID();

}
