public class Main {
    /*An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram. Ignore letter case.

    Example: (Input --> Output)

            "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case) */


    public static boolean  isIsogram(String str) {
        if(str.length() == 1 || str == "")
            return true;
        char[] string = str.toCharArray();
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = i + 1; j < str.length(); j++)
            {
                if (string[i] == string[j] || Math.abs((int)string[i]-(int)string[j]) == 32)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}