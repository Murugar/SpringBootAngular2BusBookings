package org.iqmsoft.boot.angular2.bus.bookings.services;

import org.iqmsoft.boot.angular2.bus.bookings.domain.Captcha;
import org.iqmsoft.boot.angular2.bus.bookings.dto.CaptchaDto;

public interface CaptchaService {
    CaptchaDto createCaptcha();
    boolean isCaptchaValid(Captcha captcha);
}
