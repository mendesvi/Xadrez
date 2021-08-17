/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mende
 */
public class Jogo 
{
  private Jogador jogador1 = new Jogador(); //crio um jogador 
  private Jogador jogador2 = new Jogador(); //crio outro jogador
  private Tabuleiro campo;
  protected Peca exercitobranco[];
  protected Peca exercitopreto[];
  
  
     private  boolean checaVez; //checa se o branco jogou
     protected int estado;
     protected  int escolha;
  
   public Jogo( )
   {
       
      this.exercitobranco = new Peca[16];
      this.exercitopreto = new Peca[16];
      for(int i = 0; i<=7; i++)
      {
          exercitobranco[i] = new Peao(1); //cria 8 peoes brancos
          exercitopreto[i] = new Peao(0); //cria 8 peoes pretos        
          
      }
          exercitobranco[8] = new Torre(1); //cria torre branca
          exercitopreto[8] = new Torre(0); //cria torre preta  
          exercitobranco[9] = new Torre(1); 
          exercitopreto[9] = new Torre(0);  
          exercitobranco[10] = new Cavalo(1); //cria cavalo branco
          exercitopreto[10] = new Cavalo(0); //cria cavalo preto 
          exercitobranco[11] = new Cavalo(1); 
          exercitopreto[11] = new Cavalo(0);
          exercitobranco[12] = new Bispo(1); //cria bispo branco
          exercitopreto[12] = new Bispo(0); //cria bispo preto 
          exercitobranco[13] = new Bispo(1); 
          exercitopreto[13] = new Bispo(0);
          exercitobranco[14] = new Dama(1); //cria dama branco
          exercitopreto[14] = new Dama(0); //cria dama preto 
          exercitobranco[15] = new Rei(1); //cria rei branco
          exercitopreto[15] = new Rei(0); // cria rei branco
         this.campo = new Tabuleiro(this.exercitobranco, this.exercitopreto);
       this.checaVez = false; 
       this.estado = 1; 
       System.out.println("Digite seu nome: ");
       jogador1.definiNome(); // define nome do jogador1
       System.out.println("Digite nome do adversario:");
       jogador2.definiNome(); // define nome do adversario
       System.out.println("Digite sua escolha. 1 para branca e 2 para preta");
       escolha = jogador1.definiEscolha();  //define escolha de peças do jogador1
       
       campo.mostra();
     
        //System.out.println(campo.parque[0][1].getPeca());
                
     
   }
   
   
   public void alternaJogada() //faz a troca de vez dos jogadores
   { 
      if(this.checaVez)
       {
           checaVez = false;
       }
	else 
       {
           checaVez = true;
       }
     
   }
 
   public void setEstado(int num)
        {
          this.estado = num;     
        }
   public void informaEstado()
   {
       if(estado == 1)
       { 
	System.out.println("JOGO EM ANDAMENTO");
        
        System.out.println("Vez do jogador ");
	if(this.checaVez == false && jogador1.escolha == 1) //checagem para ver quem é o jogador branco
        {
            System.out.println(jogador1.getNome()); 
        }
	else
        {
            System.out.println(jogador2.getNome());
        } 
	if(estado == 2)
        {
            System.out.println("O jogador ");
	     if(this.checaVez == false) 
             {
                 jogador1.getNome();
             }
	     else 
             {
                System.out.println(jogador2.getNome());
             }
		
		System.out.println(" xeque!");
	}
        if(estado == 3)
        {
		System.out.println("O jogador ");
		if(this.checaVez == false) 
                {
                    jogador1.getNome();
                }
                else 
                {
                    jogador2.getNome();
                }
		
		System.out.println(" xeque-mate!");
	}
	else 
        {
		System.out.println("Inicio do jogo!");
	}
	
       
       }
    } 
   public int converteLetra(String linDestino) //le  coordenadas para realizar a jogada
   {
       
      int valor, valor2;
    // valor = Integer.parseInt(colOrigem); //conversao de String para int. Funciona so para Strings numericas, ou seja colunas
    // valor2 = Integer.parseInt(colDestino);
     //campo.parque[valor2-1][valor3].setPeca(peca);
       //  campo.parque[valor-1][valor4].setPeca(null);
// Criação do map de letras 
   Map<String, Integer> alfabeto = new HashMap<String, Integer>();

//Mapeamento dos valores de cada letra do alfabeto para facilitar a criação de jogadas
alfabeto.put("A", 0);
alfabeto.put("B", 1);
alfabeto.put("C", 2);
alfabeto.put("D", 3);
alfabeto.put("E", 4);
alfabeto.put("F", 5);
alfabeto.put("G", 6);
alfabeto.put("H", 7);
     valor = alfabeto.get(linDestino);
     return valor;
 
   }
   public int converteNumero(String linDestino) //le  coordenadas para realizar a jogada
   {
       
      int valor, valor2;
    // valor = Integer.parseInt(colOrigem); //conversao de String para int. Funciona so para Strings numericas, ou seja colunas
    // valor2 = Integer.parseInt(colDestino);
     //campo.parque[valor2-1][valor3].setPeca(peca);
       //  campo.parque[valor-1][valor4].setPeca(null);
// Criação do map de letras 
   Map<String, Integer> alfabeto = new HashMap<String, Integer>();

//Mapeamento dos valores de cada letra do alfabeto para facilitar a criação de jogadas
alfabeto.put("1", 0);
alfabeto.put("2", 1);
alfabeto.put("3", 2);
alfabeto.put("4", 3);
alfabeto.put("5", 4);
alfabeto.put("6", 5);
alfabeto.put("7", 6);
alfabeto.put("8", 7);
     valor = alfabeto.get(linDestino);
     return valor;
 
   }
  /* public void realizaJogada(String linOrigem,String colOrigem, String linDestino, String colDestino)
   {
       int valor, valor2, valor3, valor4;
       valor = Integer.parseInt(colOrigem); //conversao de String para int. Funciona so para Strings numericas, ou seja colunas
       valor2 = Integer.parseInt(colDestino);
       valor3 = recebeJogada(linDestino);
       valor4 = recebeJogada(linOrigem);
       Peca peca = campo.parque[valor-1][valor4].getPeca(); //pega simbolo da peca naquela posicao       
       
         campo.parque[valor2-1][valor3].setPeca(peca);
        campo.parque[valor2-1][valor3].getPeca().desenhar();
         campo.parque[valor-1][valor4].setPeca(null);
     
         
     tentativa de juntar tudo num método só para tirar da classe principal
    
   }*/ 
  
}
