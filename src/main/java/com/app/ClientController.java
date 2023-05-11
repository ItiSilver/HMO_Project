package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService service;
    //======GET========

    @GetMapping("/getAllClients")
    public List<Client> getAllClients(){return service.getAllClients(); }
    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable String id){return service.getClientById(id);}
    @GetMapping("/{name}")
    public List<Client> getClientByName(@PathVariable String name){return service.getClientByName(name);}

    //=======POST=======
    @PostMapping("/addClient")
    public List<Client> addClient(@RequestBody Client client){
        service.addClient(client);
        return service.getAllClients();
    }

}
