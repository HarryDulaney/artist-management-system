package com.hgdiv.opendata.repository;

import com.hgdiv.opendata.controller.HomeController;
import com.hgdiv.opendata.model.Artist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Bootstrap {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Bean
    CommandLineRunner initDatabase(ArtistRepository artistRepository) {
        return args -> {
            for(int i = 0; i < 7; i++) {
                log.info("Preloading " + artistRepository.save(new Artist("ArtistName")));
            }

        };
    }

}