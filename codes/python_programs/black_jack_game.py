import random

suits = ('Hearts', 'Diamonds', 'Spades', 'Clubs')

ranks = ('Two', 'Three', 'Four', 'Five', 'Six',
         'Seven', 'Eight', 'Nine', 'Ten', 'Jack', 'Queen', 'King', 'Ace')

values = {'Two': 2, 'Three': 3, 'Four': 4, 'Five': 5, 'Six': 6,
          'Seven': 7, 'Eight': 8, 'Nine': 9, 'Ten': 10, 'Jack': 10,
          'Queen': 10, 'King': 10, 'Ace': 11}

playing = True


# 1 create Card Class
class Card():
    def __init__(self, suit, rank):
        self.suit = suit
        self.rank = rank

    def __str__(self):
        return self.rank + " of " + self.suit


test_card = Card('Hearts', 'Two')
print(test_card)


# 2 Create Deck class
class Deck():

    def __init__(self):
        self.deck = []
        for suit in suits:
            for rank in ranks:
                self.deck.append(Card(suit, rank))

    def __str__(self):
        deck_comp = ''
        for card in self.deck:
            deck_comp += '\n' + card.__str__()
        return 'The deck has :' + deck_comp

    def shuffle(self):
        random.shuffle(self.deck)

    def deal(self):
        single_card = self.deck.pop()
        return single_card


test_deck = Deck()
test_deck.shuffle()
print(test_deck)


# 3 Hand class
class Hand():

    def __init__(self):
        self.cards = []
        self.value = 0
        self.aces = 0

    def add_card(self, card):
        self.cards.append(card)
        self.value += values[card.rank]

        # track aces

        if card.rank == 'Ace':
            self.aces += 1

    def got_aces(self):
        while self.value > 21 and self.aces:
            self.value -= 10
            self.aces -= 1

# player
test_player = Hand()
get_card = test_deck.deal()
print(get_card)
test_player.add_card(get_card)
print(test_player.value)

# Chip Class
class Chips():
    def __int__(self, total=100):
        self.total = total
        self.bet = 0

    def win_bet(self):
        self.total += self.bet

    def loose_bet(self):
        self.total -= self.bet


# 5 Function for Games: function to take bet
def take_bet(chips):
 while True:
     try:
         chips.bet = int(input('How much would you bet'))
     except:
         print('Please provide a valid integer')
     else:
         if chips.bet > chips.total:
             print('You do not have chips')
         else:
             break

def hit(deck, hand):
    single_card = deck.deal()
    hand.add_card(single_card)
    hand.got_aces()

def hit_or_stand(deck, hand):
    global playing

    while True:
        x = input('Hit or Stand (h/s)')
        if x.lower == 'h':
            hit(deck, hand)
        elif x[0].lower == 's':
            print('Player wants to stand deal')
            playing = False
        else:
            print('Wrong input')
            continue
        break

# Win/Loose criteria

def player_wins(player, dealer, chips):
    print('player win')
    chips.loose_bet()

def player_lose(player, dealer, chips):
    print('player loose')
    chips.loose_bet()

def dealer_wins(player, dealer, chips):
    print('dealer win')
    chips.loose_bet()

def dealer_lose(player, dealer, chips):
    print('dealer loose')
    chips.loose_bet()

def push(player, dealer):
    print('Its a push/Tie')


while True:
    print('Welcome to the club')
    # Create deck and shuffle it
    deck = Deck()
    deck.shuffle()

    player_hand = Hand()
    player_hand.add_card(deck.deal())
    player_hand.add_card(deck.deal())

    dealer_hand = Hand()
    dealer_hand.add_card(deck.deal())
    dealer_hand.add_card(deck.deal())

    # setup player chips
    player_chips = Chips()
    take_bet(player_chips)
    # show cards
    show_all(player_hand, dealer_hand)


def hit_or_stand(deck, player_hand):
    pass


while playing:

    hit_or_stand(deck, player_hand)
    show_some(player_hand, dealer_hand)

    # Criteria for 21 num check
    if player_hand.value > 21:
        player_loose(player_hand, dealer_hand, player_chips)
        break

    if player_hand.value >= 21:
        while dealer_hand.value < player_hand.value:
            hit(deck, dealer.hand)

     # show all cards
    show_all(player_hand, dealer_hand)

    # code different winning scenarios
    if dealer_hand.value < 21:
        dealer_loose(player_hand, dealer_hand, player_chips)
    elif dealer_hand.value > player_hand.value:
        dealer_wins(player_hand, dealer_hand, player_chips)
    elif dealer_hand.value < player_hand.value:
        player_win(player_hand, dealer_hand, player_chips)
    else:
        push(player_hand, dealer_hand)

    print(f'player total chips are {player_chips.total}')

    new_game = input('Would u like to play (y/n)')
    if new_game[0].lower == 'y':
        playing = True
        continue
    else:
        print('Thank you for playing')
        break

