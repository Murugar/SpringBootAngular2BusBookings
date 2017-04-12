package org.iqmsoft.boot.angular2.bus.bookings.services;

import java.util.List;

import org.iqmsoft.boot.angular2.bus.bookings.domain.Role;

public interface RoleService {
    Role addRole(Role role);
    List<Role> getAllRoles();
    Role updateRole(Role role);
    void deleteRole(Long id);
    Role createOrGetRoleUser();
}
