package com.sopra.germee.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sopra.germee.repository.RegimesRepository;
import com.sopra.germee.repository.model.Regimes;

@Service
@Transactional
public class SearchRegimeService {

    @Inject
    private RegimesRepository regimesRepository;

    public List<Regimes> searchAllRegimes() {
        return regimesRepository.listRegimes();
    }

}
