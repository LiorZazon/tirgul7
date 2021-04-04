package com.company;

import java.util.Comparator;

public class ContinentCompareByPopulation implements Comparator<Continent> {

    @Override
    public int compare(Continent o1, Continent o2) {
        return o1.getM_population().compareTo(o2.getM_population());
    }
}
