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
public class Tabuleiro {
int h;
    private int colunas = 8;
    private int linhas = 8;
    protected Posicao[][] parque = new Posicao[8][8];
       

    public Tabuleiro(Peca exercitobranco[], Peca exercitopreto[]) //vai contruir o tabuleiro com as pecas nas posicoes iniciais
    {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.parque[i][j] = new Posicao();

            }
        }

        this.parque[0][0].setPeca(exercitobranco[8]); //maiusculo é branco
        this.parque[0][1].setPeca(exercitobranco[10]);
        this.parque[0][2].setPeca(exercitobranco[12]);
        this.parque[0][3].setPeca(exercitobranco[14]);
        this.parque[0][4].setPeca(exercitobranco[15]);
        this.parque[0][5].setPeca(exercitobranco[13]);
        this.parque[0][6].setPeca(exercitobranco[11]);
        this.parque[0][7].setPeca(exercitobranco[9]);
        this.parque[1][0].setPeca(exercitobranco[0]);
        this.parque[1][1].setPeca(exercitobranco[1]);
        this.parque[1][2].setPeca(exercitobranco[2]);
        this.parque[1][3].setPeca(exercitobranco[3]);
        this.parque[1][4].setPeca(exercitobranco[4]);
        this.parque[1][5].setPeca(exercitobranco[5]);
        this.parque[1][6].setPeca(exercitobranco[6]);
        this.parque[1][7].setPeca(exercitobranco[7]);

        this.parque[7][0].setPeca(exercitopreto[8]);
        this.parque[7][1].setPeca(exercitopreto[10]);
        this.parque[7][2].setPeca(exercitopreto[12]);
        this.parque[7][3].setPeca(exercitopreto[14]);
        this.parque[7][4].setPeca(exercitopreto[15]);
        this.parque[7][5].setPeca(exercitopreto[13]);
        this.parque[7][6].setPeca(exercitopreto[11]);
        this.parque[7][7].setPeca(exercitopreto[9]);
        this.parque[6][0].setPeca(exercitopreto[0]);
        this.parque[6][1].setPeca(exercitopreto[1]);
        this.parque[6][2].setPeca(exercitopreto[2]);
        this.parque[6][3].setPeca(exercitopreto[3]);
        this.parque[6][4].setPeca(exercitopreto[4]);
        this.parque[6][5].setPeca(exercitopreto[5]);
        this.parque[6][6].setPeca(exercitopreto[6]);
        this.parque[6][7].setPeca(exercitopreto[7]);

    }

    public int getLinhas() {
        return this.linhas;
    }

    public int getColunas() {
        return this.colunas;
    }

    public void mostra() //imprime tabuleiro
    {

        char[] marcaTab = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.print("*  ");
        for (int i = 0; i < this.linhas; i++) 
        {
            System.out.print((i + 1) + "  ");
        }

        System.out.println("");
        for (int j = 0; j < this.colunas; j++) 
        {
            System.out.print(marcaTab[j] + " "); //imprime coluna. Nas regras diz que as colunas vao de 1 a 8
            for (int aux = 0; aux < 8; aux++) 
            {
                if (this.parque[j][aux].getPeca() == null) 
                {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[" + this.parque[j][aux].getPeca().desenhar() + "]");//impressao das casas com a peca

                }
            }
            System.out.println("");

        }

    }

    public boolean checaValidade(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino)//checa se a peca nao saiu do tabuleiro
    {
        if (((0 <= linhaOrigem) && (linhaOrigem <= 8)) && ((0 <= linhaDestino) && (linhaDestino <= 8)) && ((0 <= colunaOrigem) && (colunaOrigem <= 8)) && ((0 <= colunaDestino) && (colunaDestino <= 8))) {
            return true;
        } else {
            System.out.println("fora do tabuleiro");
            return false;
        }
    }

    public boolean checaObstaculo(int linhaOrigem, int colunaOrigem, int linhaDestino, int colunaDestino)//verifica se tem peça na frente
    {
       Peca peca, pecaDestino;
        int n;   
        //this.mostra();
        pecaDestino = this.parque[linhaDestino][colunaDestino].getPeca();
        peca = this.parque[linhaOrigem][colunaOrigem].getPeca();   
        /////////////////////////////////////////////////////////////////////////////////euuuuuu/////////////////////////
      /*  if (peca != null && (linhaOrigem == linhaDestino ^ colunaOrigem == colunaDestino) &&(this.parque[linhaOrigem][colunaOrigem].getPeca().desenhar()== "T" || this.parque[linhaOrigem][colunaOrigem].getPeca().desenhar() == "t") && pecaDestino.getCor()!=peca.getCor())
        {
            return true;
        }*/
        //if (peca != null && (peca.desenhar() == "D" || peca.desenhar() == "d"))
       if (this.parque[linhaOrigem][colunaOrigem].getPeca() != null && Math.abs(linhaOrigem - linhaDestino) != Math.abs(colunaOrigem - colunaDestino) && (this.parque[linhaOrigem][colunaOrigem].getPeca().desenhar()== "B" || this.parque[linhaOrigem][colunaOrigem].getPeca().desenhar() == "b"))
        {
            n = Math.abs(linhaOrigem - linhaDestino) + 1;
            int sinalI;
            int sinalJ;
            sinalI = sinalJ = 1;
           
            //primeiro quadrante.
            if (linhaOrigem > linhaDestino && colunaOrigem < colunaDestino) 
            {
                sinalI = -sinalI;
            } //segundo quadrante.
            else if (linhaOrigem > linhaDestino && colunaOrigem > colunaDestino) 
            {
                sinalI = -sinalI;
                sinalJ = -sinalJ;
            } //terceiro quadrante.
            else if (linhaOrigem < linhaDestino && colunaOrigem > colunaDestino)
            {
                sinalJ = -sinalJ;
            }
            //quarto quadrante, mantém os dois sinais = 1.

            for (int k = 1, i = 0, j = 0; k < n-1; k++, i += 1 * sinalI, j += 1 * sinalJ) 
            {
                
                if (this.parque[linhaOrigem + i][colunaOrigem + j].getPeca() != null ) 
                {

                    return false;
                }

            }

            if (pecaDestino == null || pecaDestino.getCor() != this.parque[linhaOrigem][colunaOrigem].getPeca().getCor()) {
                if (pecaDestino != null) {
                    pecaDestino.comePeca();
                }
               // this.parque[linhaDestino][colunaDestino].setPeca(pecaDestino);
               // this.parque[linhaOrigem][colunaOrigem].setPeca(null);
                return true;
            }

            return true;
        }
        else 
        { 
            if (pecaDestino == null || pecaDestino.getCor() != this.parque[linhaOrigem][colunaOrigem].getPeca().getCor()) {
                if (pecaDestino != null) {
                    pecaDestino.comePeca();
                }
               // this.parque[linhaDestino][colunaDestino].setPeca(pecaDestino);
               // this.parque[linhaOrigem][colunaOrigem].setPeca(null);
                System.out.println("teste de movimento");
                return true;
            } 
        }
        return false;
     
    }

}
