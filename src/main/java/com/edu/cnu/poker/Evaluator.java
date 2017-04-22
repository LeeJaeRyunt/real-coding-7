package com.edu.cnu.poker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dingue on 2017-04-17.
 */
public class Evaluator {

    public String evaluate(List<Card> cardList) {
        Map<Suit, Integer> tempMap = new HashMap<Suit, Integer>();

        for(Card card : cardList) {
            if (tempMap.containsKey(card.getSuit())) {
                Integer count = tempMap.get(card.getSuit());
                count = new Integer(count.intValue() + 1);
                tempMap.put(card.getSuit(), count);
            } else {
                tempMap.put(card.getSuit(), new Integer(1));
            }
        }

        for ( Suit key : tempMap.keySet()) {
            if (tempMap.get(key) == 5) {
                return "FLUSH";
            }
         }




    Map<Integer, Integer> tempMap1 = new HashMap<Integer, Integer>();
    for(Card card : cardList) {
        if (tempMap1.containsKey(card.getRank())) {
            Integer count = tempMap1.get(card.getRank());
            count = new Integer(count.intValue() + 1);
            tempMap1.put(card.getRank(), count);
        } else {
            tempMap1.put(card.getRank(), new Integer(1));
        }
        }
        for ( Integer key : tempMap1.keySet())

    {
        if (tempMap1.get(key) == 1) {
            return "ONE PAIR";
        }
    }
    
    return "NOTHING";


    }
}




