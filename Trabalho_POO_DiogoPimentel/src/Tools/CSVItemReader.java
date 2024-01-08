package Tools;

import Domain.Items.ArmaPrincipal;
import Domain.Items.Consumiveis.ConsumivelCombate;
import Domain.Items.Consumiveis.Pocao;
import Domain.Items.ItemHeroi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVItemReader {
    private String filepath;

    public CSVItemReader(String filepath) {
        this.filepath = filepath;
    }


    public ArrayList<ItemHeroi> readCSV()throws FileNotFoundException {
        File file = new File(filepath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        ArrayList<ItemHeroi> loja = new ArrayList<>();


        while (scanner.hasNextLine()){
            linha=scanner.nextLine();

            String [] linhaDivisao = linha.split(";");

            String tipoItem = linhaDivisao[0];
            String nome = linhaDivisao[1];
            int preco = Integer.parseInt(linhaDivisao[2]);

            String heroisPermitidos = linhaDivisao[3];
            heroisPermitidos=heroisPermitidos.replace("[","");
            heroisPermitidos=heroisPermitidos.replace("]","");
            String[] roles= heroisPermitidos.split(",");

            int ataque = Integer.parseInt(linhaDivisao[4]);
            int ataqueEspecial = Integer.parseInt(linhaDivisao[5]);
            int ataqueInstantaneo= Integer.parseInt(linhaDivisao[6]);
            int vida = Integer.parseInt(linhaDivisao[7]);
            int power = Integer.parseInt(linhaDivisao[8]);

            ItemHeroi itemHeroiAtual=null;


            if (tipoItem.equalsIgnoreCase("armaprincipal")){
                itemHeroiAtual = new ArmaPrincipal(nome,preco,ataque,ataqueEspecial);
            }
            if (tipoItem.equalsIgnoreCase("consumivelcombate")){
                itemHeroiAtual= new ConsumivelCombate(nome,preco,ataqueInstantaneo);
            }
            if (tipoItem.equalsIgnoreCase("pocao")){
                itemHeroiAtual= new Pocao(nome,preco,power,vida);
            }

            for (int i = 0; i < roles.length;i++){
                itemHeroiAtual.addHeroipermitido(roles[i]);
            }


            loja.add(itemHeroiAtual);


        }
        return loja;

    }
}
