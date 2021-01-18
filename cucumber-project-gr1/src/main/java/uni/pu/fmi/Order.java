package uni.pu.fmi;
import java.util.*;

/**
 * 
 */
public class Order {

    /**
     * Default constructor
     */
    public Order() {
    }

    /**
     * 
     */
    public String id;

    /**
     * 
     */
    public Date date;

    /**
     * 
     */
    public String status;

    /**
     * 
     */
    public User user;

    /**
     * 
     */
    public Set<Item> items;

}