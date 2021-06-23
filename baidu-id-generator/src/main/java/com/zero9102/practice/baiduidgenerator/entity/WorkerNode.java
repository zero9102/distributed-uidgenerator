package com.zero9102.practice.baiduidgenerator.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * WorkerNode entity model
 *
 * @author zero9102
 */
public class WorkerNode implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String hostName;

    private String port;

    private int type;

    private Date launchDate;

    private Date modified;

    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "WorkerNode{" +
                "id=" + id +
                ", hostName='" + hostName + '\'' +
                ", port='" + port + '\'' +
                ", type='" + type + '\'' +
                ", launchDate=" + launchDate +
                ", modified=" + modified +
                ", created=" + created +
                '}';
    }
}
