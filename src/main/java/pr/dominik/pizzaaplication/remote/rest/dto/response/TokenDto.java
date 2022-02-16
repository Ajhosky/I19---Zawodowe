package pr.dominik.pizzaaplication.remote.rest.dto.response;

import pr.dominik.pizzaaplication.remote.rest.dto.request.PersonOrderDto;

public class TokenDto {
    private String token;

    public TokenDto() {

    }

    public TokenDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
