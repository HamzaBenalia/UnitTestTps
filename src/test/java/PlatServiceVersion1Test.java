import dev.dao.IPlatDao;
import dev.entite.Plat;
import dev.exception.PlatException;
import dev.service.PlatServiceVersion1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class PlatServiceVersion1Test {


    @Mock
    private IPlatDao platDao;

    @InjectMocks
    private PlatServiceVersion1 platService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Teste la méthode listerPlats pour s'assurer que les noms des plats
     * sont bien retournés en majuscules.
     */
    @Test
    public void testListerPlatsRetourneListeAvecMajuscules() {
        //  Arrange
        // Préparation des données avec un mock du DAO retournant une liste de plats
        List<Plat> plats = Arrays.asList(
                new Plat("spaghetti", 1200),
                new Plat("pizza", 1500)
        );
        when(platDao.listerPlats()).thenReturn(plats);

        //  Act
        // Appel de la méthode à tester
        List<Plat> result = platService.listerPlats();

        // Assert
        // Vérification que les noms des plats sont bien transformés en majuscules
        assertEquals("SPAGHETTI", result.get(0).getNom());
        assertEquals("PIZZA", result.get(1).getNom());

        // Vérification que le DAO a bien été appelé une fois
        verify(platDao, times(1)).listerPlats();
    }

    /**
     * Teste la méthode listerPlats pour s'assurer qu'elle lève une PlatException
     * lorsque le DAO lance une NullPointerException.
     */
    @Test
    public void testListerPlatsRetourneNullPointerException() {
        //  Arrange
        // Simuler le comportement du DAO pour lancer une NullPointerException
        when(platDao.listerPlats()).thenThrow(new NullPointerException());

        //  Act
        // Appel de la méthode et vérification que PlatService lève une PlatException
        PlatException exception = assertThrows(PlatException.class, () -> platService.listerPlats());

        //  Assert
        // Vérification que la cause de l'exception est bien une NullPointerException
        assertEquals(NullPointerException.class, exception.getCause().getClass());

        // Vérification que le DAO a bien été appelé une fois
        verify(platDao, times(1)).listerPlats();
    }

}
