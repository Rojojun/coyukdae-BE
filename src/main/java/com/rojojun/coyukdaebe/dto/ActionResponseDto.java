package com.rojojun.coyukdaebe.dto;

import java.util.List;

public record ActionResponseDto(
        String message,
        List<String> users
) {
}
