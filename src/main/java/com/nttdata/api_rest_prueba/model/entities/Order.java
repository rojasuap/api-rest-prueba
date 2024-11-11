package com.nttdata.api_rest_prueba.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="orders")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="order_number", nullable = false, unique = true, length = 100)
    private String orderNumber;

    @Column(name="order_date",nullable = false)
    private LocalDateTime orderDate;

    @Column(name="order_delivery")
    private LocalDateTime deliveryDate;

    @Column(name = "status",nullable = false, length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false, referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetails> orderDetails;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;
        return Objects.equals(id, order.id) && orderNumber.equals(order.orderNumber);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + orderNumber.hashCode();
        return result;
    }
}
