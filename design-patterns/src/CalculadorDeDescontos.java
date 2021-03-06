
public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		// mais de 5 itens, desconto
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}

		// segunda regra...
		else if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}

		// em caso contrario...
		return 0;
	}

}
