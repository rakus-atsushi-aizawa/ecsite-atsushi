package com.example.domain;

import java.util.List;

public class OrderItem {

	private Integer id;
	private Integer itemId;
	private Integer orderId;
	private Integer quantity;
	private Character size;
	private Item item;
	private List<OrderTopping> orderToppingList;
	
	public int getSubTotal() {
		int subTotal = 0;
		for (OrderTopping orderTopping : orderToppingList) {
			Topping topping = orderTopping.getTopping();
			if (size == 'M') {
				subTotal += topping.getPriceM();
			}else {
				subTotal += topping.getPriceL();
			}
		}
		if (size == 'M') {
			subTotal += item.getPriceM() * quantity;
		}else {
			subTotal += item.getPriceL() * quantity;
		}
		return subTotal;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Character getSize() {
		return size;
	}
	public void setSize(Character size) {
		this.size = size;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public List<OrderTopping> getOrderToppingList() {
		return orderToppingList;
	}
	public void setOrderToppingList(List<OrderTopping> orderToppingList) {
		this.orderToppingList = orderToppingList;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", itemId=" + itemId + ", orderId=" + orderId + ", quantity=" + quantity
				+ ", size=" + size + ", item=" + item + ", orderToppingList=" + orderToppingList + "]";
	}
}
