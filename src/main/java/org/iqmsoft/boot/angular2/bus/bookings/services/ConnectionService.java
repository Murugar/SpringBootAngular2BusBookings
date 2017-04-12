package org.iqmsoft.boot.angular2.bus.bookings.services;

import java.util.List;

import org.iqmsoft.boot.angular2.bus.bookings.dto.ConnectionDto;

public interface ConnectionService {
    ConnectionDto addConnection(ConnectionDto connectionDto);
    ConnectionDto updateConnection(ConnectionDto connectionDto);
    List<ConnectionDto> getAllConnections();
    void deleteConnection(Long id);
}
