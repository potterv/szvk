package ru.pfr.szvk;

import java.util.List;

public class Snilsy {
    public List<Snils> getSnilsList() {
        return snilsList;
    }

    public void addSnils(Snils snils) {
        this.snilsList.add(snils);
    }

    @Override
    public String toString() {
        return "Snilsy{" +
                "snilsList=" + snilsList +
                '}';
    }

    private List<Snils> snilsList;
}
