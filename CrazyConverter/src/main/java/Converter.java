import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Converter {
    private Map<String, CrazyConverterUnit> crazyConverterLengthMap = new HashMap<>();
    private Map<String, CrazyConverterUnit> crazyConverterWeightMap = new HashMap<>();
    private Map<String, CrazyConverterUnit> crazyConverterHeightMap = new HashMap<>();
    //this map stores all the values available to be chosen by the user

    public Converter() {
        //populate the map //TODO convert this into a persistent inventory.
        //length, all units in meters
        CrazyConverterUnit pencil = new CrazyConverterUnit("1", "new pencils", BigDecimal.valueOf(0.19));
        crazyConverterLengthMap.put(pencil.getId(), pencil);
        CrazyConverterUnit boaConstrictor = new CrazyConverterUnit("2", "boa constrictors", BigDecimal.valueOf(2.10312));
        crazyConverterLengthMap.put(boaConstrictor.getId(), boaConstrictor);
        CrazyConverterUnit schoolBus = new CrazyConverterUnit("3", "school buses", BigDecimal.valueOf(13.716));
        crazyConverterLengthMap.put(schoolBus.getId(), schoolBus);
        CrazyConverterUnit brooklynBridge = new CrazyConverterUnit("4", "Brooklyn Bridges", BigDecimal.valueOf(1833.677));
        crazyConverterLengthMap.put(brooklynBridge.getId(), brooklynBridge);
        CrazyConverterUnit wyoming = new CrazyConverterUnit("5", "Wyomings", BigDecimal.valueOf(451000));
        crazyConverterLengthMap.put(wyoming.getId(), wyoming);
        //weight, all units in g
        CrazyConverterUnit turkeyFeather = new CrazyConverterUnit("1", "turkey feathers", BigDecimal.valueOf(0.0082));
        crazyConverterWeightMap.put(turkeyFeather.getId(), turkeyFeather);
        CrazyConverterUnit tennisBall = new CrazyConverterUnit("2", "tennis balls", BigDecimal.valueOf(57));
        crazyConverterWeightMap.put(tennisBall.getId(), tennisBall);
        CrazyConverterUnit gallonWater = new CrazyConverterUnit("3", "gallons of water", BigDecimal.valueOf(3790));
        crazyConverterWeightMap.put(gallonWater.getId(), gallonWater);
        CrazyConverterUnit muhammadAli = new CrazyConverterUnit("4", "Muhammad Alis", BigDecimal.valueOf(107000));
        crazyConverterWeightMap.put(muhammadAli.getId(), muhammadAli);
        CrazyConverterUnit elephant = new CrazyConverterUnit("5", "healthy elephants", BigDecimal.valueOf(5221000));
        crazyConverterWeightMap.put(elephant.getId(), elephant);
        //height, all units in m
        CrazyConverterUnit fireHydrant = new CrazyConverterUnit("1", "fire hydrants", BigDecimal.valueOf(0.6096));
        crazyConverterHeightMap.put(fireHydrant.getId(), fireHydrant);
        CrazyConverterUnit kangaroo = new CrazyConverterUnit("2", "average kangaroos", BigDecimal.valueOf(2.0));
        crazyConverterHeightMap.put(kangaroo.getId(), kangaroo);
        CrazyConverterUnit doubleDeckerBus = new CrazyConverterUnit("3", "double-decker buses", BigDecimal.valueOf(4.2672));
        crazyConverterHeightMap.put(doubleDeckerBus.getId(), doubleDeckerBus);
        CrazyConverterUnit empireStateBuilding = new CrazyConverterUnit("4", "Empire State Buildings", BigDecimal.valueOf(443.1792));
        crazyConverterHeightMap.put(empireStateBuilding.getId(), empireStateBuilding);
        CrazyConverterUnit mtFuji = new CrazyConverterUnit("5", "Mt. Fujis", BigDecimal.valueOf(3776));
        crazyConverterHeightMap.put(mtFuji.getId(), mtFuji);
    }

    public String runConversion(BigDecimal userValue, String valueUnits, Map<String, CrazyConverterUnit> crazyConverterMap, String mapKey) {
        BigDecimal standardizedUserValue = standardizeUserValue(userValue, valueUnits);
        CrazyConverterUnit crazyConverterUnit = crazyConverterMap.get(mapKey);

        BigDecimal convertedValue = standardizedUserValue.divide(crazyConverterUnit.getUnitValue(),2, RoundingMode.HALF_UP);

        String conversion = userValue + valueUnits + " is " + convertedValue.toString() + " " + crazyConverterUnit.toString() + ".";
        return conversion;
    }

    public BigDecimal standardizeUserValue(BigDecimal userValue, String valueUnits) {
        //this method runs a switch case to check which units we're working with, performs
        //the correct conversion on userValue to m, and returns the new BigDecimal. If the user
        //didn't provide valid units, the method returns null.
        if (valueUnits.equalsIgnoreCase("cm") || valueUnits.equalsIgnoreCase("ft") ||
                valueUnits.equalsIgnoreCase("m") || valueUnits.equalsIgnoreCase("km")) {
          //TODO implement rounding BigD
            switch (valueUnits) {
                case "cm":
                    return userValue.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
                case "ft":
                    return userValue.divide(BigDecimal.valueOf(3.281), 2, RoundingMode.HALF_UP);
                case "m":
                    return userValue;
                case "km":
                    return userValue.multiply(BigDecimal.valueOf(1000));
                default:
                    return null;
            }
        } else if (valueUnits.equalsIgnoreCase("mg") || valueUnits.equalsIgnoreCase("g") ||
                valueUnits.equalsIgnoreCase("kg") || valueUnits.equalsIgnoreCase("t")) {
            switch (valueUnits) {
                case "mg":
                    return userValue.divide(BigDecimal.valueOf(1000), 2, RoundingMode.HALF_UP);
                case "g":
                    return userValue;
                case "kg":
                    return userValue.multiply(BigDecimal.valueOf(1000));
                case "t":
                    return userValue.multiply(BigDecimal.valueOf(1000000));
            }
        }
         return null;
}

    public Map<String, CrazyConverterUnit> getCrazyConverterLengthMap() {
        return crazyConverterLengthMap;
    }

    public Map<String, CrazyConverterUnit> getCrazyConverterWeightMap() {
        return crazyConverterWeightMap;
    }

    public Map<String, CrazyConverterUnit> getCrazyConverterHeightMap() {
        return crazyConverterHeightMap;
    }
}
