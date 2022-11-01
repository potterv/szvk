package ru.pfr.szvk;

import java.util.List;


public class Policyholder {

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

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Policyholder{" +
                "uuidPachka='" + uuidPachka + '\'' +
                ", uuidRecord='" + uuidRecord + '\'' +
                ", inn='" + inn + '\'' +
                ", kpp='" + kpp + '\'' +
                ", name='" + name + '\'' +
                ", regNum='" + regNum + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    private String uuidPachka;
    private String uuidRecord;
    private String inn;
    private String kpp;
    private String name;
    private String regNum;
    private String fileName;

}
