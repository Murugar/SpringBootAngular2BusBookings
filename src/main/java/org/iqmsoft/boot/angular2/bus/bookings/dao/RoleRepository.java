package org.iqmsoft.boot.angular2.bus.bookings.dao;

import org.iqmsoft.boot.angular2.bus.bookings.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findOneByName(String name);
}
