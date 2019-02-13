package br.com.cacadordepontoextra.spromo.controller;

import br.com.cacadordepontoextra.spromo.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estabelecimento")
public class EstabelecimentoController {

    @Autowired
    EstabelecimentoService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> all() {
        try {
            return new ResponseEntity<>(service.all(), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
        }
    }
}
