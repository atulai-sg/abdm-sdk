package com.abdm.consent.models;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="grants1")

public class Consentgranted {


    private String reqid;

   private boolean granted;

    public Consentgranted(String reqid, boolean granted) {
        this.reqid = reqid;
        this.granted = granted;
    }

    public Consentgranted(String uuid) {
        this.reqid = uuid;
        this.granted=false;
    }

    public String getReqid() {
        return reqid;
    }

    public void setReqid(String reqid) {
        this.reqid = reqid;
    }

    public boolean isGranted() {
        return granted;
    }

    public void setGranted(boolean granted) {
        this.granted = granted;
    }

    @Override
    public String toString() {
        return "Consentgranted{" +
                "reqid='" + reqid + '\'' +
                ", granted=" + granted +
                '}';
    }
}
