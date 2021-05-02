# BattleShip
This is a Single Player BattleShip game. Every player has 3 battleships (SS & SS & SS) and the board like this :

        A B C D E F
        -----------
    1 | O - - O X O
    2 | O O O O X O
    3 | X X - O X O
    4 | O O O O O O
      | -----------
    5 | S S O O O O
    6 | O - O O O S
    7 | O S X 0 O S
    8 | O O O O O O
    
In the game board symbols & meanings are :

    'O' <--> water

    'S' <--> ship

    'X' <--> when your shot hits a ship

    '-' <--> when your shot misses
    
There Are 3 different opponent :

     Admiral Red Beard, he will burry you in deep oceans!   ---> Difficulty : *****
     Lieutenant Harvy, has his own tricks to defeat you!    ---> Difficulty : ***
     Seaman Mason, he is a newbie in navy, but try his best ---> Difficulty : *

To playing, simply choose option 1 in the main menu, after that you have to place your 3 ships. To place give the starting coordinate, then give the direction and your ship is placed. The game goes like you and your opponent Captain will attack to coordinates 1 by 1. The captain who destroys all of his opponents ships will win.

Changing difficulty by option 2 in menu

EXTRAS
        There is small bugs in hard mode, sometimes the game enters infinite loop
        Difficulties are depends on 2 categories, ship placement and attack coordinate selection : 
                
                -Easy Opponent(Seaman Mason) Ship placement : simple, Coordinate selection : simple
                -Medium Opponent(Lieutenant Harvy) Ship placement : advanced, Coordinate selection : simple
                -Hard Opponent(Admiral Red Beard) Ship placement : advanced, Coordinate selection : advanced
