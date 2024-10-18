package ex02;
import org.epsi.data.Data;
import org.epsi.data.domain.Pizza;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * Assertions Hamcrest
 */
public class Exercice_assertJ {

    @Test
    public void test_is() throws Exception {
        // Arrange: Préparer les données de test
        List<Pizza> pizzas = Arrays.asList(
                new Pizza(1, "Margherita", 1200),
                new Pizza(2, "Pepperoni", 1300),
                new Pizza(3, "La Cannibale", 1500)
        );

        // Act: Effectuer l'opération à tester
        boolean result = pizzas.stream().anyMatch(p -> p.getPrice() >= 1300);

        // Assert: Vérifier le résultat
        assertThat(result)
                .as("Vérification que l'une des pizzas a un prix supérieur ou égal à 1300")
                .isTrue();
    }

    @Test
    public void test_hasSize() throws Exception {
        // Arrange: Préparer les données de test
        List<Pizza> pizzas = new Data().getPizzas();

        // Act: Effectuer l'opération à tester
        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        // Assert: Vérifier le résultat
        assertThat(result)
                .as("Vérification que la liste des pizzas filtrées a exactement 3 éléments")
                .hasSize(3);
    }

    @Test
    public void test_hasProperty() throws Exception {
        // Arrange: Préparer les données de test
        List<Pizza> pizzas = new Data().getPizzas();

        // Act: Effectuer l'opération à tester
        Pizza result = pizzas.stream().max(Comparator.comparing(Pizza::getPrice)).orElseThrow();

        // Assert: Vérifier le résultat
        assertThat(result)
                .as("Vérification que la pizza la plus chère a le nom 'La Cannibale'")
                .hasFieldOrPropertyWithValue("name", "La Cannibale");
    }

    @Test
    public void test_everyItem() throws Exception {
        // Arrange: Préparer les données de test
        List<Pizza> pizzas = new Data().getPizzas();

        // Act: Effectuer l'opération à tester
        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        // Assert: Vérifier le résultat
        assertThat(result)
                .as("Vérification que chaque pizza dans la liste filtrée a un prix supérieur ou égal à 1300")
                .allMatch(p -> p.getPrice() >= 1300);
    }
}
