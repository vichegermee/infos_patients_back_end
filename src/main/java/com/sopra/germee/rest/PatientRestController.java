package com.sopra.germee.rest;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.germee.repository.model.Patient;
import com.sopra.germee.repository.model.Regimes;
import com.sopra.germee.service.SearchPatientService;

@RestController
@RequestMapping("/patients")
public class PatientRestController {

    @Inject
    private SearchPatientService searchPatientService;

    // patients avec le même NIR_OD
    @RequestMapping(value = "/nir/{nirOd}", method = RequestMethod.GET)
    public List<Patient> findByNir(@PathVariable("nirOd") String nirOd) throws Exception {
        return searchPatientService.searchByNir(nirOd);
    }

    // selectionner un patient en particulier
    @RequestMapping(value = "/detailsPatient/{idPt}", method = RequestMethod.GET)
    public Patient findById(@PathVariable("idPt") String idPt) throws Exception {
        return searchPatientService.searchById(idPt);
    }

    // tous les patients d'un même régime
    @RequestMapping(value = "/regime/{idReg}", method = RequestMethod.GET)
    public List<Patient> findByRegime(@PathVariable("idReg") int idRegime) throws Exception {

        Regimes regimes = new Regimes();
        regimes.setIdreg(idRegime);

        return searchPatientService.searchByRegimeService(regimes);
    }

    // Enregistrer un nouveau patient
    @RequestMapping(value = "/nouveau/{Patient}", method = RequestMethod.POST)
    public void insertPatient(@PathVariable("Patient") Patient patient) {
        searchPatientService.insertIntoBase(patient);
    }
}
