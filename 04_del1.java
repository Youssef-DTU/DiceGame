
class Dice {

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        var ultimateSum1 = 0;
        var ultimateSum2 = 0;


 System.out.println("This is a Dice game. The game is played by two players. The player who first reaches a sum of 40 or more wins the game. If a player rolls two ones, the player's sum is reset to 0. Press enter to play as Player 1 and Player 2. The game will continue until a player reaches a sum of 40 or more. Good luck!");
        for (int i = 0; true; i++) {
            var Player1 = new control();
            System.out.println("Press enter, to play as Player 1!");
            String P1 = scanner.nextLine();
            if (P1.isEmpty()) {
                ultimateSum1 += Player1.getSum();
                if (Player1.dice1 == 1 && Player1.dice2 == 1) {
                    ultimateSum1 = 0;
                }
                System.out.println("Player 1: Dice1 = " + Player1.dice1 + "; Dice2 = " + Player1.dice2 + "; Equal: " + Player1.getEns() + "; Sum: " + ultimateSum1);
            } else {
                System.out.println("Invalid input. Please press enter to play.");
            }
            System.out.println();

            var Player2 = new control();
            System.out.println("Press enter, to play as Player 2!");
            String P2 = scanner.nextLine();
            if (P2.isEmpty()) {
                ultimateSum2 += Player2.getSum();
                if (Player2.dice1 == 1 && Player2.dice2 == 1) {
                    ultimateSum2 = 0;
                }
                System.out.println("Player 2: Dice1 = " + Player2.dice1 + "; Dice2 = " + Player2.dice2 + "; Equal: " + Player2.getEns() + "; Sum: " + ultimateSum2);
            } else {
                System.out.println("Invalid input. Please press enter to play.");
            }
            System.out.println();

            if (ultimateSum1 > 40 && Player1.getEns()) {
                System.out.println("Player 1 wins!");
                break;
            }

            if (ultimateSum2 > 40 && Player2.getEns ()) {
                System.out.println("Player 2 wins!");
                break;
            }
        }
    }
}

class control {

    int dice1 = (int) (Math.random() * 6) + 1;
    int dice2 = (int) (Math.random() * 6) + 1;

    int getSum() {
        return this.dice1 + this.dice2;
    }

    boolean getEns() {
        return (this.dice1 == this.dice2);
    }

}
