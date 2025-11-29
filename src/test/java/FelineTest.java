import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertThat(actualFood, is(expectedFood));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertThat(actualFamily, is(expectedFamily));
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals("Неправильное число котят", expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getManyKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 3;
        int actualKittensCount = feline.getKittens(3);
        Assert.assertEquals("Неправильное число котят", expectedKittensCount, actualKittensCount);
    }
}
