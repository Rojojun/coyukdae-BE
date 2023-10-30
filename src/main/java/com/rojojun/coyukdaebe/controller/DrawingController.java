package com.rojojun.coyukdaebe.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("/games/drawing")
public class DrawingController {

    @PostMapping("/picture/draw")
    public void drawPicture() {

    }

    @GetMapping("/picture/show")
    public void showPicture() {

    }
}
