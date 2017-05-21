package com.samexclusive.hari.pushnotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by hari on 21-05-2017.
 */

public class cloudmessangingid extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String token_id = FirebaseInstanceId.getInstance().getToken();
        Log.d("Key Token: ", token_id);
    }
}
