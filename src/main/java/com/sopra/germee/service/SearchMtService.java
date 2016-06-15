package com.sopra.germee.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sopra.germee.repository.MtRepository;
import com.sopra.germee.repository.model.Medecin_traitant;

@Service
@Transactional
public class SearchMtService {

    @Inject
    private MtRepository mtRepository;

    public List<Medecin_traitant> searchAllMt() {
        return mtRepository.listMt();
    }

}
