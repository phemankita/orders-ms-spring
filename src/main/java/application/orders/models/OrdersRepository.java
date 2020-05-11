package application.orders.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OrdersRepository extends CrudRepository<Order, Long> {
	List<Order> findByCustomerIdOrderByDateDesc(String customerId);
}
