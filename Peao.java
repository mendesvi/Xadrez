/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author mende
 */
public class Peao extends Peca
{
   
    public Peao(int cor) //construtor
    {
        super(cor); 
        
      /*  this.ativa = true; //a peça começa ativa
        this.cor = cor; //a peça é construida com sua cor especifica
        */
    }
    public String desenhar() //imprime peca na tela
    {
        if(this.cor == 1 && this.getAtiva() == true) 
        {
            simbolo = "P";
            return simbolo;
        }
         if (this.cor == 0 && this.getAtiva() == true)
        {
            simbolo = "p";
            return simbolo; 
        }
        return simbolo; //se é preto desenha com p se é branco desenha com P
    }
 /*public int getCor() // get para saber a cor da peca para facilitar e nao precisar reescrever codigo
 {
     return this.cor;
 }*/
 
/* public boolean getAtiva() //get para saber o status da peca no jogo
 {
     return this.ativa;
 }*/
 
public boolean movimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino)
 {
             
             if((this.cor == 1 && colunaOrigem == colunaDestino && linhaOrigem-linhaDestino == -1) || (this.cor == 0 && colunaOrigem == colunaDestino && linhaOrigem-linhaDestino == 1))
             { 
		return true; 
	     }
             
	else
             {
                 return false;
             }
	
 }
           
}
