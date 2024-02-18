/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knownforbes.controller;

import com.knownforbes.models.KnownForbes;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class BubbleSort {

    /**
     * Ascending Sort by BubbleSort*
     */
    public void bubbleSortBySourceAsc(ArrayList<KnownForbes> listForbes) {
        int arrSize = listForbes.size();

        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {
                // Compare sources
                String firstSource = listForbes.get(j).getSource();
                String secondSource = listForbes.get(j + 1).getSource();

                if (firstSource.compareToIgnoreCase(secondSource) > 0) {
                    // Swap the elements
                    KnownForbes temp = listForbes.get(j);
                    listForbes.set(j, listForbes.get(j + 1));
                    listForbes.set(j + 1, temp);
                }
            }
        }
    }

    /**
     * Descending Sort by BubbleSort*
     */

    public void bubbleSortBySourceDesc(ArrayList<KnownForbes> listForbes) {
        int arrSize = listForbes.size();

        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {

                String firstSource = listForbes.get(j).getSource();
                String secondSource = listForbes.get(j + 1).getSource();

                // Compare sources
                if (firstSource.compareToIgnoreCase(secondSource) < 0) {
                    // Swap the elements
                    KnownForbes temp = listForbes.get(j);
                    listForbes.set(j, listForbes.get(j + 1));
                    listForbes.set(j + 1, temp);
                }
            }
        }
    }

}
