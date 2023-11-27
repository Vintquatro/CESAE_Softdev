package Ex_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> sorteiopessoas;

    public Sorteio(){
        this.sorteiopessoas = new ArrayList<>();
        this.premio=premio;
    }

    public void addparticipante(Pessoa participante){
        if(participante.getIdade()>=18){
            this.sorteiopessoas.add(participante);
        }else {
            System.out.println("Participante "+ participante.getNome() +" é menor de idade!");
        }
    }

    public void sortear(){
        Random random = new Random();
        int variavelAleatoria = random.nextInt(0,this.sorteiopessoas.size());

        System.out.println("Vencedor: "+this.sorteiopessoas.get(variavelAleatoria).getNome());
    }

    public void imprimircandidato(){
        int contador=1;

        for (Pessoa pessoaatual : this.sorteiopessoas){
            System.out.println("Participiante "+contador++ +" "+pessoaatual.getNome());
        }

    }

}
