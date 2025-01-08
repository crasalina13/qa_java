import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionNotParameterizedTest {

    @Mock
    Feline feline;

    @Test
    public void testDivisionDoesHaveManeThrowsException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Вертолет", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedCount = 0;
        int actualCount = lion.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of();
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }
}
