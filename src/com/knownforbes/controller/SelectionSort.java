/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knownforbes.controller;

import com.knownforbes.models.KnownForbes;
import com.knownforbes.views.KnownForbesgui1;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class SelectionSort {

    /**
     * Sort in Ascending by Rank By selectionSOrt*
     */
    public void selectionSortByRankAsc(ArrayList<KnownForbes> listForbes) {
        //Initializing the size of ArrayList
        int arrSize = listForbes.size();
        //loop through arraylist
        for (int i = 0; i < arrSize - 1; i++) {
            int minIndex = i;                                   //taking first element as minimum rank
            //Iterate through the unsorted portion of the ArrayList to find the element with the minimum Forbes rank.
            for (int j = i + 1; j < arrSize; j++) {
                if (listForbes.get(j).getRank() < listForbes.get(minIndex).getRank()) {
                    minIndex = j;                                       //swapping first element with second element if first element is greater
                }
            }
            //creating temp variable to swap smaller and greater values
            KnownForbes temp = listForbes.get(i);
            listForbes.set(i, listForbes.get(minIndex));        //updating the arraylist
            listForbes.set(minIndex, temp);
        }
    }

    /**
     * Sort in descending by Rank By Selection Sort*
     */

    public void selectionSortByRankDesc(ArrayList<KnownForbes> listForbes) {
        int arrSize = listForbes.size();
        for (int i = 0; i < arrSize - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arrSize; j++) {
                if (listForbes.get(j).getRank() > listForbes.get(maxIndex).getRank()) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the element at i
            KnownForbes temp = listForbes.get(i);
            listForbes.set(i, listForbes.get(maxIndex));
            listForbes.set(maxIndex, temp);
        }
    }

}
