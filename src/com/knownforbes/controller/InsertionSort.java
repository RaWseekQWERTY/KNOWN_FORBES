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
public class InsertionSort {

    /**
     * Ascending Sort *
     */
    public void insertionSortByNetworthAsc(ArrayList<KnownForbes> listForbes) {
        int arraySize = listForbes.size();
        for (int i = 1; i < arraySize; ++i) {
            KnownForbes key = listForbes.get(i);
            int j = i - 1;

            //compare second element with first element and swap accordingly
            while (j >= 0 && listForbes.get(j).getNetworth() > key.getNetworth()) {
                listForbes.set(j + 1, listForbes.get(j));
                j = j - 1;
            }
            listForbes.set(j + 1, key);
        }
    }

    /**
     * Descending Sort *
     */

    public void insertionSortByNetworthDesc(ArrayList<KnownForbes> listForbes) {
        int arraySize = listForbes.size();
        for (int i = 1; i < arraySize; ++i) {
            KnownForbes key = listForbes.get(i);
            int j = i - 1;

            while (j >= 0 && listForbes.get(j).getNetworth() < key.getNetworth()) {
                listForbes.set(j + 1, listForbes.get(j));
                j = j - 1;
            }
            listForbes.set(j + 1, key);
        }
    }
}
