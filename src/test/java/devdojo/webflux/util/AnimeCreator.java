package devdojo.webflux.util;

import devdojo.webflux.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved(){
        return Anime.builder()
                .name("Alita")
                .build();
    }

    public static Anime createValidAnime(){
        return Anime.builder()
                .id(1)
                .name("Alita")
                .build();
    }

    public static Anime createValidUpdatedAnime(){
        return Anime.builder()
                .id(1)
                .name("Alita New Order")
                .build();
    }
}
