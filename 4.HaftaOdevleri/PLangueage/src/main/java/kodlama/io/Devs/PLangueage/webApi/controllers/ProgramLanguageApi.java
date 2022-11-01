package kodlama.io.Devs.PLangueage.webApi.controllers;

import kodlama.io.Devs.PLangueage.business.abstracts.ProgramLanguageService;
import kodlama.io.Devs.PLangueage.entities.concretes.ProgramLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programlanguage")
public class ProgramLanguageApi {
    private final ProgramLanguageService programLanguageService;

    @Autowired
    public ProgramLanguageApi(ProgramLanguageService programLanguageService) {
        this.programLanguageService = programLanguageService;
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgramLanguage programLanguage) throws Exception {
        programLanguageService.add(programLanguage);
    }

    @DeleteMapping("/delete")
    public void delete(ProgramLanguage programLanguage) throws Exception {
        programLanguageService.delete(programLanguage);
    }

    @PutMapping("/update")
    public void update(ProgramLanguage programLanguage) throws Exception {
        programLanguageService.update(programLanguage);
    }

    @GetMapping("/getid")
    public void findById(int id) {
        programLanguageService.getId(id);
    }

    @GetMapping("/getall")
    public List<ProgramLanguage> getAll() {
        return programLanguageService.getAll();
    }



}
