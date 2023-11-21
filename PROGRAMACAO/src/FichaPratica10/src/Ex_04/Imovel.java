package Ex_04;

public class Imovel{

    private String rua,cidade;
    private int porta,numeroquartos,numeroWC;
    private TipoImovel tipoImovel;
    private TipoAcabamento tipoAcabamento;

    private double area,areapiscina;

    public Imovel(String rua, String cidade, int porta, int numeroquartos, int numeroWC, TipoImovel tipoImovel, TipoAcabamento tipoAcabamento, double area, double areapiscina) {
        this.rua = rua;
        this.cidade = cidade;
        this.porta = porta;
        this.numeroquartos = numeroquartos;
        this.numeroWC = numeroWC;
        this.tipoImovel = tipoImovel;
        this.tipoAcabamento = tipoAcabamento;
        this.area = area;
        this.areapiscina = areapiscina;
    }


    public double valorimovel(){

        double totalimovel = 0;


        if(this.tipoImovel== TipoImovel.APARTAMENTO){
            totalimovel+=(area*1000);
        }
        if(this.tipoImovel== TipoImovel.CASA){
            totalimovel+=(area*3000);
        }
        if(this.tipoImovel== TipoImovel.MANSAO){
            totalimovel+=(area*5000);
        }

        for (int i=1;i<=this.numeroquartos;i++){
            totalimovel+=7500;
        }

        for (int i=1;i<=this.numeroWC;i++){
            totalimovel+=10500;
        }

        totalimovel+=(areapiscina*1000);

        if (this.tipoAcabamento==TipoAcabamento.RESTAURO){
            totalimovel/=2;
        }

        if (this.tipoAcabamento==TipoAcabamento.USADA){
            totalimovel=totalimovel-(totalimovel*0.1);
        }

        if (this.tipoAcabamento==TipoAcabamento.ALTOACABAMENTO){
            totalimovel+=(totalimovel*0.25);
        }

        System.out.println("A sua casa está avaliada em: "+totalimovel+"€ ");
    return totalimovel;
    }

    public void obras(TipoAcabamento tipoAcabamento){
        this.tipoAcabamento=tipoAcabamento;
        System.out.println(this.tipoAcabamento);
        System.out.println("Obras efetuadas com sucesso!");
    }

    public void exibirdetalhes(){
        System.out.println(this.rua);
        System.out.println(this.porta);
        System.out.println(this.cidade);
        System.out.println(this.tipoImovel);
        System.out.println(this.tipoAcabamento);
        System.out.println("area: "+this.area);
        System.out.println("area Piscina: "+this.areapiscina);
        System.out.println("WC's: "+this.numeroWC);
        System.out.println("Quartos: "+this.numeroquartos);

    }

    public void remax(Imovel casa2){
        if (this.valorimovel() > casa2.valorimovel()) {
            System.out.println("A casa mais cara é:" + this.rua);
        }else{
            System.out.println("A casa mais cara é:" + casa2.rua);
        }



    }


}
