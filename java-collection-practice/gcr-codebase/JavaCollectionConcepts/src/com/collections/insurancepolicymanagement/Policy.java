package com.collections.insurancepolicymanagement;

import java.time.LocalDate;
import java.util.Objects;

class Policy implements Comparable<Policy> {

    String policyNo;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    Policy(String policyNo, String holderName,
           LocalDate expiryDate, String coverageType, double premium) {
        this.policyNo = policyNo;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return policyNo.equals(p.policyNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNo);
    }


    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public String toString() {
        return policyNo + " | " + holderName + " | " +
                expiryDate + " | " + coverageType;
    }
}
