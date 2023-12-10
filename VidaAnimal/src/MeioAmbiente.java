import Enums.AlimentacaoDieta;
import Enums.Familia;

import java.util.ArrayList;

public class MeioAmbiente {
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    public boolean plantabebe(int indexPlanta) {


        if (seres.get(indexPlanta) instanceof Planta) {


            Planta planta01 = (Planta) seres.get(indexPlanta);

            if (planta01.getFamilia().equals(Familia.ARVORES)) {

                if (this.agua >= 1) {
                    this.agua -= 1;
                    return true;
                } else {
                    seres.remove(seres.get(indexPlanta));
                    return false;
                }
            }


            if (planta01.getFamilia().equals(Familia.FLORES)) {

                if (this.agua >= 0.1) {
                    this.agua -= 0.1;
                    return true;
                } else {
                    seres.remove(seres.get(indexPlanta));
                    return false;
                }
            }

            if (planta01.getFamilia().equals(Familia.ERVAS)) {

                if (this.agua >= 0.25) {
                    this.agua -= 0.25;
                    return true;
                } else {
                    seres.remove(seres.get(indexPlanta));
                    return false;
                }
            }

        }
        return false;
    }


    private boolean plantaComeInsetos(int indexPlanta) {

        if (seres.get(indexPlanta) instanceof Planta) {


            Planta planta01 = (Planta) seres.get(indexPlanta);

            if (planta01.getFamilia().equals(Familia.COMEINSETOS)) {
                for (SerVivo serAtual : this.seres) {
                    if (serAtual instanceof Inseto) {
                        seres.remove(serAtual);
                        return true;
                    } else {
                        seres.remove(seres.get(indexPlanta));
                        return false;
                    }
                }
            }
        }
        return false;
    }
    private void plantaAbanaComVento(int indexPlanta){
        System.out.println("Esta muito vento!");

    }

    private void animalFazBarulho(int indexAnimal){
        Animal animal = (Animal) seres.get(indexAnimal);
        System.out.println(animal.getBarulho());
    }

    private void animalMovimenta(int indexAnimal){
        System.out.println("O "+seres.get(indexAnimal).getNome()+" movimentou-se.");
    }


    private boolean animalBebe(int indexAnimal){
        double quantidadeABeber;

        Animal animal = (Animal) seres.get(indexAnimal);
        quantidadeABeber= animal.getPesoKG()*0.025;


        if (quantidadeABeber<=this.agua){
            this.agua-=quantidadeABeber;
            return true;
        }else {
            seres.remove(seres.get(indexAnimal));
        }

        return false;
    }

    private boolean animalCome(int indexAnimal) {

        Animal animal = (Animal) seres.get(indexAnimal);

        if (animal.isFome() == true) {

            if (animal.getAlimentacaoDieta().equals(AlimentacaoDieta.CARNIVORO)) {

                for (SerVivo serAtual : this.seres) {
                    if (serAtual instanceof Animal || serAtual instanceof Inseto) {
                        this.seres.remove(serAtual);
                        System.out.println("O " + animal.getNome() + " comeu o ser vivo " + serAtual.getNome());
                        return true;
                    }
                }

            }

            if (animal.getAlimentacaoDieta().equals(AlimentacaoDieta.HERBIVORO)) {
                for (SerVivo serAtual : this.seres) {
                    if (serAtual instanceof Planta) {
                        this.seres.remove(serAtual);
                        System.out.println("O " + animal.getNome() + " comeu o ser vivo " + serAtual.getNome());
                        return true;
                    }
                }
            }

            if (animal.getAlimentacaoDieta().equals(AlimentacaoDieta.OMNIVORO)) {
                for (SerVivo serAtual : this.seres) {
                    this.seres.remove(serAtual);
                    System.out.println("O " + animal.getNome() + " comeu o ser vivo " + serAtual.getNome());
                    return true;
                }

            } else {
                System.out.println("O bicho ta de barriga cheia!");
                return false;
            }


        }

        return false;
    }
}


