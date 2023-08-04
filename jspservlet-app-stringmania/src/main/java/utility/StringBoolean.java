package utility;

public class StringBoolean {
//	Enter the code here....
package com.example.stringmania;

public class StringMethod {
    private String input;

    // Getter and Setter for input
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    // Method to convert the String to lowercase
    public String convertToLowercase() {
        if (input != null) {
            return input.toLowerCase();
        } else {
            return "";
        }
    }

    // Method to convert the String to uppercase
    public String convertToUppercase() {
        if (input != null) {
            return input.toUpperCase();
        } else {
            return "";
        }
    }

    // Method to find the first character in the string
    public String findFirstCharacter() {
        if (input != null && !input.isEmpty()) {
            return String.valueOf(input.charAt(0));
        } else {
            return "";
        }
    }

    // Method to return string length
    public String getStringLength() {
        if (input != null) {
            return String.valueOf(input.length());
        } else {
            return "0";
        }
    }

    // Method to trim the input string
    public String trimInput() {
        if (input != null) {
            return input.trim();
        } else {
            return "";
        }
    }


}
