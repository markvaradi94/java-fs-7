package ro.fasttrackit.course7.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String shopId;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
        this.shopId = UUID.randomUUID().toString();
    }
}
