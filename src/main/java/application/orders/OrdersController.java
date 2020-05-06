package application.orders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import application.orders.models.OrdersRepository;

public class OrdersController {
	
	private static Logger logger =  LoggerFactory.getLogger(OrdersController.class);
    
    @Autowired
    private OrdersRepository ordersRepo;
    
    /**
     * check
     */
    @RequestMapping("/check")
    protected @ResponseBody String check() {
        return "it works!";
    }

}
