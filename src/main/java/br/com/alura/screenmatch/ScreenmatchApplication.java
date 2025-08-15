package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporadas;
import br.com.alura.screenmatch.principal.Principal;
import br.com.alura.screenmatch.principal.PrincipalConceitosFiltros;
import br.com.alura.screenmatch.principal.PrincipalConceitosJson;
import br.com.alura.screenmatch.repository.SerieRepository;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//public class ScreenmatchApplication implements CommandLineRunner {
public class ScreenmatchApplication {

//    @Autowired
//    private SerieRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//
//
//		Principal principal = new Principal(repository);
//        		principal.exibeMenu();
//
////		PrincipalConceitosFiltros principalConceitosFiltros = new PrincipalConceitosFiltros();
////		principalConceitosFiltros.exibeMenuOutros();
//
////        PrincipalConceitosJson principalConceitosJson = new PrincipalConceitosJson(repository);
////        principalConceitosJson.exibeFiltros();
//
//    }

}
