package com.soukaina.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("product")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ProductEntity {
    @Id
    private String id;
    @Field("Name")
    private String name;
    @Field("Description")
    private String description;
    @Field("Price")
    private double price;
    @Transient
    private String serverPort;
}
