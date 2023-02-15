package ro.fasttrackit.course7.model;

import java.util.List;

public record ProductFilters(
        List<String> name,
        List<String> description,
        List<String> shopId,
        List<String> id
) {
}
