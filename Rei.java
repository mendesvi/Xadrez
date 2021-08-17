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
public class Rei extends Peca
{
 /*private int cor; // se 0 é preto se 1 é branco
 private  boolean ativa;
 private String simbolo;
   */ 
    public Rei(int cor) //construtor
    {
        super(cor);
     /*   this.ativa = true; //a peça começa ativa
        this.cor = cor; //a peça é construida com sua cor especifica
       */ 
    }
   public String desenhar() //imorime peca na tela
    {
        if(this.cor == 1 && this.getAtiva() == true) 
        {
            simbolo = "R";
            return simbolo;
        }
         if (this.cor == 0 && this.getAtiva() == true)
        {
            simbolo = "r";
            return simbolo; 
        }
        return simbolo; //se é preto desenha com p se é branco desenha com P
    }
/*public int getCor() // get para saber a cor da peca para facilitar e nao precisar reescrever codigo
 {
     return this.cor;
 }
 
public boolean getAtiva() //get para saber o status da peca no jogo
 {
     return this.ativa;
 }*/
 
public boolean movimento(int linhaqueesta, int colunaqueesta, int linhaquevai, int colunaquevai)
 {
   if((linhaqueesta+1 == linhaquevai) && (colunaqueesta+1 == colunaquevai)) //diagonal direita superior
   {
       return true;
   }
   
   else if((linhaqueesta+1 == linhaquevai) && (colunaqueesta-1 == colunaquevai)) //diagonal direita infeiror
   {
       return true;
   }
   
   else if((linhaqueesta+1 == linhaquevai) && (colunaqueesta == colunaquevai)) //lado direito
   {
       return true;
   }
   
   else if((linhaqueesta-1 == linhaquevai) && (colunaqueesta+1 == colunaquevai))//diagonal esquerda superior
   {
       return true;
   }
   
   else if((linhaqueesta-1 == linhaquevai) && (colunaqueesta-1 == colunaquevai))//diagonal esquerda inferior
   {
       return true;
   }
   
   else if((linhaqueesta-1 == linhaquevai) && (colunaqueesta == colunaquevai)) //lado esquerdo
   {
       return true;
   }
   
   else if((linhaqueesta == linhaquevai) && (colunaqueesta+1 == colunaquevai)) //para cima
   {
       return true;
   }
   
   else if((linhaqueesta == linhaquevai) && (colunaqueesta-1 == colunaquevai)) //para baixo
   {
       return true;
   }
   return false;
 }    
}
