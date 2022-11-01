package ru.pfr.szvk;

import java.util.List;

public class Policyholders {

    public List<Policyholder> getPolicyholderList() {
        return policyholderList;
    }
    @Deprecated
    public void setPolicyholderList(List<Policyholder> policyholderList) {
        this.policyholderList = policyholderList;
    }

    public void addPolicyholder(Policyholder policyholder) {
        this.policyholderList.add(policyholder) ;
    }

    @Override
    public String toString() {
        return "Policyholders{" +
                "policyholderList=" + policyholderList +
                '}';
    }

    private List<Policyholder> policyholderList ;
}
