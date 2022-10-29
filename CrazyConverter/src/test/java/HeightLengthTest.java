import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;


public class HeightLengthTest {
    Converter sut = new Converter();


    @Test
    public void standardizeUserValue_converts_cm() {
        //arrange
        BigDecimal testValueCm = BigDecimal.valueOf(55);
        String unitsCm = "cm";
        BigDecimal expectedValue = BigDecimal.valueOf(0.55);
        //act

        BigDecimal actualValue = sut.standardizeUserValue(testValueCm, unitsCm);

        //assert
        Assert.assertTrue(expectedValue.compareTo(actualValue) == 0);

    }

    @Test
    public void standardizedUserValue_converts_ft() {
        //arrange
        BigDecimal testValueFt = BigDecimal.valueOf(13);
        String unitsFt = "ft";
        BigDecimal expectedValue = BigDecimal.valueOf(3.96);
        //act

        BigDecimal actualValue = sut.standardizeUserValue(testValueFt, unitsFt);
        //assert
        Assert.assertTrue(expectedValue.compareTo(actualValue) == 0);

    }

    @Test
    public void standardizedUserValue_converts_km() {
        //arrange
        BigDecimal testValueKm = BigDecimal.valueOf(2.2);
        String unitsKm = "km";
        BigDecimal expectedValue = BigDecimal.valueOf(2200);
        //act

        BigDecimal actualValue = sut.standardizeUserValue(testValueKm, unitsKm);
        //assert
        Assert.assertTrue(expectedValue.compareTo(actualValue) == 0);

    }




}
