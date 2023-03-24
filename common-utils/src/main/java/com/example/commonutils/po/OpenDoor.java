package com.example.commonutils.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName open_door
 */
@TableName(value ="open_door")
@Data
public class OpenDoor implements Serializable {
    /**
     * 开门ID
     */
    private String openId;

    /**
     * 设备ID
     */
    private String machineId;

    /**
     * 设备编码
     */
    private String machineCode;

    /**
     * 开门方式，1000 人脸开门 2000 钥匙开门
     */
    private String openTypeCd;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 是否带帽 0没有带 1 带帽
     */
    private String hat;

    /**
     * 模板人脸
     */
    private String modelFace;

    /**
     * 抓拍图片
     */
    private String face;

    /**
     * 相似度
     */
    private String similarity;

    /**
     * 欠费金额
     */
    private String amountOwed;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 小区ID
     */
    private String communityId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 开门ID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 开门ID
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 设备ID
     */
    public String getMachineId() {
        return machineId;
    }

    /**
     * 设备ID
     */
    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    /**
     * 设备编码
     */
    public String getMachineCode() {
        return machineCode;
    }

    /**
     * 设备编码
     */
    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    /**
     * 开门方式，1000 人脸开门 2000 钥匙开门
     */
    public String getOpenTypeCd() {
        return openTypeCd;
    }

    /**
     * 开门方式，1000 人脸开门 2000 钥匙开门
     */
    public void setOpenTypeCd(String openTypeCd) {
        this.openTypeCd = openTypeCd;
    }

    /**
     * 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 是否带帽 0没有带 1 带帽
     */
    public String getHat() {
        return hat;
    }

    /**
     * 是否带帽 0没有带 1 带帽
     */
    public void setHat(String hat) {
        this.hat = hat;
    }

    /**
     * 模板人脸
     */
    public String getModelFace() {
        return modelFace;
    }

    /**
     * 模板人脸
     */
    public void setModelFace(String modelFace) {
        this.modelFace = modelFace;
    }

    /**
     * 抓拍图片
     */
    public String getFace() {
        return face;
    }

    /**
     * 抓拍图片
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * 相似度
     */
    public String getSimilarity() {
        return similarity;
    }

    /**
     * 相似度
     */
    public void setSimilarity(String similarity) {
        this.similarity = similarity;
    }

    /**
     * 欠费金额
     */
    public String getAmountOwed() {
        return amountOwed;
    }

    /**
     * 欠费金额
     */
    public void setAmountOwed(String amountOwed) {
        this.amountOwed = amountOwed;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 小区ID
     */
    public String getCommunityId() {
        return communityId;
    }

    /**
     * 小区ID
     */
    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
}