package com.grade.entity;

public class AppOrder {
    private Integer id;

    private String order;

    private String app;

    private String ad;

    private String user;

    private String device;

    private Integer points;

    private String time;

    private String sig;

    private String sig2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order == null ? null : order.trim();
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad == null ? null : ad.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getSig() {
        return sig;
    }

    public void setSig(String sig) {
        this.sig = sig == null ? null : sig.trim();
    }

    public String getSig2() {
        return sig2;
    }

    public void setSig2(String sig2) {
        this.sig2 = sig2 == null ? null : sig2.trim();
    }
}