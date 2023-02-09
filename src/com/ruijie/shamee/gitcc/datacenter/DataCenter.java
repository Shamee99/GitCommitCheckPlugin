package com.ruijie.shamee.gitcc.datacenter;


/**
 * git相关信息
 * @author Shamee Loop
 */
public class DataCenter {

    private String gitUser = "";
    private String gitPassword = "";
    private String gitRepo1 = "";
    private String gitRepo2 = "";
    private String gitRepo3 = "";
    private String gitRepo4 = "";
    private String gitRepo5 = "";

    public String getGitUser() {
        return gitUser;
    }

    public void setGitUser(String gitUser) {
        this.gitUser = gitUser;
    }

    public String getGitPassword() {
        return gitPassword;
    }

    public void setGitPassword(String gitPassword) {
        this.gitPassword = gitPassword;
    }

    public String getGitRepo1() {
        return gitRepo1;
    }

    public void setGitRepo1(String gitRepo1) {
        this.gitRepo1 = gitRepo1;
    }

    public String getGitRepo2() {
        return gitRepo2;
    }

    public void setGitRepo2(String gitRepo2) {
        this.gitRepo2 = gitRepo2;
    }

    public String getGitRepo3() {
        return gitRepo3;
    }

    public void setGitRepo3(String gitRepo3) {
        this.gitRepo3 = gitRepo3;
    }

    public String getGitRepo4() {
        return gitRepo4;
    }

    public void setGitRepo4(String gitRepo4) {
        this.gitRepo4 = gitRepo4;
    }

    public String getGitRepo5() {
        return gitRepo5;
    }

    public void setGitRepo5(String gitRepo5) {
        this.gitRepo5 = gitRepo5;
    }

    public DataCenter(String gitUser, String gitPassword, String gitRepo1, String gitRepo2, String gitRepo3, String gitRepo4, String gitRepo5) {
        this.gitUser = gitUser;
        this.gitPassword = gitPassword;
        this.gitRepo1 = gitRepo1;
        this.gitRepo2 = gitRepo2;
        this.gitRepo3 = gitRepo3;
        this.gitRepo4 = gitRepo4;
        this.gitRepo5 = gitRepo5;
    }
}
