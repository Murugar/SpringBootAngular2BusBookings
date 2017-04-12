package org.iqmsoft.boot.angular2.bus.bookings.services;

import org.iqmsoft.boot.angular2.bus.bookings.domain.User;
import org.iqmsoft.boot.angular2.bus.bookings.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User addUser(UserDto userDto);
    User getUserById(Long id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(Long id);
}
