public class QuestionFour {
    public static void main(String args[]) {
        String str = "suszkskkcloowppzpaasllalx";
        String other = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if (other.contains("" + str.charAt(i)) == false) {
                for (int j = i + 1; j < str.length(); j++)

                    if (str.charAt(j) == str.charAt(i))
                        count++;

                System.out.println("Occurence of " + str.charAt(i) + " =" + count);
                other = other + str.charAt(i);
            }
        }
    }
}
