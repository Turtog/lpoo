package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Conta;
import model.Associado;
import model.Cliente;
import model.ContaC;
import model.ContaP;

public class Controller {
	public static void main(String[] args) {
		
		ContaC cc1 = new ContaC();
		ContaC cc2 = new ContaC();
		ContaC cc3 = new ContaC();
		
		ContaP cp1 = new ContaP();
		ContaP cp2 = new ContaP();
		ContaP cp3 = new ContaP();
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		cc1.setSaldo(2000.00); cc2.setSaldo(2500.00); cc3.setSaldo(2750.00);
		cp1.setSaldo(3000.00); cp2.setSaldo(3500.00); cp3.setSaldo(3750.00);
		c1.setNome("João"); c2.setNome("Maria"); c3.setNome("Pedro");
		
		List<Conta> contaList = new ArrayList<>();
		contaList.add(cc1);
		contaList.add(cc2);
		contaList.add(cc3);
		contaList.add(cp1);
		contaList.add(cp2);
		contaList.add(cp3);
		
		List<Associado> associados = new ArrayList<>();
		associados.add(c3);
		associados.add(c2);
		associados.add(c1);
		associados.add(cc1);
		associados.add(cc2);
		associados.add(cc3);
		
		System.out.println(contaList);
		System.out.println(associados);
		
		cp1.deposita(1000.00); cp1.atualiza(5.00); cp1.saca(50.00);
		cc1.deposita(500.00); cc1.saca(400.00);
		cc1.setqdeCotas(100); cc2.setqdeCotas(400); cc3.setqdeCotas(600);
		c1.setqdeCotas(300); c2.setqdeCotas(600); c3.setqdeCotas(600);
		
		associados.sort(Comparator.comparing(Associado::getqdeCotas).reversed());
		System.out.println(associados);
		
		int max = associados
					.stream() //1. crie um fluxo para a estrutura de dados
					.mapToInt(a -> a.getqdeCotas()) //2. converta para double cada Associado
					.max().getAsInt(); //3. calcule o valor máximo
		
		System.out.println(max);
		
	}
}