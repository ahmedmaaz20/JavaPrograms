
 enum iplTeams{
    KKR,
    DC,
    MI,
    CSK,
    KXIP;
}

public class QuestionEight {
    public static void main(String args[]) {
        iplTeams k = iplTeams.KKR;

        switch (k) {
            case KKR:
                System.out.println("You choose KKR!");
                break;
            case CSK:
                System.out.println("You choose CSK!");
                break;
            case MI:
                System.out.println("You choose MI!");
                break;
            case DC:
                System.out.println("You choose DC!");
                break;
            case KXIP:
                System.out.println("You choose KXIP!");
                break;
            default:
                System.out.println("I don't know your car.");
                break;
        }
    }
}
