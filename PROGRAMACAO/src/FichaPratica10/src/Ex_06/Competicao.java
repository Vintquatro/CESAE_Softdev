package Ex_06;

public class Competicao {
    private String competicao,pais;
    private Atleta[] listaatletas;

    public Competicao(String competicao, String pais) {
        this.competicao = competicao;
        this.pais = pais;
        this.listaatletas= new Atleta[100];
    }

    public void addatleta(Atleta addatleta){

        for (int i=0; i<this.listaatletas.length;i++){
            if(this.listaatletas[i]==null){
                this.listaatletas[i]=addatleta;
                return;
            }
        }
    }

    public void listaratletas(){
        for(int i=0;i<this.listaatletas.length;i++){
            if (this.listaatletas[i]!=null){
                listaatletas[i].exibirdetalhes();

            }else {
                return;
            }

        }
    }




}
