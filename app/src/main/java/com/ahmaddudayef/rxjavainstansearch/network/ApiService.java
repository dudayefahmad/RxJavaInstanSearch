package com.ahmaddudayef.rxjavainstansearch.network;

import com.ahmaddudayef.rxjavainstansearch.network.model.Contact;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ahmad Dudayef on 5/31/2018.
 */

public interface ApiService {
    @GET("contacts.php")
    Single<List<Contact>> getContacts(@Query("source") String source, @Query("search") String query);
}
