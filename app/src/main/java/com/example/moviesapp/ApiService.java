package com.example.moviesapp;

import java.util.List;
import java.util.Map;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ApiService {

    @GET("movie?token=B4SYYRK-VMHMMS2-G67AVP8-1JD6P9Z&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=B4SYYRK-VMHMMS2-G67AVP8-1JD6P9Z&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("review?token=B4SYYRK-VMHMMS2-G67AVP8-1JD6P9Z&&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);

}
