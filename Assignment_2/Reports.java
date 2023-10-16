public class Reports {

    Groceries groceries = new Groceries();

    Furniture furniture = new Furniture();

    Electronics electronics = new Electronics();

    public Reports(Groceries groceries, Furniture furniture, Electronics electronics) {
        this.groceries = groceries;
        this.furniture = furniture;
        this.electronics = electronics;
    }

    public  String SalesTrend(){
//
//       if(groceries.getSell())
//        return groceries.getSell();
        return "true";
    }
}
