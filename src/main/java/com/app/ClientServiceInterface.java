package com.app;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClientServiceInterface {
    List<Client> getAllClients();
    List<Client> getClientByName(String name);
    Optional<Client> getClientById(String id);
    Client addClient( Client client);

}
