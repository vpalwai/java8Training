package trivera.core.collections.cards;

import java.util.List;

/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of Trivera Technologies, LLC
 *
 * Copyright (c) 2019 Trivera Technologies, LLC.
 * http://www.triveratech.com   
 * </p>
 * @author Trivera Technologies Tech Team.
 */


/**
 * This class is a wrapper around a List, and represents a deck of cards.
 *
 * While it would make more sense to represent the deck as a set than as a list,
 * there is no sufficient standard implementation of a set that would provide
 * the correct behavior. The HashSet cannot preserve order, which we want to do
 * to give our "shuffle" operation some meaning. The TreeSet always sorts the
 * elements in natural ordering, making it impossible to shuffle at all. So
 * while we really don't want the List behaviors of indexed access (you can only
 * take a card off the top), we do want the benefits of List, which are to
 * shuffle and to sort, and we want the order preserved without being forced
 * into natural object ordering.
 */
public class Deck {

    private List<Card> deck = null;

    /**
     * Constructs the deck of cards.
     *
     * This method creates an array of 52 Cards to store the list of cards. The
     * cards are created by using four for loops, each loop creating the range
     * of cards in that suit.
     * <P>
     * Once the array is filled with 52 cards, the deck is shuffled.
     */
    public Deck() {

        int i = 0;
     // LAB HINT: Instantiate the deck

        // Create the cards for each of the four suits.
        for (int a = Card.DEUCE; a <= Card.ACE; a++, i++)
            this.deck.add(i, new Card(Card.HEARTS, a));

        for (int a = Card.DEUCE; a <= Card.ACE; a++, i++)
            this.deck.add(i, new Card(Card.DIAMONDS, a));

        for (int a = Card.DEUCE; a <= Card.ACE; a++, i++)
            this.deck.add(i, new Card(Card.CLUBS, a));

        for (int a = Card.DEUCE; a <= Card.ACE; a++, i++)
            this.deck.add(i, new Card(Card.SPADES, a));

        // LAB HINT: Shuffle the deck

    }


    /**
     * Returns the supplied number of cards from the top of the deck.
     *
     * This method returns (and removes) the first N cards
     * from the top of the deck. The new list is sorted using the custom
     * comparator that sorts according to number, not suit.
     *
     * @return java.util.List The list of cards in the hand
     * @param count
     *            The number of cards to take from the top of the deck
     */
  public List<Card> dealCards(int count) {

      // LAB HINT: Complete this method according to instructions
        return null;
    }


    /**
     * Returns the list of cards in the deck, sorted by suit.
     *
     * This method makes a copy of the deck, and sorts the copy using the
     * natural object ordering of the cards.
     *
     * An unmodifiable copy of the sorted copy is returned to the caller. Since
     * we've already made a copy of the real deck, we don't really have to make
     * yet a second copy that is unmodifiable, but we do so anyway just because
     * it's there!
     *
     * @return java.util.List An unmodifiable list of sorted cards
     */

  public List<Card> showDeck() {

      // LAB HINT: Complete this method according to instructions
        return null;
    }

    /**
     * Shuffles the deck of cards.
     *
     * Before each hand is dealt, the cards are shuffled. Since we are dealing
     * from the true deck, it is the true deck contained as an instance field of
     * this class that must be shuffled.
     */
    public void shuffle() {

        // LAB HINT: Shuffle this.deck

    }

}
