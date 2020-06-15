package tacos.data;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import tacos.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
  List<Order> findByDeliveryZip(String deliveryZip);

  List<Order> readOrdersByDeliveryZipAndPlacedAtAndPlacedAtBetween(String deliveryZip,
      Date startDate, Date endDate);
}
