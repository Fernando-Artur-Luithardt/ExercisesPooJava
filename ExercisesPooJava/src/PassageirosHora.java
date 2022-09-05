public class PassageirosHora {
    private int[][][] matriz = new int[12][30][24]; //12 meses, 30 dias 24h por dia

    public void adiciona(int mes, int dia, int hora){
        if(mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30 && hora >= 0 && hora <= 23){
            this.matriz[mes-1][dia-1][hora]++;
        }
    }

    public int quantosPassageiros(int dia, int mes){
        int qtd = 0;
        for (int i = 0; i < matriz[mes-1][dia-1].length; i++) {
            qtd += matriz[mes-1][dia-1][i];
        }
        return qtd;
    }

    public int mesMenorFluxo(){
        int mes = -1;
        int somaMes = Integer.MAX_VALUE;
        for (int i = 0; i < this.matriz.length; i++) {//matriz.lenght = 12
            int cont = 0;
            for (int j = 0; j < this.matriz[i].length; j++) {//matriz[i].lenght = 30
                for (int j2 = 0; j2 < this.matriz[i][j].length; j2++) {
                    cont += this.matriz[i][j][j2];
                }
            }
            if(cont < somaMes) {
                mes = i;
                somaMes = cont;
            }
        }
        return mes;
    }
}