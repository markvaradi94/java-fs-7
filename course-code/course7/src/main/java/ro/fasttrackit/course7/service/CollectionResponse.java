package ro.fasttrackit.course7.service;

import lombok.Builder;

import java.util.List;

@Builder
public record CollectionResponse<T>(
        List<T> content,
        PageInfo pageInfo
) {
}
