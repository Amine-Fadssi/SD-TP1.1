package metier;

import org.example.metier.Calcul;
import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testCalcul(){
        calcul = new Calcul();
        double a=5; double b=2;

        double expected = 7;
        double result = calcul.somme(a, b);
        Assert.assertTrue(result == expected);
    }
}
