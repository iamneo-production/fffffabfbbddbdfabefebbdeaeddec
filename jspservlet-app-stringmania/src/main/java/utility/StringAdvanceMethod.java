package utility;

public class StringAdvanceMethod {
	//Enter the code here...
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

    // Method to concatenate two strings
    public String concatenateStrings() {
        if (input1 == null) {
            return input2;
        } else if (input2 == null) {
            return input1;
        } else {
            return input1 + input2;
        }
    }

    // Method to split two strings
    public String[] splitStrings() {
        // For simplicity, assuming space as the delimiter
        return input1.split(" ");
    }

    // Method to find the first character in the string
    public String findFirstCharacter() {
        if (input1 != null && !input1.isEmpty()) {
            return String.valueOf(input1.charAt(0));
        } else {
            return "";
        }
    }

    // Method to find the index of the string
    public String findIndexOf() {
        if (input1 != null && input2 != null) {
            int index = input1.indexOf(input2);
            return String.valueOf(index);
        } else {
            return "-1";
        }
    }

    // Method to trim the input string
    public String trimInput() {
        if (input1 != null) {
            return input1.trim();
        } else {
            return "";
        }
    }


}
