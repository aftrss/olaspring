package pt.aeresende.progs.olaspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OlaController {

    @GetMapping("/ola")
    public String ola() {
        return "Olá, 3F!";
    }

    @GetMapping("/saudacao")
    public String saudacao(
            @RequestParam(defaultValue = "visitante") String nome) {
        return "Olá, " + nome + "!";
    }
    @GetMapping("/api/aluno")
    public Aluno aluno() {
        return new Aluno(1, "Ana Silva", "3F");
    }
    @GetMapping("/api/turma")
    public List<Aluno> turma() {
        return List.of(
                new Aluno(1, "Diego", "3F"),
                new Aluno(2, "Carlos", "3F"),
                new Aluno(3, "Afonso", "3F"),
                new Aluno(4, "Geovanni", "3F")
        );
    }
}
