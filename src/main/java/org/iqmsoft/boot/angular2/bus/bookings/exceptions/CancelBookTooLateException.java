package org.iqmsoft.boot.angular2.bus.bookings.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "cancel_booked_too_late")
public class CancelBookTooLateException extends RuntimeException {
}
