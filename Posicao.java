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
public class Posicao 
{
    private int cor; //cor da posição
    public boolean ocupada; //ver se tem alguem na posicao
    private int linha, coluna;
    private Peca peca;
    

    public Posicao() //construtor;
    {
        this.peca = null;
        this.ocupada = false;      
        //this.peca = p;
        
    }

    public Peca getPeca() //get para saber qual peca esta em cima daquela posicao
    {
        return this.peca;
    }

    public void setPeca(Peca nomeDaPeca) //set para posicionar a peca naquela posicao
    {

      /*  if (this.ocupada == true ||this.getPeca()!=null) // checa se ta ocupada
        {
            System.out.println("Casa ja ocupada por 1 peca");
        }*/
        this.peca = nomeDaPeca;
        this.ocupada = true; //a casa se torna ocupada
    }
    
    public int getCor()
    {
        return this.cor;
    }
    public int getLinha()
    {
        return this.linha;
    }
    public int getColuna()
    {
        return this.coluna;
    }
    

}
