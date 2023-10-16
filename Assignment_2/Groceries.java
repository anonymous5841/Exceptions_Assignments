public class Groceries extends Products{
    private int expiry_date;

    private String nutritional_value;

    public int getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(int expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getNutritional_value() {
        return nutritional_value;
    }

    public void setNutritional_value(String nutritional_value) {
        this.nutritional_value = nutritional_value;
    }

}
