package com.project.lltalproject.dto.account.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AccountEditProfileImageUrlRequestDto {
    private String oldProfileImageUrl;
    @NotBlank(message = "공백일 수 없습니다.")
    private  String newProfileImageUrl;
}
