package com.effecti.teste;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.effecti.gerenciador.repository.LicitacoesRepository;
import com.effecti.gerenciador.services.LicitacoesServices;

public class Teste {

	@Autowired
	LicitacoesRepository licitacoesRepository;
	
	public static void main(String[] args) throws IOException {
		
		/*WebScrapping webScrapping = new WebScrapping();
		List<Passing> infos = webScrapping.extrairDados();
		for (Passing passing: infos) {
			webScrapping.converterToJson(passing);
		}*/
		
		/*List<LicitacaoDto> infos = LicitacoesServices.extrairDados();
		for (LicitacaoDto passing: infos) {
			LicitacoesServices.converterToJson(passing);
		}*/
		
		LicitacoesServices licitacoesServices = new LicitacoesServices();
		licitacoesServices.testeLicitacoes();
		//info.listarLicitacoes();
		
		
        /*//1 - URL do site a ser acessado
        String url = "https://www.nfl.com/stats/player-stats/";
        //2 - Conectando e obtendo uma cópia do html inteiro da página
        Document doc = Jsoup.connect(url).get();
        //3 - Obtendo a tabela através de sua classe
        Element table = doc.getElementsByClass("d3-o-table d3-o-table--detailed d3-o-player-stats--detailed d3-o-table--sortable").first();
        //4 - Obtendo o corpo da tabela através da tag
        Element tbody = table.getElementsByTag("tbody").first();
        //5 - Criando uma lista de todos os tr's do tbody obtido
        List<Element> players = tbody.getElementsByTag("tr");
        //6 - Criando uma lista vazia para Guardar os dados dos tr's convertidos
        List<Passing> playersObjects = new ArrayList<>();
        //7 - Iterando por cada tr e convertendo-o em um Passing. Em seguida inserindo-o na lista de Passings
        for (Element player: players) {
            //Listando todos os atributos do tr em questão
            List<Element> attributes = player.getElementsByTag("td");
            //criando o objeto e inserindo nele os atributos extraidos do td
            Passing passing = new Passing(
                    attributes.get(0).text(),
                    attributes.get(1).text(),
                    attributes.get(2).text(),
                    attributes.get(3).text()
            );
            //adicionando o objeto na lista de objetos Passing
            playersObjects.add(passing);
        }
        //Por fim, convertendo os objetos do tipo Passing para Json, facilitando a leitura dos dados obtidos do site
        for (Passing passing: playersObjects) {//Aqui ele diz que é pra fazer isso em cada um dos objetos criados e não parar até eles acabarem
            converterToJson(passing);//Aqui pra cada objeto Passing que o java criar, ele vai converter em formato json cada um deles de acordo com o método criado abaixo
        }*/
    }
}
