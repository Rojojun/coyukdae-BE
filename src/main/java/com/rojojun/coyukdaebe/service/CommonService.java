package com.rojojun.coyukdaebe.service;

import com.rojojun.coyukdaebe.dto.NicknameRequestDto;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    public String createNickname(NicknameRequestDto nicknameRequestDto) {
        return nicknameRequestDto.name();
    }
}
