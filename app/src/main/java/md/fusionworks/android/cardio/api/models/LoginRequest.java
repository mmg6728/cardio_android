package md.fusionworks.android.cardio.api.models;

import com.google.gson.annotations.SerializedName;


/**
 * Created by admin on 13.08.2015.
 */

public class LoginRequest {

    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
