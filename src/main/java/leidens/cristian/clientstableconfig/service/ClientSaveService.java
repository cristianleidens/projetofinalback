package leidens.cristian.clientstableconfig.service;

import leidens.cristian.clientstableconfig.model.ClientEntity;
import leidens.cristian.clientstableconfig.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientSaveService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity save(ClientEntity clientEntity) {
        return this.clientRepository.save(clientEntity);
    }

}