package br.com.thisismyplaylist.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() > 5){
            System.out.println(audio.getTitulo() + " foi adicionado na sua playlist Favoritas");
        } else {
            System.out.println(audio.getTitulo() + " foi adicionado na playlist assistir novamente!");
        }
    }
}
