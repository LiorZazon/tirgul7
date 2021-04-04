package com.company;

import java.util.Comparator;

public class ContinentCompareBySize implements Comparator<Continent> {
    @Override
    public int compare(Continent o1, Continent o2) {
        return o1.getM_size().compareTo(o2.getM_size());
    }
}
