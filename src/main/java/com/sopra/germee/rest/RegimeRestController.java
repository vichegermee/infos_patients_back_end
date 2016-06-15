package com.sopra.germee.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.germee.repository.model.Regimes;
import com.sopra.germee.service.SearchRegimeService;

@RestController
@RequestMapping("/regimes")
public class RegimeRestController {

    @Inject
    private SearchRegimeService searchRegimeService;

    @RequestMapping(value = "/liste", method = RequestMethod.GET)

    public List<Regimes> findAllRegimes() throws Exception {
        return searchRegimeService.searchAllRegimes();
    }
}
