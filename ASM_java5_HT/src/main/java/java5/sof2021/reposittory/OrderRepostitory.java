package java5.sof2021.reposittory;

import org.springframework.data.jpa.repository.JpaRepository;

import java5.sof2021.entities.Order;

public interface OrderRepostitory extends JpaRepository<Order, Integer> {

}
