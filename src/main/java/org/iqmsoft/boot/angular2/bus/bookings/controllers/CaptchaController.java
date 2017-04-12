package org.iqmsoft.boot.angular2.bus.bookings.controllers;

import org.iqmsoft.boot.angular2.bus.bookings.dto.CaptchaDto;
import org.iqmsoft.boot.angular2.bus.bookings.services.CaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/captcha")
public class CaptchaController {
    @Autowired
    CaptchaService captchaService;

    @RequestMapping("")
    public CaptchaDto getNewCaptcha() {
        return captchaService.createCaptcha();
    }
}
