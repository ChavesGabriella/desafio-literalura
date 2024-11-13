package br.com.alura.LiterAlura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosAutor(
        @JsonAlias("name") String name,
        @JsonAlias("birth_year") int birthYear,
        @JsonAlias("death_year") int deathYear )
{
}