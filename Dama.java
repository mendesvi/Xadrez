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
public class Dama extends Peca
{

     public Dama(int cor) //construtor
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
            simbolo = "D";
            return simbolo;
        }
         if (this.cor == 0 && this.getAtiva() == true)
        {
            simbolo = "d";
            return simbolo; 
        }
        return simbolo; //se é preto desenha com p se é branco desenha com P
    }
    
/* public boolean getAtiva() //get para saber o status da peca no jogo
 {
     return this.ativa;
 }
    
 public int getCor() // get para saber a cor da peca para facilitar e nao precisar reescrever codigo
 {
     return this.cor;
 }
 */

 //codigo da torre e bispo reutilizado
 public boolean movimento(int linhaqueesta, int colunaqueesta, int linhaquevai, int colunaquevai)
 {
     if(colunaqueesta == colunaquevai)
     {
         return true;
     }
     else if(linhaqueesta == linhaquevai)
     {
       return true;
     }
     else if(Math.abs(linhaqueesta - linhaquevai) == Math.abs(colunaqueesta - colunaquevai))
     {
       return true;
     }
	
   return false;   
   
 }
    
}
