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
public class Jogador 
{
    private String nome;
    public int escolha;
   // public String escolhaLin, escolhaCol;
   

	public Jogador() 
        {
	    
	}
        public String definiNome() //defini nome dos jogadores
        {        
         Scanner in = new Scanner( System.in );
         nome = in.nextLine();
         return nome;
        }
        public String getNome()
        {
            return this.nome;
        }
 
        public int definiEscolha() //define esolha das pecas
        { 
             
         Scanner ler = new Scanner(System.in);
         escolha = ler.nextInt(); //le a escolha
       if (escolha != 1 && escolha != 2)
        {
            System.out.println("entre um valor valido");
            this.definiEscolha();
        }
      
       
        return escolha;
       
        }
       
	
}
