package main.java.com.hw7.Family;

import java.util.Comparator;

public class ComporatorToEmblemsFamily implements Comparator<Family> {

    @Override
    public int compare(Family fam1, Family fam2) {
        return fam1.getNameOfEmblem().length() - fam2.getNameOfEmblem().length();
    }
}