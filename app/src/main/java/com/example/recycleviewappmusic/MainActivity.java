package com.example.recycleviewappmusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Playlist> playlists;
    private PlaylistAdapter playlistAdapter;
    private TextView playlistTitleTextView;
    private List<String> musicTitles;
    private RecyclerView playlistRecyclerView;
    private RecyclerView musicRecyclerView;
    private MusicAdapter musicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar o título das playlists
        playlistTitleTextView = findViewById(R.id.playlist_title_text_view);
        playlistTitleTextView.setText("Minhas Playlists");

        // Popula a lista de playlists com exemplos
        playlists = new ArrayList<>();
        playlists.add(new Playlist(R.drawable.playlist1, "You Listen", "10 Sons"));
        playlists.add(new Playlist(R.drawable.playlist2, "Good Vibes", "5 Sons"));
        playlists.add(new Playlist(R.drawable.playlist3, "Moon Sounds", "8 Sons"));
        playlists.add(new Playlist(R.drawable.playlist4, "The Pink Music", "12 Sons"));
        playlists.add(new Playlist(R.drawable.playlist5, "Sad Music", "15 Sons"));
        playlists.add(new Playlist(R.drawable.playlist6, "Pop Brasil", "22 Sons"));

        // Inicializa o RecyclerView das playlists
        playlistRecyclerView = findViewById(R.id.playlist_recycler_view);
        playlistRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Cria um novo adapter para as playlists e define para o RecyclerView
        playlistAdapter = new PlaylistAdapter(playlists);
        playlistRecyclerView.setAdapter(playlistAdapter);

        // Criar a lista de títulos de músicas numeradas
        musicTitles = new ArrayList<>();
        musicTitles.add("1. Leão – Marilia Mendonça – Som Livre");
        musicTitles.add("2. Erro gostoso – Simone Mendes – Universal");
        musicTitles.add("3. Guarda roupa – Fred e Fabricio, Hugo e Guilherme – Som Livre");
        musicTitles.add("4. Traumatizei – Henrique e Juliano – Virgin");
        musicTitles.add("5. Oi balde – Zé Neto e Cristiano – Som Livre");
        musicTitles.add("6. Bombonzinho – Israel e Rodolffo, Ana Castela – Som Livre\n");
        musicTitles.add("7. Palhaça – Naiara Azevedo ft Ana Castela – Independente");
        musicTitles.add("8. Não vitalicio – Matheus e Kauan, Mari Fernandez – Universal");
        musicTitles.add("9. A culpa é nossa – Maiara e Maraísa – Som Livre");
        musicTitles.add("10. Nosso quadro – Agroplay, Ana Castela – Independente");
        musicTitles.add("11. Esse B.O é meu – Guilherme e Benuto, Matheus e Kauan – Sony");
        musicTitles.add("12. Eu gosto assim – Gustavo Mioto, Mari Fernandez – Universal");
        musicTitles.add("13. Calm down – Selena Gomez, Rema – Virgin Music");
        musicTitles.add("14. Coração cigano – Luan Santana, Luisa Sonza – Sony");
        musicTitles.add("15. Flowers – Miley Cyrus – Sony");
        musicTitles.add("16. Zona de perigo – Leo Santana – Universal");
        musicTitles.add("17. Larga ai pra ver – Léo e Raphael, Jorge – Independente");
        musicTitles.add("18. Perdoou nada – Israel e Rodolffo, Jorge e Mateus – Som Livre");
        musicTitles.add("19. Metade de mim – Hugo e Guilherme – Som Livre");
        musicTitles.add("20. Agora somos Ex – Léo Magalhães – Independente");
        musicTitles.add("21. Despedida de sofrimento – Felipe Araújo – Universal");


        // Inicializa o RecyclerView das músicas
        musicRecyclerView = findViewById(R.id.music_recycler_view);
        musicRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Cria um novo adapter para as músicas e define para o RecyclerView
        musicAdapter = new MusicAdapter(musicTitles);
        musicRecyclerView.setAdapter(musicAdapter);
    }
}
