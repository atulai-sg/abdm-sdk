package com.abdm.consent.models;

public enum HITypeEnum {
    OPConsultation("OpConsultation"),
    Prescription("Prescription"),
    DischargeSummary("DischargeSummary"),
    DiagnosticReport("DiagnosticReport"),
    ImmunizationRecord("ImmunizationRecord"),
    HealthDocumentRecord("HealthDocumentRecord"),
    WellnessRecord("WellnessRecord");

    private String hie;


    HITypeEnum(String v) {
        this.hie=v;


    }

    public String getHie() {
        return hie;
    }

    public void setHie(String hie) {
        this.hie = hie;
    }
}