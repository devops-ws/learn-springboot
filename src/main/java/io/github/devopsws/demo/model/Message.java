package io.github.devopsws.demo.model;

public class Message {
    private String message;

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
}
