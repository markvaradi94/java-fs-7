package ro.fasttrackit.course7.service;

import lombok.Builder;

@Builder
public record PageInfo(
        int totalPages,
        int totalElements,
        int crtPage,
        int pageSize
) {
}
