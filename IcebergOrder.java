import java.util.*;
import java.text.DecimalFormat;
public class IcebergOrder extends Order{

    static final StockExchange stockExchange = StockExchange.getStockExchange();
    static final HashMap<Order, Integer> sellRecords = stockExchange.getSellOrders();
    static final HashMap<Order, Integer> buyRecords = stockExchange.getBuyOrders();
    static final ArrayList<Order> orderRecords = stockExchange.getOrderRecords();
    
    public IcebergOrder(String name, double price, int quantity, Side side, Type type){
        super(name, price, quantity, side, type);
    }

    @Override 
}
