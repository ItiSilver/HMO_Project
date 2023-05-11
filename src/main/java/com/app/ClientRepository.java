package com.app;

import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ClientRepository {
    List<Client> clients= new ArrayList<>();
    public ClientRepository() {
        addClientsDefault();
    }
    private void addClientsDefault(){
        Client c1 = new Client();
        System.out.println(c1);
        clients.add(c1);
    }
    public Client addClient(Client newClient){
        clients.add(newClient);
        System.out.println("Add successfully!");
        return newClient;
        // this.findAll().add(newClient);
    }
    public Client getClientById(String id){
        return (Client) (clients.stream().filter(client -> client.getId().equals(id)));
    }
    public List<Client> getClientByName(String name){
        return clients.stream().filter(client-> client.getName().equals(name)).collect(Collectors.toList());
    }
    public List<Client> getAllClients(){
        return clients;
    }
}
