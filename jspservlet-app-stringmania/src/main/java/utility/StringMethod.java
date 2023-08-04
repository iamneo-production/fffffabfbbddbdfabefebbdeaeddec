package utility;

public class StringMethod {
//	Enter the code here....
    private String input1;
    private String input2;

    // Getter and Setter for input1
    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    // Getter and Setter for input2
    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    // Method to check if string1 contains string2
    public boolean containsSubstring() {
        if (input1 != null && input2 != null) {
            return input1.contains(input2);
        } else {
            return false;
        }
    }

    // Method to check if the string starts with the given letter
    public boolean startsWithLetter() {
        if (input1 != null && !input1.isEmpty()) {
            char firstChar = input1.charAt(0);
            return Character.isLetter(firstChar);
        } else {
            return false;
        }
    }

    // Method to check if the string ends with the given letter
    public boolean endsWithLetter() {
        if (input1 != null && !input1.isEmpty()) {
            char lastChar = input1.charAt(input1.length() - 1);
            return Character.isLetter(lastChar);
        } else {
            return false;
        }
    }

    // Method to check if two strings are equal
    public boolean areStringsEqual() {
        return input1 != null && input1.equals(input2);
    }

    // Method to check if two strings are equal by ignoring the case
    public boolean areStringsEqualIgnoreCase() {
        return input1 != null && input1.equalsIgnoreCase(input2);
    }


}
