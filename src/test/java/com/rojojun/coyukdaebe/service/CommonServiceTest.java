package com.rojojun.coyukdaebe.service;

import com.rojojun.coyukdaebe.dto.NicknameRequestDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev"})
@SpringBootTest
class CommonServiceTest {

    @Autowired
    CommonService commonService = new CommonService();

    @Test
    void 닉네임_제작 () {
        NicknameRequestDto nicknameRequestDto = new NicknameRequestDto("lala");
        String nickname = commonService.createNickname(nicknameRequestDto);

        Assertions.assertEquals("lala", nickname);
    }
}
