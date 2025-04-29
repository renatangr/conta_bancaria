package conta_bancaria.model;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class ContaPoupanca extends Conta {
	
	private int diaAniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int diaAniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Dia de Aniversário da Conta: " + this.diaAniversario);
	}
	
	public void renderContaPoupanca(int dia, float rendimento) {
		LocalDateTime data = LocalDateTime.now();
		
		if(diaAniversario == data.getDayOfMonth()) {
			float totalRendimento = (rendimento/100) * this.getSaldo();
			System.out.println("\n***************************************************\n"
							 + "                Rendimento da Conta                \n"
							 + "***************************************************");
			System.out.printf("Sua conta rendeu %.1f%%. Total do rendimento: %.2f.\n\n", rendimento, totalRendimento);
			this.setSaldo(this.getSaldo() + totalRendimento);
			
		}
		
	}

}
