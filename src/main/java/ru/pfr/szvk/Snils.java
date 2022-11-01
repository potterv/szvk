package ru.pfr.szvk;

public class Snils {
    public String getUuidPachka() {
        return uuidPachka;
    }

    public void setUuidPachka(String uuidPachka) {
        this.uuidPachka = uuidPachka;
    }

    public String getUuidRecord() {
        return uuidRecord;
    }

    public void setUuidRecord(String uuidRecord) {
        this.uuidRecord = uuidRecord;
    }

    public String getUuidRecordPolicyholder() {
        return uuidRecordPolicyholder;
    }

    public void setUuidRecordPolicyholder(String uuidRecordPolicyholder) {
        this.uuidRecordPolicyholder = uuidRecordPolicyholder;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    @Override
    public String toString() {
        return "Snils{" +
                "uuidPachka='" + uuidPachka + '\'' +
                ", uuidRecord='" + uuidRecord + '\'' +
                ", uuidRecordPolicyholder='" + uuidRecordPolicyholder + '\'' +
                ", snils='" + snils + '\'' +
                ", surname='" + surname + '\'' +
                ", im='" + im + '\'' +
                ", ot='" + ot + '\'' +
                '}';
    }

    private String uuidPachka;
    private String uuidRecord;
    private String uuidRecordPolicyholder;
    private String snils;
    private String surname;
    private  String im;
    private String ot;






}
