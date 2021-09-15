package com.company.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.company.view.TextConstant.INPUT_REQUIRED_DATA;
import static com.company.view.TextConstant.WRONG_DATA;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "Messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, Locale.ENGLISH);


    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_REQUIRED_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_DATA),
                bundle.getString(INPUT_REQUIRED_DATA),
                bundle.getString(message)));
    }
}