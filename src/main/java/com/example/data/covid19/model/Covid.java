package com.example.data.covid19.model;

import java.util.Date;
import java.util.List;

public class Covid {
    public int version;
    public String sourceUrl;
    public String country;
    public Date lastUpdatedAtApify;
    public String historyData;
    public String readMe;
    public String tested;
    public int recovered;
    public Date lastUpdatedAtSource;
    public int infected;
    public int deceased;
    public List<InfectedByRegion> infectedByRegion;
    public List<DeceasedByRegion> deceasedByRegion;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLastUpdatedAtApify() {
        return lastUpdatedAtApify;
    }

    public void setLastUpdatedAtApify(Date lastUpdatedAtApify) {
        this.lastUpdatedAtApify = lastUpdatedAtApify;
    }

    public String getHistoryData() {
        return historyData;
    }

    public void setHistoryData(String historyData) {
        this.historyData = historyData;
    }

    public String getReadMe() {
        return readMe;
    }

    public void setReadMe(String readMe) {
        this.readMe = readMe;
    }

    public String getTested() {
        return tested;
    }

    public void setTested(String tested) {
        this.tested = tested;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public Date getLastUpdatedAtSource() {
        return lastUpdatedAtSource;
    }

    public void setLastUpdatedAtSource(Date lastUpdatedAtSource) {
        this.lastUpdatedAtSource = lastUpdatedAtSource;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public int getDeceased() {
        return deceased;
    }

    public void setDeceased(int deceased) {
        this.deceased = deceased;
    }

    public List<InfectedByRegion> getInfectedByRegion() {
        return infectedByRegion;
    }

    public void setInfectedByRegion(List<InfectedByRegion> infectedByRegion) {
        this.infectedByRegion = infectedByRegion;
    }

    public List<DeceasedByRegion> getDeceasedByRegion() {
        return deceasedByRegion;
    }

    public void setDeceasedByRegion(List<DeceasedByRegion> deceasedByRegion) {
        this.deceasedByRegion = deceasedByRegion;
    }
}


