package com.example.moviesapp;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=B4SYYRK-VMHMMS2-G67AVP8-1JD6P9Z&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{idFilm}?token=B4SYYRK-VMHMMS2-G67AVP8-1JD6P9Z")
    Single<TrailerResponse> loadTrailers(@Path("idFilm") int id);

    @GET("review?token=B4SYYRK-VMHMMS2-G67AVP8-1JD6P9Z&&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);

}
