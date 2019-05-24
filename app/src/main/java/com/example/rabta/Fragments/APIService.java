package com.example.rabta.Fragments;



import com.example.rabta.Notifications.MyResponse;
import com.example.rabta.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAhtNSnXE:APA91bHNlgWVGOgvkndIzCAJrcNyYSlvEmFYqNiBvwEGqnKsvwrORAloyONOL_uensLhpmLlJcBdjcXr8YjgdpNRTsjnYxx165tMrCVWYQpIsDgdeM7XauCdVuxQUSk6NSOYeozyjzxc"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}