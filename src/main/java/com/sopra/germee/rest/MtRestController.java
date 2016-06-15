package com.sopra.germee.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.germee.repository.model.Medecin_traitant;
import com.sopra.germee.service.SearchMtService;

@RestController
@RequestMapping("/mt")
public class MtRestController {

    @Inject
    private SearchMtService searchMtService;

    @RequestMapping(value = "/liste", method = RequestMethod.GET)

    public List<Medecin_traitant> findAllRegimes() throws Exception {
        return searchMtService.searchAllMt();
    }
}
