import java.util.ArrayList;

public class StockDetailsService {

    private ArrayList<StockDetailsModel> stockList = new ArrayList<>();

    public void addStock() {
        int option = 0;
        while(option != 2) {
            System.out.println("Enter 1 for Add new Stock.");
            System.out.println("Enter 2 for Leave.");
            option = StockDetailsModel.readInteger();
            switch (option) {
                case 1:
                    String name =  StockDetailsModel.getName();
                    int price = StockDetailsModel.getPrice();
                    int number = StockDetailsModel.getNumberOfShares();
                    StockDetailsModel stockAccountModel = new StockDetailsModel(name, price, number);
                    stockList.add(stockAccountModel);
                    break;
                case 2:
                    break;
            }
        }
    }

    public void displayRecord() {
        for (StockDetailsModel item: stockList) {
            System.out.println("--------------------***-Your Record-***-----------------");
            System.out.println(item);
            int shareValue = item.numberOfShares * item.price;
            System.out.print("Share value of "+item.name+" : "+shareValue +"\n");
        }
        System.out.println("--------------------------------------------------------");

    }

    public void getStockDetails() {
        System.out.println("Enter name of Stock.");
        String stockName = StockDetailsModel.readString();
        for (StockDetailsModel item : stockList){
            if (item.name.equals(stockName)){
                System.out.println(item);
                int shareValue = item.numberOfShares * item.price;
                System.out.println("Total share value : "+shareValue);
            }
        }
    }
}