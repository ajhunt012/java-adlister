package com.codeup.adlister;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[]args){
        Album a1 = new Album(1,"Bad Bunny", "Trapenado", 2022, 3.4, "Trap");
        Album a2 = new Album(2, "Taylor Swift", "21", 2016, 6.9, "hippity-hoppity");

        Author author1 = new Author(1, "Yogi", "Berra");
        Author author2 = new Author(2, "Jacko", "Willink");

        Quote q1 = new Quote(1, "it's not over till its over", author1);
        Quote q2 = new Quote(2,  "If the world were perfect, it wouldnt be", author1);
        Quote q3 = new Quote(3, "Good", author2);

        List<Quote>quoteList = new ArrayList<>();
        quoteList.add(q1);
        quoteList.add(q2);
        quoteList.add(q3);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author2);


        List<Album> albumList = new ArrayList<>();
        albumList.add(a1);
        albumList.add(a2);

        for(Quote quote: quoteList){
            System.out.println(quote.toString());

            for (Album album: albumList){
                System.out.println(album.toString());

                for (Author author: authorList){
                    System.out.println(author.toString());
                }
            }
        }


    }
}
