package java5.sof2021.reposittory;

import org.springframework.data.jpa.repository.JpaRepository;

import java5.sof2021.entities.Order_details;

public interface OrderDetailRepo extends JpaRepository<Order_details, Integer>{

}
