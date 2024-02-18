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
 * @author Hp
 */
public class BinarySearch {
    /**
     * Binary Search by rank*
     */
    public KnownForbes binarySearchByRank(int targetRank, ArrayList<KnownForbes>listForbes) {
        int low = 0;
        int high = listForbes.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            KnownForbes forbesBillionaire = listForbes.get(mid);
            int currentRank = forbesBillionaire.getRank();

            if (currentRank == targetRank) {
                // Found the target rank
                return forbesBillionaire;
            } else if (currentRank < targetRank) {
                // Target rank is in the right half
                low = mid + 1;
            } else {
                // Target rank is in the left half
                high = mid - 1;
            }
        }

        // Target rank not found
        return null;
    }

    /**
     * Binary Search by networth*
     */
    public List<KnownForbes> binarySearchByNetworth(double target, ArrayList<KnownForbes> listForbes) {
        List<KnownForbes> resultList = new ArrayList<>();

        int low = 0;
        int high = listForbes.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            KnownForbes forbesBillionaire = listForbes.get(mid);
            double currentNetworth = forbesBillionaire.getNetworth();

            if (currentNetworth == target) {
                // add to the result list if found
                resultList.add(forbesBillionaire);

                // Check for more result
                int left = mid - 1;
                while (left >= 0 && listForbes.get(left).getNetworth() == target) {
                    resultList.add(listForbes.get(left));
                    left--;
                }

                // Check for more result
                int right = mid + 1;
                while (right < listForbes.size() && listForbes.get(right).getNetworth() == target) {
                    resultList.add(listForbes.get(right));
                    right++;
                }

                return resultList;
            } else if (currentNetworth < target) {
                // it is in right half
                low = mid + 1;
            } else {
                // it is in left half
                high = mid - 1;
            }
        }

        // neworth not found
        return null;
    }

    /**
     * Binary Search by full name*
     */
    public KnownForbes binarySearchByName(String targetFirstName, ArrayList<KnownForbes> listForbes) {
        int low = 0;
        int high = listForbes.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            KnownForbes midBillionaire = listForbes.get(mid);
            String midFullName = midBillionaire.getFullName();

            // Split the full name into first name
            String[] names = midFullName.split(" ");
            String midFirstName = names[0];
            String midLastName = names[1];

            // Check if either first name matches the target
            if (midFirstName.equalsIgnoreCase(targetFirstName) || midLastName.equalsIgnoreCase(targetFirstName)) {
                return midBillionaire; // Found the target
            }

            String targetFullName = targetFirstName + " " + midLastName;
            int nameCompare = midFullName.compareToIgnoreCase(targetFullName);
            if (nameCompare < 0) {
                low = mid + 1; // search range to the right half
            } else {
                high = mid - 1; // search range to the left half
            }
        }

        return null;

    }

    public KnownForbes binarySearchByFullName(String target, ArrayList<KnownForbes> listForbes) {
        int low = 0;
        int high = listForbes.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            KnownForbes midBillionaire = listForbes.get(mid);
            String midFullName = midBillionaire.getFullName();

            // Compare full names
            int nameComparison = midFullName.compareToIgnoreCase(target);

            if (nameComparison == 0) {
                // Found a match
                return midBillionaire;
            } else if (nameComparison < 0) {
                // Adjust the search range to the right half
                low = mid + 1;
            } else {
                // Adjust the search range to the left half
                high = mid - 1;
            }
        }

        // Full name not found
        return null;
    }

    /**
     * Binary Search by source*
     */
    public List<KnownForbes> binarySearchBySource(ArrayList<KnownForbes> listForbes, String targetSource) {
        List<KnownForbes> resultList = new ArrayList<>();

        int low = 0;
        int high = listForbes.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            KnownForbes forbesBillionaire = listForbes.get(mid);
            String currentSource = forbesBillionaire.getSource();

            if (currentSource.equalsIgnoreCase(targetSource)) {
                // add to the result list 
                resultList.add(forbesBillionaire);

                // Check for additional result
                int left = mid - 1;
                while (left >= 0 && listForbes.get(left).getSource().equalsIgnoreCase(targetSource)) {
                    resultList.add(listForbes.get(left));
                    left--;
                }

                // Check for additional result
                int right = mid + 1;
                while (right < listForbes.size() && listForbes.get(right).getSource().equalsIgnoreCase(targetSource)) {
                    resultList.add(listForbes.get(right));
                    right++;
                }

                return resultList;
            } else if (currentSource.compareTo(targetSource) < 0) {
                // check right
                low = mid + 1;
            } else {
                // check left
                high = mid - 1;
            }
        }

        // source not found
        return null;
    }

}
