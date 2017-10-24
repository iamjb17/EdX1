public class WordsAndThings {

    // method to count # char in a String
    // regex practice
    public int howMany(String s){
        int thisMany = 0;
        s = s.replaceAll("\\s","");
        if (s.matches("[a-zA-Z]+")) {
            thisMany = s.length();
        }
        return thisMany;
    }
}
