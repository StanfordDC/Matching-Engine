import java.util.*;
import java.text.DecimalFormat;
public class IcebergOrder extends LimitOrder{

    static final StockExchange stockExchange = StockExchange.getStockExchange();
    static final HashMap<Order, Integer> sellRecords = stockExchange.getSellOrders();
    static final HashMap<Order, Integer> buyRecords = stockExchange.getBuyOrders();
    static final ArrayList<Order> orderRecords = stockExchange.getOrderRecords();
    
    private int size;
    
    public IcebergOrder(String name, double price, int quantity, Side side, Type type){
        super(name, price, quantity, side, type);
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "You have placed an Iceberg "+this.getSide().toLower()+" order for "+this.getQuantity()+" "+this.getName()+" shares at $"+df.format(this.getPrice())+" each";
    }
}
