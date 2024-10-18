package dev;
import org.epsi.AppException;
import org.epsi.DistanceLevenshtein;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class DistanceLevenshteinTest {

    private DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    @Test
    @Tag("validation")
    public void testNullFirstParameter() {
        // Vérifie que l'exception est levée pour un premier paramètre null
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance(null, "mot");
        });
        assertEquals("Le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Tag("validation")
    @Test
    public void testEmptyFirstParameter() {
        // Vérifie que l'exception est levée pour un premier paramètre vide
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("", "mot");

        });
        assertEquals("Le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    @Tag("validation")
    public void testNullSecondParameter() {
        // Vérifie que l'exception est levée pour un second paramètre null
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", null);
        });
        assertEquals("Le second paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    @Tag("validation")
    public void testEmptySecondParameter() {
        // Vérifie que l'exception est levée pour un second paramètre vide
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", "");
        });
        assertEquals("Le second paramètre ne peut être null ou vide", exception.getMessage());
    }
}
