package com.example.BeerFactory.bootStrap;

import com.example.BeerFactory.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class bootStrapData implements CommandLineRunner {
    private final BeerRepository beerRepository;
    @Override
    public void run(String... args) throws Exception {

    }
}
