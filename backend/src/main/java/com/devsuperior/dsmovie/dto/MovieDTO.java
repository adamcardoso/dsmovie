package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

    @Getter private Long id;
    @Getter @Setter private String title;
    @Getter @Setter private Double score;
    @Getter @Setter private Integer count;
    @Getter @Setter private String image;

    public MovieDTO(Movie movie){
        id = movie.getId();
        title = movie.getTitle();
        score = movie.getScore();
        count = movie.getCount();
        image = movie.getImage();
    }
}
