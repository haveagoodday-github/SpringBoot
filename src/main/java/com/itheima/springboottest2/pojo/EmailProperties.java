package com.itheima.springboottest2.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "email")
public class EmailProperties {
    public String user;
    public String code;
    public String host;
    private boolean auth;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "EmailProperties{" +
                "user='" + user + '\'' +
                ", code='" + code + '\'' +
                ", host='" + host + '\'' +
                ", auth=" + auth +
                '}';
    }
}
