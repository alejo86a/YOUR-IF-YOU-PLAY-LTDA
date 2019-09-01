public class ActionToy extends Toy{
    private String mainEnenmyName;

    public ActionToy(int code, String name, int numberArticulations, double unitPrice, int limitAge,
    String clothesType, String mainEnenmyName) {
        super(code, name, numberArticulations, unitPrice, limitAge,
        clothesType);
        this.mainEnenmyName = mainEnenmyName;
    }
}