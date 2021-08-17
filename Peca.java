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
public abstract class Peca 
{
protected int cor; //se 0 é preto se 1 é branco
protected boolean estado;
private  boolean ativa;
protected String simbolo;

public Peca(int cor) //construtor
{
   this.estado = true;
    this.ativa = true; //a peça começa ativa
        this.cor = cor;
}
public String desenhar() //imprime peca
{
    
    if(cor == 1 && estado == true  ) 
    {
       return simbolo.toLowerCase();
    }
    return simbolo;
}
public boolean checaMovimento(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino) //metodo tenque ser abstrato
{
 return true;
}
void comePeca() //capturar peca
{
  this.estado = false;
  this.ativa = false;
  
}
boolean getEstado()
{
    return this.estado;
}
boolean getAtiva()
{
    return this.ativa;
}
int getCor()
{
    return this.cor;
}
  Posicao[][] construirMatiz( )
  {
      Posicao posicao[][] = null;
      try //trata o erro de alocacao
      {
         posicao = new Posicao[8][8]; 
      }
      catch(Exception naoalocou)
      {
          System.out.println("falhou. Sem memória.");
          
      }
      return posicao;
  }
}
