package main.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

public class AuthRegisterResponse {
    private boolean result;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, String> errors;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }
}
