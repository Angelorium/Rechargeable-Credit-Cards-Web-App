package com.project.wsda.card;

import java.util.List;

public interface CardService {

    void saveCard(CardDto cardDto);

    Card findCardById(Integer id);

    List<Card> findAllCards();

}