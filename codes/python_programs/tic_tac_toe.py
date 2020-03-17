import random

# first create a board
input_game = ['Null', 'X', '0', 'X', '0', 'X', '0', 'X', '0', 'X']


def board():
    print(input_game[1] + '|' + input_game[2] + '|' + input_game[3])
    print(input_game[4] + '|' + input_game[5] + '|' + input_game[6])
    print(input_game[7] + '|' + input_game[8] + '|' + input_game[9])


# board(input_game)

def player_input():
    marker = ''
    while marker != 'X' and marker != '0':
        marker = input("Please choose you're marker:")
    if marker == 'X':
        return 'X', '0'
    else:
        return '0', 'X'


player_1, player_2 = player_input()
print('player1=' + player_1)
print('player2=' + player_2)


def put_marker(position1, marker):
    input_game[position1] = marker


def win(marker):
    return ((input_game[1] == input_game[2] == input_game[3] == marker) or
            (input_game[4] == input_game[5] == input_game[6] == marker) or
            (input_game[7] == input_game[8] == input_game[9] == marker) or
            (input_game[1] == input_game[5] == input_game[9] == marker) or
            (input_game[3] == input_game[5] == input_game[7] == marker))


def choose_player():
    player = random.randint(1, 2)
    if player == 1:
        return 'player 1'
    else:
        return 'player 2'


def space(position):
    input_game[position] = ''


def full_board_check():
    for i in range(1, 10):
        if space(i):
            return False
        else:
            return True


def player_choice():
    position = 0
    while position not in [1, 2, 3, 4, 5, 6, 7, 8, 9] or not space(position):
        position = int.input('Choose a position in range 1-9')
    return position


def play_again():
    choice = input('Do you want to play again[y/n]')
    return choice == 'y'


while True:
    player_1, player_2 = player_input()
    print('player1=' + player_1)
    print('player2=' + player_2)

    turn = choose_player()
    print(turn + ' will play first')

    play_game = input('Read to play [y/n]')
    if play_game == 'y':
        game_on = True
    else:
        game_on = False

    while game_on:
        if turn == 'player 1':
            board()
            position = player_choice()
            put_marker(position, 'X')
            game_on = False
        else:
            if full_board_check():
                print('Game Tie')
                game_on = False
            else:
                turn = 'player 2'


# the program is incomplete, but still go through it to understand different
# conditions

