
public class Dado {
	private int valor;

		public Dado(){
			
		}
		public void tirarDado(){
			this.valor = (int)((Math.random()*6)+1);
			return this.valor;
		}
		
		public int getValor(){
			return this.valor;
		}
}