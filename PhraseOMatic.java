
// Small program that creates a funny phrase from a list of strings :]


public class PhraseOMatic {
  public static void main (String[] args) {

    String[] wordListOne = {"24/7", "multi-paradigm", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "dynamic", "critical-path", "nodeJS", "Hadoop", "JavaScript"};

    String[] wordListTwo = {"empowered", "sticky", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "focused", "aligned", "targeted", "accelerated"};

    String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int i = 0;
    while (i < 3) {
      int rand1 = (int) (Math.random() * oneLength);
      int rand2 = (int) (Math.random() * twoLength);
      int rand3 = (int) (Math.random() * threeLength);

      String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

      if (i == 0) {
        System.out.println("\nWhat we need is a " + phrase + "!");
      } else {
        System.out.println("No, what we need is a " + phrase + "!");
      }

      i += 1;

    }
      
  }
}