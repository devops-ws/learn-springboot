package io.github.devopsws.demo.model;

import java.util.List;

public class Message<T> {
    private String message;
    private List<T> data;

    // avoid the following error
    // JSON parse error: Cannot construct instance of
    public Message() {}

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message=message;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
