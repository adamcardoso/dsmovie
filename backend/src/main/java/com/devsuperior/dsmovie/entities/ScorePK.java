package com.devsuperior.dsmovie.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ScorePK implements Serializable {

    private static final long serialVersionUID = 1L;


    @ManyToOne
    @JoinColumn(name = "movie_id")
    @Getter @Setter private Movie movie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Getter @Setter private User user;
}
