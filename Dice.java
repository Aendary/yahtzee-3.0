public class Dice
{
    public int value; 

    Die6 die1;
    Die6 die2;
    Die6 die3;
    Die6 die4;
    Die6 die5;
    public Dice() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }  

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }    
    
    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            die1.roll();
        }
        if (dieNumber == 2) {
            die2.roll();
        }
        if (dieNumber == 3) {
            die3.roll();
        }
        if (dieNumber == 4) {
            die4.roll();
        }
        if (dieNumber == 5) {
            die5.roll();
        }
    }

    public void summarize() {
        
    }

    public void toString() {
        
    }