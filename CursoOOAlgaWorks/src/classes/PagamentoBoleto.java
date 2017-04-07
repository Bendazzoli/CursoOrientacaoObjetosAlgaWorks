package classes;

public class PagamentoBoleto extends Transacao{
	
	private String linhaDigitavel;
	private String dataVencimento;
	private String cedente;
	
	public void emitirComprovante(){
		System.out.println("+====================================+");
		System.out.println("|      Comprovante da transa��o      |");
		System.out.println("+====================================+");
		System.out.println("* Descri��o: " + this.getDescricao());
		System.out.println("* Data: " + this.getData());
		System.out.println("* Valor: " + this.getValor());
		System.out.println("* Linha Digit�vel: " + this.getLinhaDigitavel());
		System.out.println("* Data Vencimento: " + this.getDataVencimento());
		System.out.println("* Cedente: " + this.getCedente());
		System.out.println("+====================================+");
	}

	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}

	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getCedente() {
		return cedente;
	}

	public void setCedente(String cedente) {
		this.cedente = cedente;
	}
}