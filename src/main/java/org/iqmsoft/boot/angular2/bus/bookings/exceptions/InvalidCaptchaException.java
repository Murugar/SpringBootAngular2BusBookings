package org.iqmsoft.boot.angular2.bus.bookings.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "invalid_captcha")
public class InvalidCaptchaException extends RuntimeException {
}
