/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knownforbes.controller;

import com.knownforbes.models.KnownForbes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rasik Kayastha
 */
public class MergeSort {

    /**
     * Divide and conquer method for fullName for Ascending sort*
     */
    public void mergeSortByFullNameAsc(ArrayList<KnownForbes> listForbes) {
        if (listForbes.size() <= 1) {
            return;
        } else {
            int mid = listForbes.size() / 2;

            //splitting ArrayList into two different ArrayList using subList
            ArrayList<KnownForbes> leftArrayList = new ArrayList<KnownForbes>(listForbes.subList(0, mid));
            ArrayList<KnownForbes> rightArrayList = new ArrayList<KnownForbes>(listForbes.subList(mid, listForbes.size()));

            //recursion for sorting both separate ArrayList
            mergeSortByFullNameAsc(leftArrayList);
            mergeSortByFullNameAsc(rightArrayList);

            //merge the sorted different ArrayList into single ArrayList
            mergeinAscending(listForbes, leftArrayList, rightArrayList);
        }
    }

    /**
     * merge arraylist in ascending*
     */
    private void mergeinAscending(ArrayList<KnownForbes> listForbes, ArrayList<KnownForbes> leftArrayList, ArrayList<KnownForbes> rightArrayList) {
        int leftCount = 0;
        int rightCount = 0;
        int arrayListCount = 0;
        // Merge the temp arrays back into array[left..right]
        while (leftCount < leftArrayList.size() && rightCount < rightArrayList.size()) {
            if (leftArrayList.get(leftCount).getFullName().compareTo(rightArrayList.get(rightCount).getFullName()) < 0) {
                listForbes.set(arrayListCount, leftArrayList.get(leftCount));
                leftCount++;
            } else {
                listForbes.set(arrayListCount, rightArrayList.get(rightCount));
                rightCount++;
            }
            arrayListCount++;
        }
        //copy remaining leftArrayList by checking if any is left
        while (leftCount < leftArrayList.size()) {
            listForbes.set(arrayListCount, leftArrayList.get(leftCount));
            leftCount++;
            arrayListCount++;
        }
        //copy remaining rightArrayList by checking if any is left

        while (rightCount < rightArrayList.size()) {
            listForbes.set(arrayListCount, rightArrayList.get(rightCount));
            rightCount++;
            arrayListCount++;
        }
    }

    /**
     * Divide and conquer method for fullName for descending sort*
     */

    public void mergeSortByFullNameDesc(ArrayList<KnownForbes> listForbes) {
        if (listForbes.size() <= 1) {
            return;
        } else {
            int mid = listForbes.size() / 2;

            //splitting ArrayList into two different ArrayList using subList
            ArrayList<KnownForbes> leftArrayList = new ArrayList<KnownForbes>(listForbes.subList(0, mid));
            ArrayList<KnownForbes> rightArrayList = new ArrayList<KnownForbes>(listForbes.subList(mid, listForbes.size()));

            //recursion for sorting both separate ArrayList
            mergeSortByFullNameDesc(leftArrayList);
            mergeSortByFullNameDesc(rightArrayList);

            //merge the sorted different ArrayList into single ArrayList
            mergeinDescending(listForbes, leftArrayList, rightArrayList);
        }
    }

    /**
     * merge arraylist in descending*
     */

    private void mergeinDescending(ArrayList<KnownForbes> listForbes, ArrayList<KnownForbes> leftArrayList, ArrayList<KnownForbes> rightArrayList) {
        int leftCount = 0;
        int rightCount = 0;
        int arrayListCount = 0;

        while (leftCount < leftArrayList.size() && rightCount < rightArrayList.size()) {
            if (leftArrayList.get(leftCount).getFullName().compareTo(rightArrayList.get(rightCount).getFullName()) > 0) {
                listForbes.set(arrayListCount, leftArrayList.get(leftCount));
                leftCount++;
            } else {
                listForbes.set(arrayListCount, rightArrayList.get(rightCount));
                rightCount++;
            }
            arrayListCount++;
        }

        while (leftCount < leftArrayList.size()) {
            listForbes.set(arrayListCount, leftArrayList.get(leftCount));
            leftCount++;
            arrayListCount++;
        }

        while (rightCount < rightArrayList.size()) {
            listForbes.set(arrayListCount, rightArrayList.get(rightCount));
            rightCount++;
            arrayListCount++;
        }
    }

    /**
     * static <T> List<T> reverse(final List<T> list) { final int size =
     * list.size(); final int last = size - 1;
     *
     * // create a new list, with exactly enough initial capacity to hold the
     * (reversed) list final List<T> result = new ArrayList<>(size);
     *
     * // iterate through the list in reverse order and append to the result for
     * (int i = last; i >= 0; --i) { final T element = list.get(i);
     * result.add(element); }
     *
     * // result now holds a reversed copy of the original list return result; }
    *
     */
}
