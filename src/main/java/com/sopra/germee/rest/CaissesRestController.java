package com.sopra.germee.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.germee.repository.model.Caisses;
import com.sopra.germee.service.SearchCaissesService;

@RestController
@RequestMapping("/caisses")
public class CaissesRestController {

    @Inject
    private SearchCaissesService searchCaissesService;

    @RequestMapping(value = "/liste", method = RequestMethod.GET)

    public List<Caisses> findAllRegimes() throws Exception {
        return searchCaissesService.searchAllCaisses();
    }
}
