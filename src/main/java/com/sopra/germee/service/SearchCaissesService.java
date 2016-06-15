package com.sopra.germee.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sopra.germee.repository.CaissesRepository;
import com.sopra.germee.repository.model.Caisses;

@Service
@Transactional
public class SearchCaissesService {

    @Inject
    private CaissesRepository caissesRepository;

    public List<Caisses> searchAllCaisses() {
        return caissesRepository.listCaisses();
    }

}
