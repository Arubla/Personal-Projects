import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class WeightTest {


    Converter sut = new Converter();


    @Test
    public void standardizeUserValue_converts_mg() {
        //arrange
        BigDecimal testWeightMg = BigDecimal.valueOf(55);
        String unitsMg = "mg";
        BigDecimal expectedValue = BigDecimal.valueOf(0.06);//testing the rounding
        //act

        BigDecimal actualValue = sut.standardizeUserValue(testWeightMg, unitsMg);

        //assert
        Assert.assertTrue(expectedValue.compareTo(actualValue) == 0);

    }

    @Test
    public void standardizedUserValue_converts_kg() {
        //arrange
        BigDecimal testWeightKg = BigDecimal.valueOf(13);
        String unitsMg = "kg";
        BigDecimal expectedValue = BigDecimal.valueOf(13000);
        //act

        BigDecimal actualValue = sut.standardizeUserValue(testWeightKg, unitsMg);
        //assert
        Assert.assertTrue(expectedValue.compareTo(actualValue) == 0);

    }

    @Test
    public void standardizedUserValue_converts_t() {
        //arrange
        BigDecimal testWeightT = BigDecimal.valueOf(2.2);
        String unitsMg = "t";
        BigDecimal expectedValue = BigDecimal.valueOf(2200000);
        //act

        BigDecimal actualValue = sut.standardizeUserValue(testWeightT, unitsMg);
        //assert
        Assert.assertTrue(expectedValue.compareTo(actualValue) == 0);

    }

}
