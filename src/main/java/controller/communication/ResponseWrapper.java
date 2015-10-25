package main.java.controller.communication;


import java.io.Serializable;

public class ResponseWrapper<E> implements Serializable{
    private E result;

    public E getResult() {
        return result;
    }

    public void setResult(E result) {
        this.result = result;
    }
}
