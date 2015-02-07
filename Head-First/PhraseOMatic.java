
// Small program that creates a funny phrase from a list of strings


public class PhraseOMatic {
  public static void main (String[] args) {

    // Three sets of words to choose from
    String[] wordListOne = {"Java", "Python", "C", "Ruby", "JavaScript", "HTML", "CSS"};

    String[] wordListTwo = {"Galen", "Ashley", "David", "Cheri", "Chris", "Dash", "Kyle", "Michael"};

    String[] wordListThree = {"Philosopher", "Savior", "Politician", "Programmer", "Engineer", "Artist"};

    // Find amount of words in each list
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    // Generate three random numbers
    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    // Build a phrase :]
    String phrase = wordListTwo[rand2] + ": the " + wordListOne[rand1] + " " + wordListThree[rand3];

    // Print phrase to console
    System.out.println("What we need is " + phrase);
  }
}