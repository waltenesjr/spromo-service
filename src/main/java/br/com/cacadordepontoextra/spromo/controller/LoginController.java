package br.com.cacadordepontoextra.spromo.controller;

import br.com.cacadordepontoextra.spromo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> login(@RequestParam("login") String login, @RequestParam("senha") String senha) {
        try {
            return new ResponseEntity<>(service.login(login, senha), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
        }
    }
}
