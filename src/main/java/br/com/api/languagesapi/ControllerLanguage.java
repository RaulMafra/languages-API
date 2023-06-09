package br.com.api.languagesapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLanguage {

    @Autowired
    private LanguageRepository repository;        
  
    @GetMapping("/languages")
    public List<Language> getLanguages() {
        List<Language> languages = repository.findAll();
        return languages;
    }

    @PostMapping("/languages")
    public Language registerLanguage(@RequestBody Language language){
        Language savedLanguage = repository.save(language);
        return savedLanguage;

    }

}