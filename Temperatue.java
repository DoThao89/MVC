package jdbcapp.mvc.weatherofday;

public class Temperatue {
    private int Value;
    private String Unit;
    private int UnitType;

    public Temperatue(int value, String unit, int unitType) {
        Value = value;
        Unit = unit;
        UnitType = unitType;
    }

    public static void add(Temperatue temperatue) {
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public int getUnitType() {
        return UnitType;
    }

    public void setUnitType(int unitType) {
        UnitType = unitType;
    }
}
