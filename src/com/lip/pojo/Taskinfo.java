package com.lip.pojo;

import java.util.Date;

public class Taskinfo {
    private Integer tid;

    private Integer aid;

    private Integer rtype;

    private Date stime;

    private Date etime;

    private Integer pid;

    private Integer tstatus;

    private String tname;

    private String tpic;

    private String uid;

    private String tdetail;

    private Integer iid;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getRtype() {
        return rtype;
    }

    public void setRtype(Integer rtype) {
        this.rtype = rtype;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTstatus() {
        return tstatus;
    }

    public void setTstatus(Integer tstatus) {
        this.tstatus = tstatus;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTpic() {
        return tpic;
    }

    public void setTpic(String tpic) {
        this.tpic = tpic == null ? null : tpic.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getTdetail() {
        return tdetail;
    }

    public void setTdetail(String tdetail) {
        this.tdetail = tdetail == null ? null : tdetail.trim();
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }
}