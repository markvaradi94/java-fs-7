package ro.fasttrackit.course7.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String category;

    public Category(String category) {
        this.category = category;
    }
}
