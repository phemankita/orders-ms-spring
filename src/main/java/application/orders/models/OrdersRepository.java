package application.orders.models;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, String> {
	List<Order> findByCustomerIdOrderByDateDesc(String customerId);
}
