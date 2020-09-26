class GuessGame {

        Player p1,p2,p3;


        public void startGame(){

            p1 = new Player();
            p2 = new Player();
            p3 = new Player();


            //declare three variables to hold the three guesses the players make

            int guessp1 = 0;
            int guessp2 = 0;
            int guessp3 = 0;

            //declare three variables to hold a true/false based on players ans

            boolean p1isRight = false;
            boolean p2isRight = false;
            boolean p3isRight = false;

            //generates a random number between 0 and 9 that the player guesses

            int targetNumber = (int) (Math.random() * 10);

            System.out.println("I'm thinking of a number between 0 and 9 ..");

            while(true) {

                System.out.println("Number to guess is " + targetNumber);

                //call each player's guess() method

                p1.guess();
                p2.guess();
                p3.guess();

                guessp1 = p1.number;
                System.out.println("Player one guessed " + guessp1);

                guessp2 = p2.number;
                System.out.println("Player two guessed " + guessp2);

                guessp3 = p3.number;
                System.out.println("Player three guessed " + guessp3);


                if(guessp1 == targetNumber){
                    p1isRight = true;
                }//p1

                if(guessp2 == targetNumber){
                    p2isRight = true;
                }//p2

                if(guessp3 == targetNumber){
                    p3isRight = true;
                }//p3

                if(p1isRight || p2isRight || p3isRight) {

                    System.out.println("We have a winner!");
                    System.out.println("Did player one get it right? " + p1isRight);
                    System.out.println("Did player two get it right? " + p2isRight);
                    System.out.println("Did player three get it right? " + p3isRight);
                    System.out.println("Game is over.");
                    break; //game over so break out of the loop

                } else {

                    //continues because nobody got it right
                    System.out.println("Players will have to try again.");
                }

            }//end of while loop
        }//end of startGame method

    }//end of class GuessGame

    class Player {

        int number = 0;

        public void guess() {
            number = (int) (Math.random() * 10);
            System.out.println("I am guessing " + number);
        }//end of guess method

    }//end of Player class

    class HelloWorld {

        public static void main(String[] args){

            GuessGame game = new GuessGame();
            game.startGame();
        }//end of main mtd
    }//end of GameLauncher class

