package com.yacov.myoramafundsapp.api;

import com.yacov.myoramafundsapp.model.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by YacovR on 28-Jan-18.
 */

public interface Service {
    @GET("/orama-media/json/fund_detail_full.json?limit=1000&offset=0&serializer=fund_detail_full")
    Call<List<Example>> getExample();

}
