/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author mende
 */
public class Teste 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
         String linOrigem, colOrigem, linDestino, colDestino;
        //teste dos construtores
        Torre torre = new Torre(1); //inicializa uma torre branca
        Torre torre2 = new Torre(0); // torre preta
        Cavalo cavalo = new Cavalo(1); //cavalo branco
        Cavalo cavalo2 = new Cavalo(0); //cavalo preto
        Bispo bispo = new Bispo(1); // bispo branco
        Bispo bispo2 = new Bispo(0); // bispo preto
        Peao peao = new Peao(1); // peao branco
        Peao peao2 = new Peao(0); // peao preto
        Rei rei = new Rei(1); //rei branco
        Rei rei2 = new Rei(0); // rei preto
        Dama dama = new Dama(1); //dama branca
        Dama dama2 = new Dama(0); //dama preta
        Jogador jogador = new Jogador(); //inicializa jogador
       Posicao posicao = new Posicao(); //inicializa posicao
       
       Jogo jogo = new Jogo();//inicializa o jogo
       Tabuleiro tab = new Tabuleiro(jogo.exercitobranco, jogo.exercitopreto); //inicializa um tabuleiro
       boolean aux;
       String tex;
       
       jogo.informaEstado();//teste99
       //jogo.setEstado(7);//teste101
     Scanner in = new Scanner( System.in );
    int cont = 0; //contador de rodadas
       ///////////////////////////////////////////////////////////////////inicio do teste de receber jogadas////////////////
       while(jogo.estado != 3) //enquanto nao for xeque mate. Loop principal do jogo
       {  
        
        System.out.println("Digite sua jogada");
       
        linOrigem = in.nextLine();
        colOrigem = in.nextLine();
        linDestino = in.nextLine();
        colDestino = in.nextLine();
        
        
       
  ////////////////////////////////////////////Juntar num unico metodo//////////////////////////////////////
   //testes de conversões para obter a posição no tabuleiro
   
   int valor, valor2, valor3, valor4; //valor e valor2 são referentes as colunas
   
     valor = jogo.converteLetra(linOrigem); //conversao de String para int. Funciona so para Strings numericas, ou seja colunas
     valor2 = jogo.converteLetra(linDestino);
     valor3 = jogo.converteNumero(colOrigem);
     valor4 = jogo.converteNumero(colDestino);   
        
   
     Peca peca = tab.parque[valor][valor3].getPeca(); //pega peca naquela posicao
     Peca pecaComida = tab.parque[valor2][valor4].getPeca();// pega peca comida naquela posicao
     System.out.println(peca);
 if(tab.checaValidade(valor, valor3, valor2, valor4) == true && peca.checaMovimento(valor, valor3, valor2, valor4) == true && tab.checaObstaculo(valor, valor3, valor2, valor4) == true)//teste de movimentação das peças
    // valor2 = valor2 - 1;
     //valor3 = valor3 - 1;
     {
    // System.out.println("("+linOrigem+","+colOrigem+")=("+valor+","+valor3+")");
     //System.out.println("("+linDestino+","+colDestino+")=("+valor2+","+valor4+")");
      tab.checaObstaculo(valor, valor3, valor2, valor4);
         tab.parque[valor2][valor4].setPeca(peca);
         //System.out.println(tab.parque[valor2][valor3].getPeca());
         tab.parque[valor][valor3].setPeca(null);
     }
     else
     {
         System.out.println("Jogada inválida");
         
     }
        // tab.parque[valor2-1][valor3].setPeca(peca); //teste para desenhar peça no tabuleiro
        // tab.parque[valor-1][valor4].setPeca(" ");
       
  //////////////////////////////////////////////////aqui termina bloco /////////////////////////////////////
  
  tab.mostra(); //imprime tabuleiro
        jogo.alternaJogada();
       }
                
    }
    
}
