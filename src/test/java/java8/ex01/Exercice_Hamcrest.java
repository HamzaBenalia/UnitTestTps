package java8.ex01;
import org.epsi.data.Data;
import org.epsi.data.domain.Pizza;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * Assertions Hamcrest
 */
public class Exercice_Hamcrest {

    @Test
    public void test_is() throws Exception {
        //Arrange ==> Vérifier si l'une des pizzas a un prix >= 1300
        List<Pizza> pizzas = new Data().getPizzas();
        //Act ==> Vérifier si l'une des pizzas a un prix >= 1300
        Boolean result =  pizzas.stream().anyMatch(p -> p.getPrice() >= 1300);

        // Assert ==>
        assertThat(result, is(true));
    }

    @Test
    public void test_hasSize() throws Exception {
        //Arrange
        List<Pizza> pizzas = new Data().getPizzas();

        //Act
        List<Pizza> result =  pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        // Assert
        assertThat(result, hasSize(3));
    }


    @Test
    public void test_hasProperty() throws Exception {
        //Arrange
        List<Pizza> pizzas = new Data().getPizzas();

        //Act
        Pizza result = pizzas.stream().max(Comparator.comparing(Pizza::getPrice)).orElseThrow();

        // Assert
        assertThat(result, hasProperty("name", equalTo("La Cannibale")));
    }

    @Test
    public void test_everyItem() throws Exception {
        //Arrange
        List<Pizza> pizzas = new Data().getPizzas();

        //Act
        List<Pizza> result =  pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        //Assert
        assertThat(result, everyItem(hasProperty("price", greaterThanOrEqualTo(1300))));
    }
}
