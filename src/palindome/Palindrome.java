package palindome;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Palindrome {
private String myTest = new String();


    public String getString() {
        String output = myTest;
        return output;
    }

    public void setString(String input) {
        myTest = input.toLowerCase();

    }

    public Boolean isPalindrome(){
        String pString = myTest;
        int start = 0, end = pString.length() - 1, i;
        int center = (start + end) / 2;
        for (i = start; i <= center; i++) {
            if (pString.charAt(start) == pString.charAt(end)) {
                start++;
                end--;
            } else break;

        }
        if (i == center + 1) {
            return true;
        } else {
            return false;
        }

    }

}
