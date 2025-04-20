package com.Aniramki.cards.controller;

import com.Aniramki.cards.config.CardsServiceConfig;
import com.Aniramki.cards.model.Cards;
import com.Aniramki.cards.model.Customer;
import com.Aniramki.cards.model.Properties;
import com.Aniramki.cards.repository.CardsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @Autowired
    private CardsServiceConfig cardsServiceConfig;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        List<Cards> cardsList = cardsRepository.findByCustomerId(customer.getCustomerId());
        if (cardsList != null) {
            return cardsList;
        }else{
            return null;
        }
    }

    @GetMapping("/card/properties")
    public Properties getPropertyDetails() throws JsonProcessingException {
        Properties properties;
        properties = new Properties(cardsServiceConfig.getMsg(), cardsServiceConfig.getBuildVersion(), cardsServiceConfig.getMailDetails(), cardsServiceConfig.getActiveBranches());
        return properties;
    }
}
