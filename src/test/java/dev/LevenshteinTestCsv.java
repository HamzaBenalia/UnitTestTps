package dev;

import org.epsi.DistanceLevenshtein;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LevenshteinTestCsv {

    private DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    @ParameterizedTest
    @CsvFileSource(resources = "/dev/levenshtein/DistanceLevenshtein.csv", numLinesToSkip = 1)
    @Tag("distance")
    void testLevenshteinDistanceFromCSV(String mot1, String mot2, int expectedDistance) {
        // Calculer la distance de Levenshtein
        int actualDistance = distanceLevenshtein.calculerDistance(mot1, mot2);

        // Vérifier que la distance calculée correspond à celle du fichier CSV
        assertEquals(expectedDistance, actualDistance,
                "La distance pour les mots " + mot1 + " et " + mot2 + " ne correspond pas");
    }
}
