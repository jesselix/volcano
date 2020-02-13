package li.jesse.volcanocommon.base;

import java.io.Serializable;

public class ServerResponse<T> implements Serializable {

    private int statusCode;
    private String message;
    private T data;

    public ServerResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    public ServerResponse(int statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public ServerResponse(int statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
