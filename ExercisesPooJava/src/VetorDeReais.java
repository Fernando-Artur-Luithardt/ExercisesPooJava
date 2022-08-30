public class VetorDeReais {
    private double[] vetor;
	
	public VetorDeReais(int tamanho) {
		this.vetor = new double[tamanho];
	}
	
		// item a	
	public void setValor(double valor, int posicao) {
			this.vetor[posicao] = valor;
	}
		//item b
	public int quantosPares() {
			int cont =0;
			for(int i=0; i <this.vetor.length; i++) {
				if((int)this.vetor[i] %2 == 0) {
				cont++;
		}
	}
			return cont;
	}
    //item c
    public VetorDeReais divide(VetorDeReais outro){
        if(this.getTamanho() != outro.getTamanho()){
            return null;
        }
        VetorDeReais novo = new VetorDeReais(this.vetor.length);
        double aux;
        for (int i = 0; i < this.vetor.length; i++) {
            aux = this.vetor[i] / outro.getValor(i);
            novo.setValor(aux, i);
        }
        return novo;
    }
    public double getValor(int posicao){
        return this.vetor[posicao];
    }
    public int getTamanho(){
        return this.vetor.length;
    }

    public String exibir(){
        String str = "[";
        for (int i = 0; i < this.getTamanho(); i++) {
            str += this.vetor[i] + ", ";
        }
        return str + "]";
    }
    //item d
    public double multiplica(VetorDeReais outro){
        if(this.getTamanho() != outro.getTamanho()){
            return Double.NaN;
        }
        double out = 0.0;
        for (int i = 0; i < this.vetor.length; i++) {
            out += this.vetor[i] * outro.getValor(this.vetor.length - i - 1 );
        }
        return out;
    }

    public void inverte()
    {
        double aux;
        for (int i = 0, j=this.vetor.length -1; i < this.vetor.length/2; i++, j--)
        {
            aux = this.vetor[i];
            this.vetor[i] = this.vetor[j];
            this.vetor[j] = aux;
        }
    }

    public double maiorDiferenca()
    {
        double maior = 0;
        double dif;
        for (int i = 0; i < this.vetor.length; i++) {
            dif = this.vetor[i] - this.vetor[i];
            if(Math.abs(dif) > maior) {
                maior = Math.abs(dif);
            }
        }
        return maior;
    }
    
}
