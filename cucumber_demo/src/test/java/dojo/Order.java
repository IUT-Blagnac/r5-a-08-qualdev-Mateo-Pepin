package dojo;

import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;
    public void declareOwner(String x) {
        owner = x;
    }

    public void declareTarget(String x) {
        target = x;
    }

    public List<String> getCocktails() {
        return cocktails;
    }
}
