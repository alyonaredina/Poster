package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager posters = new PosterManager();

    @Test
    public void addPosters() {
        posters.addPosters("боевик Бладшот");
        posters.addPosters("мультфильм Вперёд");
        posters.addPosters("комедия Отель Белград");
        posters.addPosters("боевик Джентльмены");
        posters.addPosters("ужасы Человек-невидимка");
        posters.addPosters("мультфильм Тролли.Мировой тур");
        posters.addPosters("комедия Номер один");

        String[] expected = {"боевик Бладшот", "мультфильм Вперёд", "комедия Отель Белград", "боевик Джентльмены", "ужасы Человек-невидимка", "мультфильм Тролли.Мировой тур", "комедия Номер один"};
        String[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {

        String[] expected = {};
        String[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findOne() {
        posters.addPosters("мультфильм Тролли.Мировой тур");

        String[] expected = {"мультфильм Тролли.Мировой тур"};
        String[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreLimit() {
        posters.addPosters("боевик Бладшот");
        posters.addPosters("мультфильм Вперёд");
        posters.addPosters("комедия Отель Белград");
        posters.addPosters("боевик Джентльмены");
        posters.addPosters("ужасы Человек-невидимка");
        posters.addPosters("мультфильм Тролли.Мировой тур");
        posters.addPosters("комедия Номер один");

        String[] expected = {"комедия Номер один", "мультфильм Тролли.Мировой тур", "ужасы Человек-невидимка", "боевик Джентльмены", "комедия Отель Белград"};
        String[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit() {
        posters.addPosters("боевик Бладшот");
        posters.addPosters("мультфильм Вперёд");
        posters.addPosters("комедия Отель Белград");
        posters.addPosters("боевик Джентльмены");
        posters.addPosters("ужасы Человек-невидимка");


        String[] expected = {"ужасы Человек-невидимка", "боевик Джентльмены", "комедия Отель Белград", "мультфильм Вперёд", "боевик Бладшот"};
        String[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastUnderLimit() {
        posters.addPosters("боевик Бладшот");
        posters.addPosters("мультфильм Вперёд");



        String[] expected = {"мультфильм Вперёд", "боевик Бладшот"};
        String[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
