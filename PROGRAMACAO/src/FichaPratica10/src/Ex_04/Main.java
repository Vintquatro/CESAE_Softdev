package Ex_04;

public class Main {

    public static void main(String[] args) {

        Imovel apartamentoCerco = new Imovel("Rua Do Cerco","Porto",3,2,1,TipoImovel.APARTAMENTO,TipoAcabamento.RESTAURO,50,0);
        Imovel casaraofoz = new Imovel("Rua das tias","Porto",1,6,7,TipoImovel.MANSAO,TipoAcabamento.ALTOACABAMENTO,400,100);


        apartamentoCerco.valorimovel();
        apartamentoCerco.obras(TipoAcabamento.ALTOACABAMENTO);
        apartamentoCerco.valorimovel();
        apartamentoCerco.exibirdetalhes();


        apartamentoCerco.remax(casaraofoz);
    }
}
