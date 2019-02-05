//This may be removed

package com.example.inventorymanager.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ordered_items")
public class OrderItem {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private Integer orderQty;

    @NotNull
    @ManyToOne
    private Item item;

    @NotNull
    @ManyToOne
    private Order order;

    public OrderItem() {
    }

    public OrderItem(Integer orderQty, Item item, Order order) {
        this.orderQty = orderQty;
        this.item = item;
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    public Order getOrder(){
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}