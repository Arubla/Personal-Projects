import java.math.BigDecimal;

public class CrazyConverterUnit {
    //fields
    private int id;
    private String unitString;
    private BigDecimal unitValue;

    //constructor

    public CrazyConverterUnit(int id, String unitString, BigDecimal unitValue) {
        this.id = id;
        this.unitString = unitString;
        this.unitValue = unitValue;
    }

    //getters  //setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnitString() {
        return unitString;
    }

    public void setUnitString(String unitString) {
        this.unitString = unitString;
    }

    public BigDecimal getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(BigDecimal unitValue) {
        this.unitValue = unitValue;
    }


    //toString override
    @Override
    public String toString() {
        return unitString;
    }
}
