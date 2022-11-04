package kodlama.io.Devs.webApi;

import kodlama.io.Devs.businnes.PLanguage.ProgrammingLanguageService;
import kodlama.io.Devs.businnes.PLanguageTechnologie.ProgrammingLanguageTechnologyService;
import kodlama.io.Devs.businnes.request.CreateProgrammingLanguageRequest;
import kodlama.io.Devs.businnes.request.CreateProgrammingLanguageTecnhologyRequest;
import kodlama.io.Devs.businnes.request.UpdateProgrammingLanguageRequest;
import kodlama.io.Devs.businnes.request.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.Devs.businnes.response.FindAllProgrammingLanguageResponse;
import kodlama.io.Devs.businnes.response.FindAllProgrammingLanguageTechnologyResponse;
import kodlama.io.Devs.businnes.response.FindByIdProgrammingLanguageResponse;
import kodlama.io.Devs.businnes.response.FindByIdProgrammingLanguageTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DevsController {
    private ProgrammingLanguageService programmingLanguageService;
    private ProgrammingLanguageTechnologyService programmingLanguageTechnologyService;

    @Autowired
    public DevsController
            (ProgrammingLanguageService programmingLanguageService, ProgrammingLanguageTechnologyService programmingLanguageTechnologyService) {
        this.programmingLanguageService = programmingLanguageService;
        this.programmingLanguageTechnologyService = programmingLanguageTechnologyService;
    }

    // PROGRAM LANGUAGE TECHNOLOGY OPERASYONLARI

    @GetMapping("/findallprogramlanguagetechnology")
    public List<FindAllProgrammingLanguageTechnologyResponse> findAllProgrammingLanguageTechnology(){
       return programmingLanguageTechnologyService.findAll();
    }
    @GetMapping("/findbyidprogramlanguagetechnology/{id}")
    public FindByIdProgrammingLanguageTechnologyResponse findByIdProgrammingLanguageTechology(@PathVariable int id) throws Exception{
        return programmingLanguageTechnologyService.findById(id);
    }

    @PostMapping("/addprogramlanguagetecnology")
    public void addProgrammingLanguageTechnology(@RequestBody CreateProgrammingLanguageTecnhologyRequest createProgrammingLanguageTecnhologieRequest){
         programmingLanguageTechnologyService.add(createProgrammingLanguageTecnhologieRequest);
    }
    @PostMapping("/deleteprogramlanguagetechnology/{id}")
    public void deleteProgrammingLanguageTechnology(@PathVariable int id){
        programmingLanguageTechnologyService.deleteById(id);
    }

    @PostMapping("/updateprogramlanguagetechnology/{id}")
    public void updateProgrammingLanguageTechnology(@RequestBody UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologieRequest,@PathVariable int id){
        programmingLanguageTechnologyService.update(updateProgrammingLanguageTechnologieRequest,id);
    }


    //PROGRAM LANGUAGE OPERASYONLARI

    @GetMapping("/findallprogramlanguage")
    public List<FindAllProgrammingLanguageResponse> getProgrammingLanguage(){
        return programmingLanguageService.findAll();
    }

    @GetMapping("/findbyidprogramlanguage/{id}")
    public FindByIdProgrammingLanguageResponse getByIdProgrammingLanguage(@PathVariable int id) throws Exception{
       return programmingLanguageService.findById(id);
    }

    @PostMapping("/addprogramlanguage")
    public void addProgrammingLanguage(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception{
        programmingLanguageService.add(createProgrammingLanguageRequest);
    }

    @PostMapping("/deleteprogramlanguage/{id}")
    public void deleteProgrammingLanguage(@PathVariable int id){
        programmingLanguageService.deleteById(id);
    }

    @PostMapping("/updateprogramlanguage/{id}")
    public void updateProgrammingLanguage(@RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest,@PathVariable int id){
        programmingLanguageService.update(updateProgrammingLanguageRequest,id);
    }


}
