package Ex_05;

public class Agenda {

    private Pessoa[] agenda;

    public Agenda() {
        agenda= new Pessoa[3];
    }

    public void adicionarpessoas(Pessoa addpessoa){

        for (int i=0; i<this.agenda.length;i++){
            if (this.agenda[i]==null){
                this.agenda[i]=addpessoa;
                return;
            }
        }
    }

    public void listarpessoas(){

        for (int i=0; i<this.agenda.length;i++){
            if (this.agenda[i]!=null){
                this.agenda[i].exibirDetalhes();
            }else {
                return;
            }
        }

    }


}
