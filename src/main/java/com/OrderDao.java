package com;

 

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 

import org.springframework.stereotype.Repository;

 

@Repository

 

public class OrderDao {
    public List<Order>  getOrders(){
        return Stream.of(
                new Order(101,"Mobile",1,54000),
                new Order(102,"Book",5,45000),
                new Order(103,"Laptop",9,50000)

                ).collect(Collectors.toList());
    }

 

}