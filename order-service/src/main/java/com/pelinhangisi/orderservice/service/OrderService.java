package com.pelinhangisi.orderservice.service;


import com.pelinhangisi.orderservice.dao.OrderRepository;
import com.pelinhangisi.orderservice.dto.OrderLineItemsDto;
import com.pelinhangisi.orderservice.dto.OrderRequest;
import com.pelinhangisi.orderservice.model.Orderr;
import com.pelinhangisi.orderservice.model.OrderLineItems;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Orderr orderr = new Orderr();
        orderr.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());

        orderr.setOrderLineItemsList(orderLineItems);

        orderRepository.save(orderr);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        return orderLineItems;
    }
}
