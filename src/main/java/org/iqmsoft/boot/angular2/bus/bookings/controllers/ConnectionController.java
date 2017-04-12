package org.iqmsoft.boot.angular2.bus.bookings.controllers;

import org.iqmsoft.boot.angular2.bus.bookings.dto.ConnectionDto;
import org.iqmsoft.boot.angular2.bus.bookings.services.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConnectionController {
    @Autowired
    private ConnectionService connectionService;

    @RequestMapping(value = "/admin/connections", method = RequestMethod.POST)
    public ConnectionDto addConnection(@RequestBody ConnectionDto connection) {
        return connectionService.addConnection(connection);
    }

    @RequestMapping(value = "/connections", method = RequestMethod.GET)
    public List<ConnectionDto> getConnections() {
        return connectionService.getAllConnections();
    }

    @RequestMapping(value = "/admin/connections", method = RequestMethod.PUT)
    public ConnectionDto updateConnection(@RequestBody ConnectionDto connection) {
        return connectionService.updateConnection(connection);
    }

    @RequestMapping(value = "/admin/connections/{id}", method = RequestMethod.DELETE)
    public void deleteConnection(@PathVariable Long id) {
        connectionService.deleteConnection(id);
    }
}
