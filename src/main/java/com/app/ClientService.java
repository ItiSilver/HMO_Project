package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class ClientService implements ClientServiceInterface{
    @Autowired
    private ClientRepositoryInterface repository;
    @Autowired
    MongoTemplate mongoTemplate;
    @Override
    public List<Client> getAllClients() {
        mongoTemplate.findAll(Client.class);
        return repository.findAll();
    }

    @Override
    public List<Client> getClientByName(String name) {
        mongoTemplate.findAll(Client.class).stream().filter(client -> client.getName().equals(name)).collect(Collectors.toList());
        return repository.findAll().stream().filter(client->client.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public Optional<Client> getClientById(String id) {
        mongoTemplate.findById(id, Client.class);
        return repository.findById(id);
    }

    @Override
    public Client addClient(Client client) {
        return repository.save(client);
    }
}
