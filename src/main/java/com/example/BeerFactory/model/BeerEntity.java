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
    @Column
    private Long id;
    private String beerName;
    private String upc;

    @Enumerated(EnumType.STRING)
    private Style beerStyle;
    private Long quantityOnHand;
    private String price;
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    private UUID uuid = UUID.randomUUID();

    @PrePersist
    public void autofill() {
        this.setUuid(UUID.randomUUID());
    }

}
