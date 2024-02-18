/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knownforbes.utils;

import com.knownforbes.models.KnownForbes;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rasik Kayastha
 */
public class StringsUsed {
/**Displaying search results in dialogbox**/
    public void displayResult(KnownForbes result) {
        if (result != null) {
            String message = "Billionaire found:\n"
                    + "Rank: " + result.getRank() + "\n"
                    + "Name: " + result.getFullName() + "\n"
                    + "Networth: " + result.getNetworth() + " " + "B" + "\n"
                    + "Source: " + result.getSource() + "\n"
                    + "Gender: " + result.getGender() + "\n"
                    + "Philanthropy Score: " + result.getPhilanthropyScore();

            JOptionPane.showMessageDialog(null, message, "Billionaire Found", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Billionaire not found.", "Not Found", JOptionPane.WARNING_MESSAGE);
        }
    }
/** checking if string contains number**/
    public boolean checkNumber(String word) {
        for (char alphabets : word.toCharArray()) {
            if (Character.isDigit(alphabets)) {
                return true;
            }
        }
        return false;
    }
}
