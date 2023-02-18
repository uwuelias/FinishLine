public class FinishLine {
    private String p1_name;
    private String p2_name;
    public static int position1;
    public static int position2;
    public int dice1;
    public int dice2;

    public FinishLine(String name1, String name2) {
        p1_name = name1;
        p2_name = name2;
        position1 = 1;
        position2 = 1;
    }
    public String getP1_name() {
        return p1_name;
    }
    public String getP2_name() {
        return p2_name;
    }
    public int getPosition1() {
        return position1;
    }
    public int getPosition2() {
        return position2;
    }
    public void rollDice() {
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
    }
    public int getDice1() {
        return dice1;
    }
    public int getDice2() {
        return dice2;
    }
    public void incrementPosition1() {
        position1++;
    }
    public void incrementPosition2() {
        position2++;
    }
}
