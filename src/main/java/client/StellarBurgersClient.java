package client;

import io.restassured.response.ValidatableResponse;

public interface StellarBurgersClient {
    ValidatableResponse createUser(User user);
    ValidatableResponse deleteUser(String accessToken);
    ValidatableResponse login(Credentials credentials);
}