package View;

import Controllers.Ataques.Charisma;
import Controllers.Ataques.EstrategiaAtaque;
import Controllers.Ataques.Melee;
import Controllers.Ataques.Ranged;
import Controllers.HeroiController;
import Controllers.VendedorController;
import Domain.Entidades.Entidade;
import Domain.Entidades.Heroi;
import Domain.Entidades.NPC;
import Domain.Items.ArmaPrincipal;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.Consumiveis.ConsumivelCombate;
import Domain.Items.Consumiveis.Pocao;
import Domain.Items.ItemHeroi;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class Jogo{


    /**
     * Leitor de musica
     * @param filePath
     */
    public static void playMusic(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            DataLine.Info info = new DataLine.Info(Clip.class, audioStream.getFormat());
            Clip clip = (Clip) AudioSystem.getLine(info);

            clip.open(audioStream);
            clip.start();


            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    clip.close();
                    playMusic("Trabalho_POO_DiogoPimentel/Ficheiros/Jogo.wav");
                }
            });

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * View Principal do jogo - contem as salas todas aqui dentro - visto que a historia é semi linear
     * @throws InterruptedException
     * @throws FileNotFoundException
     */


    public static void jogo1() throws InterruptedException, FileNotFoundException {


        System.out.println("▄▄▌  ▄▄▄ .▪      ·▄▄▄▄   ▄▄▄· .▄▄ ·     ▄▄▄  ▄• ▄▌ ▄▄▄· .▄▄ · ");
        System.out.println("██•  ▀▄.▀·██     ██▪ ██ ▐█ ▀█ ▐█ ▀.     ▀▄ █·█▪██▌▐█ ▀█ ▐█ ▀. ");
        System.out.println("██▪  ▐▀▀▪▄▐█·    ▐█· ▐█▌▄█▀▀█ ▄▀▀▀█▄    ▐▀▀▄ █▌▐█▌▄█▀▀█ ▄▀▀▀█▄");
        System.out.println("▐█▌▐▌▐█▄▄▌▐█▌    ██. ██ ▐█ ▪▐▌▐█▄▪▐█    ▐█•█▌▐█▄█▌▐█ ▪▐▌▐█▄▪▐█");
        System.out.println(".▀▀▀  ▀▀▀ ▀▀▀    ▀▀▀▀▀•  ▀  ▀  ▀▀▀▀     .▀  ▀ ▀▀▀  ▀  ▀  ▀▀▀▀ ");
        System.out.println("                        ┏┓┏┓┏┓┏┓");
        System.out.println("                        ┏┛┃┫┣┓┗┫");
        System.out.println("                        ┗━┗┛┗┛┗┛");



        int musica =0;
        int amizadeLelo=0;
        Scanner input = new Scanner(System.in);
        HeroiController heroiMetodos = new HeroiController();




        System.out.println("                 (Leis das Ruas 2069)");
        System.out.println("         +18 e pessoas nao facilmente ofendiveis!");
        System.out.println("");
        System.out.println("Warning: Sr. Jogador, se escolher jogar com musica, tenha cuidado com o volume, visto que era  ");
        System.out.println("chato implementar e os investidores (Cesae/Vitor) deste jogo queriam lançar o jogo o mais rapido possivel.");
        System.out.println("");
        System.out.println("           Musica 1. On | 2. Musica Off");
        System.out.print("Escolhe aqui: ");
        musica= input.nextInt();
        if (musica==1){
            playMusic("Trabalho_POO_DiogoPimentel/Ficheiros/Jogo.wav");
        }
        System.out.println("");


        System.out.println("A historia começa em 2069, na cidade do Pourtu, em Tugazelândia");
        System.out.println("Encontras te no teu apartamento T0 com vista para o mar, mar de lixo pois vives ao lado da lixeira.");
        System.out.println("A tua namorada liga-te e diz:");

        if (musica==1){
            Thread.sleep(4000);
        }

        System.out.println();
        System.out.println("-'Desculpa, já não consigo mais, estou apaixonada pelo Zé Manel, ele tem algo maior que tu...'");
        System.out.println("-'... O KD/A, ele consegue me carregar em duos no Call of Fortnite: Global Defensive'");
        System.out.println("");

        if (musica==1){
            Thread.sleep(4000);
        }


        System.out.println("Ficas lixado com as noticias e desligas lhe o Télélé e recebes outro telefonema...");
        System.out.println("*No ecrã ves - 'Trabalho Patrão - Burguer Donald's Hut '*");
        System.out.println("");

        if (musica==1){
            Thread.sleep(4000);
        }

        System.out.println("-'Como estamos?! Olha era para avisar que estamos a dispensar pessoal por causa do virus SEMVIDA-19...'");
        System.out.println("-'E prontos... estás na lista do convocados! Depois se precisares posso te escrever uma carta de referencia'");
        System.out.println();

        if (musica==1){
            Thread.sleep(4000);
        }

        System.out.println("*Ficas com melão do tamanho de uma melancia e mandas o telemovel pela janela*");
        System.out.println("Não só a tua namorada acabou contigo, como o Zé Manel te despede no teu trabalho de virar hambrugas");
        System.out.println("Decides então mandar tudo para o guaralho e iniciar a tua jornada de rebentar o Zé Manel e tudo o que te chatear a cabeça");
        System.out.println("");

        Heroi heroiteste = Heroi.getInstance();
        heroiteste.ExibirDetalhes();

        if (heroiteste.getEstrategiaAtaque() instanceof Melee){
            ArmaPrincipal maos = new ArmaPrincipal("Maos",0,10,15);
            heroiteste.setArmaPrincipal(maos);
            System.out.println("Visto que decidiste seguir a tua história a com porrada com as mãos, levaste um buff de 10 dano");
            System.out.println();
        }

        if (heroiteste.getEstrategiaAtaque() instanceof Ranged){
            ArmaPrincipal calhau = new ArmaPrincipal("Calhau",0,15,20);
            heroiteste.setArmaPrincipal(calhau);
            System.out.println("Decidiste apanhar uns calhaus que estavam a segurar a tenda de um sem abrigo para tua arma");
            System.out.println();

        }

        if (heroiteste.getEstrategiaAtaque() instanceof Charisma){
            ArmaPrincipal conhecimentoDeRua = new ArmaPrincipal("Conhecimento De Rua",0,10,20);
            heroiteste.setArmaPrincipal(conhecimentoDeRua);
            System.out.println("Foste abençoado por um mendigo com lepra, que te tocou e passou te o 'CONHECIMENTO DE RUA'");

            System.out.println();
        }

        int sala1=0,dado1=0,dado2=0;



        System.out.println("Sais de casa e vais ter arranjar cenas para ires armado na tua quest de vingança");
        System.out.println("A caminho de chegares ao Super Mercado Pingo Amargo encontras um influencer");
        System.out.println("* reparas que ele ta a fazer o NPC challenge *");
        System.out.println("");
        System.out.println("Que pensas fazer quanto a isto?");
        System.out.println("1. Dar o mico ao morcão | 2. Cagar e seguir com a tua vida");
        sala1=input.nextInt();

        if (sala1==1){

            System.out.println("'Bem vindo aos dados do destino'");
            System.out.println("'Aqui vais lançar os dados para decidir o outcome da tua ação'");
            System.out.println("");
            System.out.println("Prime 1 para lançar os dados!");
            System.out.println("Caso tires mais de 8 tens sucesso no teu mico ao gajo");
            sala1=input.nextInt();

            dado1=heroiMetodos.lancarDados();
            dado2=heroiMetodos.lancarDados();
            System.out.println("Sacaste um: "+dado1);
            Thread.sleep(1500);
            System.out.println("E um: "+dado2);
            dado1+=dado2;

            if (dado1>8){

                System.out.println("Gamaste 10 paus ao artolas");
                heroiteste.setOuro(heroiteste.getOuro()+10);
                System.out.println("Guita: "+heroiteste.getOuro()+" paus");
            }else {
                System.out.println("Ganda azar lol! Não é que o gajo te mandou grande cachaço");
                System.out.println("E ainda te pos no tik tok dele...");
                System.out.println("Passaste uma vergonha e perdeste 20 de vida");
                heroiteste.setHP(heroiteste.getHP()-20);
                System.out.println("");
            }
        }


        System.out.println("Ao entrar no supermercado encontras o teu amigo Lelo de Custoias");
        System.out.println("-'E que "+heroiteste.getNome()+"?! Não vais conseguir entrar no supermercado com esse par de cornetas!'");
        System.out.println("* apercebeste que já toda a gente sabe das noticias *");
        System.out.println("");
        System.out.println("O que vais responder ao Lelo de Custoias?");
        System.out.println("1. 'Lelo, nem é tarde nem é cedo, não és tu que tens uma loja e és conhecido como o Doraemon da zona?'");
        System.out.println("2. 'Caga nisso Lelo, bora masé viver ao lema da tuga de '' p**** e vinho verde''' ");
        sala1 = input.nextInt();
        if (sala1 ==2 ){

            System.out.println("* Decidiste cagar na tua vingança *");
            System.out.println("* Foste com o Lelo comprar 2 Litrosas *");
            System.out.println("* Seguiram os 2 para uma casa de meninas *");
            Thread.sleep(1500);
            System.out.println("Perdeste: -"+heroiteste.getOuro()+" paus");
            Thread.sleep(1500);
            System.out.println("Ganhaste: +100HP e 9000 Força");
            Thread.sleep(1500);

            System.out.println("          ---- G A M E  O V E R ----");
            System.out.println("               Final Secreto ");
            System.out.println("          Developed by: Diogo Pimentel");
            System.out.println(" Special thanks: Lelo de Custoias e Ricardo Anselmo da Pasteleira");

            System.exit(0);
        }

        System.out.println("O Lelo acena com a cabeça e da te indicação de o seguires");
        System.out.println("Chegas ao spot de vendas dele");
        System.out.println("Tá aqui tudo na mesa irmaum, o que é queres comprar?");
        System.out.println("");

        VendedorController vendedor = new VendedorController();
        ArrayList<ItemHeroi> loja10Main = vendedor.loja10RandomItems();
        vendedor.imprimirLoja(loja10Main);
        vendedor.vender(heroiteste,loja10Main);

        System.out.println("");
        System.out.println("-'Antes de ires embora, por 20 paus arranjo-te a localização do Quim Bolas (BFF do Ze Manel)'");
        System.out.println("* Pensas que sem a localização do Quim Bolas vais ter de ir andar ao estouro com um tropa dele para chegar primeiro ao Quim  *");
        System.out.println();
        System.out.println("Carteira: "+heroiteste.getOuro()+" paus");
        System.out.println("1. Pagas os 20 paus | 2. Passas a oferta | 3. Decides intimidar o Lelo para te dar a info de borla | 4. Rebentas a boca ao Lelo de Custoias ");

        sala1= input.nextInt();


        if (heroiteste.getOuro()<20 && sala1==1) {

            System.out.println("Não tens guita para isso cepo");
            System.out.println("");
            System.out.println("1. Passas a oferta | 2. Decides intimidar o Lelo para te dar a info de borla | 3. Rebentas a boca ao Lelo de Custoias ");
            sala1 = input.nextInt();
            sala1 += 1;
        }

        switch (sala1){

            case 1:
                heroiteste.setOuro(heroiteste.getOuro()-20);
                System.out.println("Pagaste 20 paus e tens "+heroiteste.getOuro()+" paus");
                System.out.println("-'Obrigado meu puto, vou ligar agora o Ricardo da Pasteleira, o gaijo é hacker e ja te mando a localização'");
                break;

            case 2:
                System.out.println("Segues para o spot do Quim e gritas");
                System.out.println("-'Quim Bolas vou te arrebentar a boca! Anda cá!'");
                System.out.println("* Aparece o tropa dele *");
                System.out.println("-'Sou o tropa do Quim, tas f******!'");

                NPC npcTropa = new NPC("Tropa do Quim",55,100,10,50);



                if(heroiteste.atacar(npcTropa,heroiteste) instanceof NPC){
                    System.out.println(" ---- R.I.P ----");
                    System.out.println("Prime 1 para começar de novo");
                    int restart;
                    restart=input.nextInt();
                    jogo1();
                } else {
                    System.out.println("Rebentas-te o Tropa!");
                }

                break;
            case 3:
                System.out.println("Dados do Destino:");
                System.out.println("Prime 1 para lançar os dados!");
                System.out.println("Caso tires mais de 9 consegues intimidar o Lelo");
                sala1=input.nextInt();
                dado1=heroiMetodos.lancarDados();
                dado2=heroiMetodos.lancarDados();
                System.out.println("Sacaste um: "+dado1);
                Thread.sleep(1500);
                System.out.println("E um: "+dado2);
                dado1+=dado2;

                if (dado1>9){
                    System.out.println("Arregaças as mangas, estalas os punhos e cospes no Lelo");
                    System.out.println("-'Fds mano, ok... eu dou te a info de graça...'");
                    System.out.println("-'Vou ligar agora o Ricardo da Pasteleira, o gaijo é hacker e ja te mando a localização'");
                }else {
                    System.out.println("-'Tás armado em burro?!'");
                    System.out.println("O Lelo manda te um murro na fronha e tira-te 30hp");
                    heroiteste.setHP(heroiteste.getHP()-30);
                    System.out.println("Tens agora "+heroiteste.getHP()+"hp");
                    System.out.println("-'Continuamos parças mas nao abuzes, "+heroiteste.getNome()+"'");

                    System.out.println("Segues para o spot do Quim e gritas");
                    System.out.println("-'Quim Bolas vou te arrebentar a boca! Anda cá!'");
                    System.out.println("* Aparece o tropa dele *");
                    System.out.println("-'Sou o tropa do Quim, tas f******!'");

                    NPC npcTropa2 = new NPC("Tropa do Quim",55,100,10,50);



                    if(heroiteste.atacar(npcTropa2,heroiteste) instanceof NPC){
                        System.out.println(" ---- R.I.P ----");
                        System.out.println("Prime 1 para começar de novo");
                        int restart;
                        restart=input.nextInt();
                        jogo1();
                    } else {
                        System.out.println("Rebentas-te o Tropa!");
                    }

                }


                break;
            case 4:

                NPC npcLeloAmigo = new NPC("Lelo de Custoias",150,100,20,50);
                System.out.println("Empurras o Lelo e preparaste para andar ao estouro");

                if(heroiteste.atacar(npcLeloAmigo,heroiteste) instanceof NPC){
                    System.out.println(" ---- R.I.P ----");
                    System.out.println("Prime 1 para começar de novo");
                    int restart;
                    restart=input.nextInt();
                    jogo1();
                } else {
                    System.out.println("* O Lelo rebenta a pulseira da Amizade que tinha tua *");
                    amizadeLelo=1;
                    System.out.println("Nunca mais te vendo nada seu filho da truta!");
                    System.out.println("Deixas-te de ser amigo do Lelo e perdeste a possibilidade de fazer compras!");
                }
                break;
            default:
        }


        System.out.println("Segues com a tua jornada...");
        System.out.println("E vais de encontro com o Quim Bolas");


        int curar=0;

        System.out.println("* Metes a mão à bolsa da westpack e pensas se vais consumir algo para te curares *");
        System.out.println("1. Sim | 2. Não");
        curar=input.nextInt();
        if (curar==1){
            heroiMetodos.usarPocao(heroiteste);
            heroiteste.ExibirDetalhes();
        }

        System.out.println("Ao chegar ao local ves uma lata de Blue Bull no chão?");
        System.out.println("1. Apanhas a lata | 2. Segues caminho por causa da regra dos 5 segundos");

        int lata=0;
        lata = input.nextInt();
        if (lata==1){


            lata=heroiMetodos.lancarDados();
            if (lata>=4){
                Pocao lataBlueBull = new Pocao("Lata - Blue Bull",0,5,15);
                heroiteste.addInventario(lataBlueBull);
                System.out.println("Que top, por abrir e tudo a lata! Já vai aqui para o bolso!");
            }else {
                System.out.println("-'Fds...'");
                System.out.println("Cortaste-te na lata, porque já tava aberta");
                System.out.println("Apanhaste Tétano e perdeste 5HP");
                heroiteste.setHP(heroiteste.getHP()-5);
                System.out.println("Tens agora "+heroiteste.getHP()+"HP");
            }
        }

        System.out.println("");
        System.out.println("Entretanto o Quim Bolas começa a correr na tua direção");
        System.out.println("-'NÃO TE VOU DIZER ONDE ESTA O ZÉ MANEL, SEU CARA DE ATUM!'");


        NPC npcQuimBolas = new NPC("Quim Bolas - BFF do Ze Manel",90,100,10,50);

        if(heroiteste.atacar(npcQuimBolas,heroiteste) instanceof NPC){
            System.out.println(" ---- R.I.P ----");
            System.out.println("Prime 1 para começar de novo");
            int restart;
            restart=input.nextInt();
            jogo1();
        } else {
            System.out.println("Revistas o Quim Bolas e tiras-lhe o telemovel!");
        }




        System.out.println("* Metes a mão à bolsa da westpack e pensas se vais consumir algo para te curares *");
        System.out.println("1. Sim | 2. Não");
        curar=input.nextInt();
        if (curar==1){
            heroiMetodos.usarPocao(heroiteste);
        }





        System.out.println("");
        System.out.println("Pensas como deves prosseguir na tua historia de romance de 0 de budget");
        System.out.println("Pegas no telemovel no Quim Bolas:");
        System.out.println("1. Finges ser o Quim e marcas um Spot com o Ze Manel");
        System.out.println("2. Ligas para a tua Ex e dizes que o novo namorado dela vai ficar sem dentes");
        System.out.println("3. Voltas ao Spot de vendas do Lelo");
        sala1=input.nextInt();


        switch (sala1){

            case 1:
                System.out.println("O plano resultou e esperas que o Zé Manel chegue");
                break;
            case 2:
                System.out.println("Oh tchabala, acabaste comigo, agora bou acabar com o teu namorado!");
                heroiteste.setPower(heroiteste.getPower()+5);
                System.out.println("Tiveste confiança no que disseste e ganhaste mais 5 de força!");
                System.out.println();
                break;
            case 3:
                if(amizadeLelo==1){
                    int escolha=0;
                    System.out.println("Chegas ao Spot do Lelo");
                    System.out.println("* A porta está trancada *");
                    System.out.println("Queres tentar arrombar a porta, visto que já não és a amigo do lelo e és um cabrão?");
                    System.out.println("1. Sim | 2. Não");
                    escolha=input.nextInt();
                    if (escolha==1){

                        System.out.println("Dados do Destino:");
                        System.out.println("Prime 1 para lançar os dados!");
                        System.out.println("Caso tires mais de 7 consegues arrumbar a porta");
                        sala1=input.nextInt();
                        dado1=heroiMetodos.lancarDados();
                        dado2=heroiMetodos.lancarDados();
                        System.out.println("Sacaste um: "+dado1);
                        Thread.sleep(1500);
                        System.out.println("E um: "+dado2);
                        dado1+=dado2;

                        if (dado1>7){
                            System.out.println("Conseguiste abrir a porta!");
                            System.out.println("Vasculhas o spot do Lelo e encontras uma C4");
                            ConsumivelCombate c4 = new ConsumivelCombate("C4",0,80);
                            heroiteste.addInventario(c4);
                            System.out.println("-'Dasseeeee... Vou explodir o Ze Manel e o Burguer Donald's Hut'");
                        }else {
                            System.out.println("* Vês que és um burro *");
                            System.out.println("Dás o bazo e finges ser o Quim e marcas um Spot com o Ze Manel por telemovel");
                        }

                    } else if (escolha==2) {
                        System.out.println("* Vês que és um burro *");
                        System.out.println("Dás o bazo e finges ser o Quim e marcas um Spot com o Ze Manel por telemovel");
                    }
                    
                }else {
                    System.out.println("Chegas ao spot do Lelo");
                    System.out.println("-'Já de volta?!'");
                    System.out.println("-'Vê lá o que precisas então para rebentares a boca aquele gajo finalmente!'");
                    vendedor.imprimirLoja(loja10Main);
                    vendedor.vender(heroiteste,loja10Main);
                }
                break;
            default:
        }

            if(amizadeLelo==1){
                System.out.println("Vais ter ao Spot do Zé Manel, que afinal estava no Burguer Donald's Hut, porque era o turno dele...");
                System.out.println("Resumindo, tiveste aquele trabalho tudo feito burro e nao foste ver ao primeiro sitio onde ele devia estar...");
                System.out.println("Como foste a calcantes para lá, chegaste cansado e foi te debitado 6 pontos de força");
                heroiteste.setPower(heroiteste.getPower()-6);


            } else {
                System.out.println("Vais ter ao Spot do Zé Manel, que afinal estava no Burguer Donald's Hut, porque era o turno dele...");
                System.out.println("Resumindo, tiveste aquele trabalho tudo feito burro e nao foste ver ao primeiro sitio onde ele devia estar...");
                System.out.println("E como foste grande parça do Lelo de Custoias, o gajo deu te boleia na Zundapp dele");
                System.out.println("Como foste de moto, conseguiste chillar uma beca e ganhaste 3 de força e 5 de vida");
                heroiteste.setPower(heroiteste.getPower()+3);
                heroiteste.setHP(heroiteste.getHP()+5);
            }

        System.out.println();
        System.out.println("------ ESTA É A ULTIMA FASE PARA VERIFICARES E CONSUMIRES ALGO -------");
        System.out.println("");
        System.out.println("* Metes a mão à bolsa da westpack e pensas se vais consumir algo para te curares *");
        System.out.println("1. Sim | 2. Não");
        curar=input.nextInt();
        if (curar==1){
            heroiMetodos.usarPocao(heroiteste);
        }


        heroiteste.ExibirDetalhes();
        System.out.println("Não é bug a exibicao do detalhes do teu gajo, é para saberes os stats do bicho");
        System.out.println("Ou caso alguem esteja a avaliar este jogo e preciso de rever os valores com que vai a personagem!");
        System.out.println();

        Thread.sleep(2000);
        System.out.println("Chegas à porta do Burguer Donald's Hut");
        System.out.println("1. Abres a porta com um biqueiro | 2. Abres a por com gentileza");
        sala1=input.nextInt();
        if (sala1==2){
            System.out.println("Obvio que não te ia deixar abrir com gentiliza a porta.... depois disto tudo....");
            Thread.sleep(2000);
        }

        System.out.println("");
        System.out.println("Abres a porta com um biqueiro, e gritas:");
        System.out.println("-'Voltei, Filh... ... ...'");
        System.out.println("Trocam se olhares entre inimigos....");
        System.out.println("***FIGHT***");

        NPC npcZeManel = new NPC("Ze Manel",350,350,15,9999);



        if(heroiteste.atacar(npcZeManel,heroiteste) instanceof NPC){
            System.out.println(" ---- R.I.P ----");
            System.out.println("Prime 1 para começar de novo");
            int restart;
            restart=input.nextInt();
            jogo1();
        } else {
            System.out.println("-'Ganhaste, "+heroiteste.getNome()+" nunca mais me meto contigo");
            System.out.println("Com a derrota do Ze Manel, tornaste te agora o gerente da Hambrugaria da qual ele te tinha despedido!");
            Thread.sleep(2500);
            System.out.println("No entanto, cometeste vários crimes pelo caminho e a Gê Éne Érre, levou-te dentro pelos mesmos.");
            Thread.sleep(2500);
            System.out.println("Parabens acabaste o jogo e venceste!");
            System.out.println();
            System.out.println("                                 ---- G A M E  O V E R ----");
            System.out.println("                            Published by: INeverCommentCode Studios");
            Thread.sleep(1500);
            System.out.println("          Developed by: Diogo Pimentel && Red Bull && Nespresso Coffee && Amber Leaf Rolling Tobacco");
            Thread.sleep(1500);
            System.out.println("              Special thanks: Lelo de Custoias e Ricardo Anselmo da Pasteleira");


        }

    }

}
