package com.Aniramki.cards.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter @Setter
public class Properties {

    private String msg;
    private  String buildVersion;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getBuildVersion() {
        return buildVersion;
    }

    public void setBuildVersion(String buildVersion) {
        this.buildVersion = buildVersion;
    }

    public Map<String, String> getMailDetails() {
        return mailDetails;
    }

    public void setMailDetails(Map<String, String> mailDetails) {
        this.mailDetails = mailDetails;
    }

    public List<String> getActiveBranches() {
        return activeBranches;
    }

    public void setActiveBranches(List<String> activeBranches) {
        this.activeBranches = activeBranches;
    }

    public Properties(String msg, String buildVersion, Map<String, String> mailDetails, List<String> activeBranches) {

        this.msg = msg;
        this.buildVersion = buildVersion;
        this.mailDetails = mailDetails;
        this.activeBranches = activeBranches;
    }

    private Map<String, String> mailDetails;
    private List<String> activeBranches;
}
