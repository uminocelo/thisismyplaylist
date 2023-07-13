package br.com.thisismyplaylist.principal;

import br.com.thisismyplaylist.modelos.MinhasPreferidas;
import br.com.thisismyplaylist.modelos.Musica;
import br.com.thisismyplaylist.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("kiss");

        for(int i = 0; i < 50; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("bolha dev é chata");
        meuPodcast.setApresentador("eu");
        meuPodcast.setDescricao("um podcast");

        for (int i = 0; i < 500; i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 250; i++){
            meuPodcast.curte();
        }


        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);
    }
}
