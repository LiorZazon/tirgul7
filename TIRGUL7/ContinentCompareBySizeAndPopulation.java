package com.company;

import java.util.Comparator;

public class ContinentCompareBySizeAndPopulation implements Comparator<Continent> {

    @Override
    public int compare(Continent o1, Continent o2) {
        if (o1.getM_size().equals(o2.getM_size())){
            return o1.getM_population().compareTo(o2.getM_population());
        }
        else {
            return o1.getM_population().compareTo(o2.getM_population());
        }
    }
}
