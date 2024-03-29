package br.com.erc_codes.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {
    @Id
    private String Id;
    private String title;
    private String image;
    private  int ranking;

    public Linguagem(String title, String image, int ranking) {

        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getRanking() {
        return ranking;
    }
}
