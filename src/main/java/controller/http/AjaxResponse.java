package main.java.controller.http;


import java.io.Serializable;
import java.util.Map;

public class AjaxResponse<E> implements Serializable {
    private E body;
    private String message;
    private boolean error;

    private Map<String, String> optional;

    public E getBody() {
        return body;
    }

    public AjaxResponse<E> setBody(E body) {
        this.body = body;
        return this;
    }

    public Map<String, String> getOptional() {
        return optional;
    }

    public AjaxResponse<E> setOptional(Map<String, String> optional) {
        this.optional = optional;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResponse<E> setMessage(String message) {
        this.message = message;
        return this;
    }

    public boolean getError() {
        return error;
    }

    public AjaxResponse<E> setError(boolean error) {
        this.error = error;
        return this;
    }
}
