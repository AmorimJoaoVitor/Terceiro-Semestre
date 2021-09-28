package br.com.bandtec.projeto05;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    private List<Cidade> cidades = new ArrayList<>(List.of(
       new Cidade(1, "São Paulo", 9_000_000, true, new Estado("SP", "São Paulo")),
       new Cidade(22, "Diadema", 1_500_000, false, new Estado("SP", "São Paulo")),
       new Cidade(33, "Curitiba", 6_300_000, true, new Estado("PR", "Paraná")),
       new Cidade(44, "Santos", 2_200_000, false, new Estado("SP", "São Paulo")),
       new Cidade(55, "Jericoacoara", 310_000, false, new Estado("CE", "Ceará"))
    ));

    @GetMapping
    public List<Cidade> getCidades() {
        return cidades;
    }

    @GetMapping("/{id}")
    public Cidade getCidade(@PathVariable int id) {
        return cidades.stream()
                .filter(cidade -> cidade.getId() == id)
                .findFirst().get();
    }

    @DeleteMapping("/{id}")
    public String excluirCidade(@PathVariable int id) {
        cidades.remove(
                cidades.stream()
                .filter(cidade -> cidade.getId() == id)
                .findFirst().get()
        );
        return "Cidade excluída";
    }

    @PostMapping
    public String criarCidade(@RequestBody Cidade novaCidade) {
        novaCidade.setId(ThreadLocalRandom.current().nextInt(0,100));
        cidades.add(novaCidade);
        return "Cidade cadastrada com o id "+novaCidade.getId();
    }

    /*
    PUT /cidades/{id} [JSON no corpo de requisição]
    Ele atualiza a cidade do "id" com o corpo de requisição que chegar
     */
    @PutMapping("/{id}")
    public String atualizarCidade(@PathVariable int id,
                                  @RequestBody Cidade cidadeAtualizada) {
        excluirCidade(id);
        cidadeAtualizada.setId(id); // não mandamos o id no JSON!!!
        cidades.add(cidadeAtualizada);
        return "Cidade "+id+" atualizada";
    }
}
