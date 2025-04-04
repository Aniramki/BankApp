package com.Aniramki.cards.controller;

import com.Aniramki.cards.model.Cards;
import com.Aniramki.cards.model.Customer;
import com.Aniramki.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        List<Cards> cardsList = cardsRepository.findByCustomerId(customer.getCustomerId());
        if (cardsList != null) {
            return cardsList;
        }else{
            return null;
        }
    }
}
