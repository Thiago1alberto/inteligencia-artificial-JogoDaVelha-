package jogadores;

import jogo.Tabuleiro;

public class JogadorLinhaColuna extends Jogador{

    public JogadorLinhaColuna(String nome) {
        super(nome);
    }

    @Override
    public int[] jogar(int[][] tabuleiro) {
        int[] jogada = new int[2];
        for(int i = 0; i < tabuleiro.length; i++){
            for(int j = 0; j < tabuleiro.length; j++){
                if(tabuleiro[i][j] == -1){
                    jogada[0] = i;
                    jogada[1] = j;
                    return jogada;
                }
            }
        }
        return null;
    }
    
}
