/*This is of my own work.
 * Elijah Gonzales
 * Sept. 18, 2018
 * CST210 
 * Deck of Cards Game
 */

#include <iostream>
#include <vector>
#include <array>
#include <stdlib.h>
#include <algorithm> //shuffle

using namespace std;

class Card 
{
  public:
  array<string,4>suit;
  int faceValue, suitValue;
  string tempCard;

  Card() {
    suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
  }

  string accessSuit(int suitValue) {
    return suit.at(suitValue);
  }

  string setFaceValue(int faceValue) {
    switch(faceValue) {
      case 0: return "Two"; 
        break;
      case 1: return "Three";
        break;
      case 2: return "Four";
        break;
      case 3: return "Five";
        break;
      case 4: return "Six";
        break;
      case 5: return "Seven";
        break;
      case 6: return "Eight";
        break;
      case 7: return "Nine";
        break;
      case 8: return "Ten";
        break;
      case 9: return "Jack";
        break;
      case 10: return "Queen";
        break;
      case 11: return "King";
        break;
      case 12: return "Ace";
        break;
    }
  }


};

class Deck 
{

  private:
  Card card;

  public:
  vector<string>deckOfCards;
  int tempNum;
  string tempCard;

  void fillDeck() {
    for(int i=0;i<13;i++) { //facevalue
      for(int j=0;j<4;j++) { //suit
        tempCard = card.setFaceValue(i);
        tempCard += " of ";
        tempCard += card.accessSuit(j);
        deckOfCards.push_back(tempCard);
      }
    }
  }

  void shuffleDeck() {
    random_shuffle (deckOfCards.begin(), deckOfCards.end());
  }

  string drawCard() {
    return deckOfCards.pop_back();
  }

  void printDeck() {
    for(vector<string>::iterator it = deckOfCards.begin(); it != deckOfCards.end(); ++it)
      cout << *it << endl;
    }
};

/*
class Hand 
{
 
  private:
  Deck deck;

  public:
  string tempCard;

  void playHand(tempCard) {
    

    

};

class Game
{
  
  public:


};
*/

int main () {
  Deck deck;
  Card card;
  deck.fillDeck();
  deck.shuffleDeck();
  deck.printDeck();
  string draw = deck.drawCard();
  cout << "You drew a " << draw << endl;


  return 0;
}
