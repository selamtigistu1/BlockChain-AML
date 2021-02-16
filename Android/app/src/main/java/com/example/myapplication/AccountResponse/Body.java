package com.example.myapplication.AccountResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("publickey")
    @Expose
    private String publickey;
    @SerializedName("pivatekey")
    @Expose
    private String pivatekey;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("accountName")
    @Expose
    private String accountName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublickey() {
        return publickey;
    }

    public void setPublickey(String publickey) {
        this.publickey = publickey;
    }

    public String getPivatekey() {
        return pivatekey;
    }

    public void setPivatekey(String pivatekey) {
        this.pivatekey = pivatekey;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}