package com.example.myapplication.AccountResponse;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example_Acct {

    @SerializedName("headers")
    @Expose
    private Headers headers;
    @SerializedName("body")
    @Expose
    private List<Body> body = null;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("statusCodeValue")
    @Expose
    private Integer statusCodeValue;

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public List<Body> getBody() {
        return body;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getStatusCodeValue() {
        return statusCodeValue;
    }

    public void setStatusCodeValue(Integer statusCodeValue) {
        this.statusCodeValue = statusCodeValue;
    }

}