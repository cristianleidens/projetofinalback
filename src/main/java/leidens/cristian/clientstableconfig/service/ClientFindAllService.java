package leidens.cristian.clientstableconfig.service;

import leidens.cristian.clientstableconfig.model.ClientEntity;
import leidens.cristian.clientstableconfig.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientFindAllService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> findAll() {
        return (List<ClientEntity>) this.clientRepository.findAll();
    }

}