package com.abdm.data_transfer_workflow.models;
//import com.abdm.data_transfer_workflow.models.DHPublicKey;

public class KeyMaterial {
    private String cryptoAlg;
    private String curve;
    private DHPublicKey dhPublicKey;
    private String nonce;

    public String getCryptoAlg() {
        return cryptoAlg;
    }

    public void setCryptoAlg(String cryptoAlg) {
        this.cryptoAlg = cryptoAlg;
    }

    public String getCurve() {
        return curve;
    }

    public void setCurve(String curve) {
        this.curve = curve;
    }

    public DHPublicKey getDhPublicKey() {
        return dhPublicKey;
    }

    public void setDhPublicKey(DHPublicKey dhPublicKey) {
        this.dhPublicKey = dhPublicKey;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }
}
