public class Toy {
    private int code;
    private String name;
    private int numberArticulations;
    private double unitPrice;
    private int limitAge;
    private String clothesType;

    public Toy(int code, String name, int numberArticulations, double unitPrice, int limitAge,
                String clothesType, String mainEnenmyName) {
        this.code = code;
        this.name = name;
        this.numberArticulations = numberArticulations;
        this.unitPrice = unitPrice;
        this.limitAge = limitAge;
        this.clothesType = clothesType;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberArticulations() {
        return this.numberArticulations;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }
    
    public int getLimitAge() {
        return this.limitAge;
    }

    public String getClothesType() {
        return this.clothesType;
    }
}