package leidens.cristian.clientstableconfig.service;

import leidens.cristian.clientstableconfig.model.ClientEntity;
import leidens.cristian.clientstableconfig.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//SpringBoot
@Service
public class ClientFindByIdService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity findByID(long id) {
        return this.clientRepository.findById(id).get();
    }

}
