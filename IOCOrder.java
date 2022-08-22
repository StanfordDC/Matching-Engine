import java.util.*;
import java.text.DecimalFormat;
public class IOCOrder extends LimitOrder{
    
    public IOCOrder(String name, double price, int quantity, Side side, Type type){
        super(name, price, quantity, side, type);
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "You have placed an IOC "+this.getSide().toLower()+" order for "+this.getQuantity()+" "+this.getName()+" shares at $"+df.format(this.getPrice())+" each";
    }
    
}
