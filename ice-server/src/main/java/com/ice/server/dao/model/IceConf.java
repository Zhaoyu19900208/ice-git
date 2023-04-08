package com.ice.server.dao.model;

import java.util.Date;

public class IceConf {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.app
     *
     * @mbg.generated
     */
    private Integer app;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.son_ids
     *
     * @mbg.generated
     */
    private String sonIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.inverse
     *
     * @mbg.generated
     */
    private Byte inverse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.conf_name
     *
     * @mbg.generated
     */
    private String confName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.conf_field
     *
     * @mbg.generated
     */
    private String confField;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.forward_id
     *
     * @mbg.generated
     */
    private Long forwardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.time_type
     *
     * @mbg.generated
     */
    private Byte timeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.start
     *
     * @mbg.generated
     */
    private Date start;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.end
     *
     * @mbg.generated
     */
    private Date end;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.complex
     *
     * @mbg.generated
     */
    private Integer complex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.debug
     *
     * @mbg.generated
     */
    private Byte debug;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.create_at
     *
     * @mbg.generated
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ice_conf.update_at
     *
     * @mbg.generated
     */
    private Date updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.id
     *
     * @return the value of tb_ice_conf.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.id
     *
     * @param id the value for tb_ice_conf.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.app
     *
     * @return the value of tb_ice_conf.app
     *
     * @mbg.generated
     */
    public Integer getApp() {
        return app;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withApp(Integer app) {
        this.setApp(app);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.app
     *
     * @param app the value for tb_ice_conf.app
     *
     * @mbg.generated
     */
    public void setApp(Integer app) {
        this.app = app;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.name
     *
     * @return the value of tb_ice_conf.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.name
     *
     * @param name the value for tb_ice_conf.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.son_ids
     *
     * @return the value of tb_ice_conf.son_ids
     *
     * @mbg.generated
     */
    public String getSonIds() {
        return sonIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withSonIds(String sonIds) {
        this.setSonIds(sonIds);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.son_ids
     *
     * @param sonIds the value for tb_ice_conf.son_ids
     *
     * @mbg.generated
     */
    public void setSonIds(String sonIds) {
        this.sonIds = sonIds == null ? null : sonIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.type
     *
     * @return the value of tb_ice_conf.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withType(Byte type) {
        this.setType(type);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.type
     *
     * @param type the value for tb_ice_conf.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.status
     *
     * @return the value of tb_ice_conf.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.status
     *
     * @param status the value for tb_ice_conf.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.inverse
     *
     * @return the value of tb_ice_conf.inverse
     *
     * @mbg.generated
     */
    public Byte getInverse() {
        return inverse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withInverse(Byte inverse) {
        this.setInverse(inverse);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.inverse
     *
     * @param inverse the value for tb_ice_conf.inverse
     *
     * @mbg.generated
     */
    public void setInverse(Byte inverse) {
        this.inverse = inverse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.conf_name
     *
     * @return the value of tb_ice_conf.conf_name
     *
     * @mbg.generated
     */
    public String getConfName() {
        return confName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withConfName(String confName) {
        this.setConfName(confName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.conf_name
     *
     * @param confName the value for tb_ice_conf.conf_name
     *
     * @mbg.generated
     */
    public void setConfName(String confName) {
        this.confName = confName == null ? null : confName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.conf_field
     *
     * @return the value of tb_ice_conf.conf_field
     *
     * @mbg.generated
     */
    public String getConfField() {
        return confField;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withConfField(String confField) {
        this.setConfField(confField);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.conf_field
     *
     * @param confField the value for tb_ice_conf.conf_field
     *
     * @mbg.generated
     */
    public void setConfField(String confField) {
        this.confField = confField == null ? null : confField.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.forward_id
     *
     * @return the value of tb_ice_conf.forward_id
     *
     * @mbg.generated
     */
    public Long getForwardId() {
        return forwardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withForwardId(Long forwardId) {
        this.setForwardId(forwardId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.forward_id
     *
     * @param forwardId the value for tb_ice_conf.forward_id
     *
     * @mbg.generated
     */
    public void setForwardId(Long forwardId) {
        this.forwardId = forwardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.time_type
     *
     * @return the value of tb_ice_conf.time_type
     *
     * @mbg.generated
     */
    public Byte getTimeType() {
        return timeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withTimeType(Byte timeType) {
        this.setTimeType(timeType);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.time_type
     *
     * @param timeType the value for tb_ice_conf.time_type
     *
     * @mbg.generated
     */
    public void setTimeType(Byte timeType) {
        this.timeType = timeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.start
     *
     * @return the value of tb_ice_conf.start
     *
     * @mbg.generated
     */
    public Date getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withStart(Date start) {
        this.setStart(start);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.start
     *
     * @param start the value for tb_ice_conf.start
     *
     * @mbg.generated
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.end
     *
     * @return the value of tb_ice_conf.end
     *
     * @mbg.generated
     */
    public Date getEnd() {
        return end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withEnd(Date end) {
        this.setEnd(end);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.end
     *
     * @param end the value for tb_ice_conf.end
     *
     * @mbg.generated
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.complex
     *
     * @return the value of tb_ice_conf.complex
     *
     * @mbg.generated
     */
    public Integer getComplex() {
        return complex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withComplex(Integer complex) {
        this.setComplex(complex);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.complex
     *
     * @param complex the value for tb_ice_conf.complex
     *
     * @mbg.generated
     */
    public void setComplex(Integer complex) {
        this.complex = complex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.debug
     *
     * @return the value of tb_ice_conf.debug
     *
     * @mbg.generated
     */
    public Byte getDebug() {
        return debug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withDebug(Byte debug) {
        this.setDebug(debug);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.debug
     *
     * @param debug the value for tb_ice_conf.debug
     *
     * @mbg.generated
     */
    public void setDebug(Byte debug) {
        this.debug = debug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.create_at
     *
     * @return the value of tb_ice_conf.create_at
     *
     * @mbg.generated
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withCreateAt(Date createAt) {
        this.setCreateAt(createAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.create_at
     *
     * @param createAt the value for tb_ice_conf.create_at
     *
     * @mbg.generated
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ice_conf.update_at
     *
     * @return the value of tb_ice_conf.update_at
     *
     * @mbg.generated
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    public IceConf withUpdateAt(Date updateAt) {
        this.setUpdateAt(updateAt);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ice_conf.update_at
     *
     * @param updateAt the value for tb_ice_conf.update_at
     *
     * @mbg.generated
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        IceConf other = (IceConf) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getApp() == null ? other.getApp() == null : this.getApp().equals(other.getApp()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSonIds() == null ? other.getSonIds() == null : this.getSonIds().equals(other.getSonIds()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getInverse() == null ? other.getInverse() == null : this.getInverse().equals(other.getInverse()))
            && (this.getConfName() == null ? other.getConfName() == null : this.getConfName().equals(other.getConfName()))
            && (this.getConfField() == null ? other.getConfField() == null : this.getConfField().equals(other.getConfField()))
            && (this.getForwardId() == null ? other.getForwardId() == null : this.getForwardId().equals(other.getForwardId()))
            && (this.getTimeType() == null ? other.getTimeType() == null : this.getTimeType().equals(other.getTimeType()))
            && (this.getStart() == null ? other.getStart() == null : this.getStart().equals(other.getStart()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getComplex() == null ? other.getComplex() == null : this.getComplex().equals(other.getComplex()))
            && (this.getDebug() == null ? other.getDebug() == null : this.getDebug().equals(other.getDebug()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getUpdateAt() == null ? other.getUpdateAt() == null : this.getUpdateAt().equals(other.getUpdateAt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getApp() == null) ? 0 : getApp().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSonIds() == null) ? 0 : getSonIds().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getInverse() == null) ? 0 : getInverse().hashCode());
        result = prime * result + ((getConfName() == null) ? 0 : getConfName().hashCode());
        result = prime * result + ((getConfField() == null) ? 0 : getConfField().hashCode());
        result = prime * result + ((getForwardId() == null) ? 0 : getForwardId().hashCode());
        result = prime * result + ((getTimeType() == null) ? 0 : getTimeType().hashCode());
        result = prime * result + ((getStart() == null) ? 0 : getStart().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getComplex() == null) ? 0 : getComplex().hashCode());
        result = prime * result + ((getDebug() == null) ? 0 : getDebug().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getUpdateAt() == null) ? 0 : getUpdateAt().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ice_conf
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", app=").append(app);
        sb.append(", name=").append(name);
        sb.append(", sonIds=").append(sonIds);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", inverse=").append(inverse);
        sb.append(", confName=").append(confName);
        sb.append(", confField=").append(confField);
        sb.append(", forwardId=").append(forwardId);
        sb.append(", timeType=").append(timeType);
        sb.append(", start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", complex=").append(complex);
        sb.append(", debug=").append(debug);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append("]");
        return sb.toString();
    }
}