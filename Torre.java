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
public class Torre extends Peca
{
   /*private int cor; // se 0 é preto se 1 é branco
    private boolean ativa; //para jogador saber se a peca esta ativa ou nao
    private String simbolo;*/
    
     public Torre(int cor) //construtor
    {
         super(cor);
       /* this.ativa = true; //a peça começa ativa
        this.cor = cor; //a peça é construida com sua cor especifica
       */
        
    }
   public String desenhar() //imorime peca na tela
    {
        if(this.cor == 1 && this.getAtiva() == true) 
        {
            simbolo = "T";
            return simbolo;
        }
         if (this.cor == 0 && this.getAtiva()== true)
        {
            simbolo = "t";
            return simbolo; 
        }
        return simbolo; //se é preto desenha com p se é branco desenha com P
    }
    
/*public boolean getAtiva() //get para saber o status da peca no jogo
 {
     return this.ativa;
 }*/

/*public int getCor() // get para saber a cor da peca para facilitar e nao precisar reescrever codigo
 {
     return this.cor;
 }*/
 
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
	
	return false;
     
 }
    
       
}
