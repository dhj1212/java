package com.hpi.modules.user.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dhj
 * @since 2020-09-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SYSUSER")
public class Sysuser extends Model<Sysuser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("USERID")
    private String userid;

    /**
     * 组织机构ID
     */
    @TableField("ORGID")
    private String orgid;

    /**
     * 登陆ID
     */
    @TableField("LOGINID")
    private String loginid;

    /**
     * 用户名称
     */
    @TableField("USERNAME")
    private String username;

    /**
     * 登陆密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * md5密盐
     */
    @TableField("SALT")
    private String salt;

    /**
     * 序号
     */
    @TableField("SEQ")
    private BigDecimal seq;

    /**
     * 用户编号
     */
    @TableField("USERNO")
    private String userno;

    /**
     * 用户类型
     */
    @TableField("USERTYPE")
    private String usertype;

    /**
     * 性别(1:男；0：女)
     */
    @TableField("SEX")
    private String sex;

    /**
     * 身份证号
     */
    @TableField("IDNO")
    private String idno;

    /**
     * 手机号码
     */
    @TableField("PHONE")
    private String phone;

    /**
     * E_MAIL
     */
    @TableField("E_MAIL")
    private String eMail;

    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;

    /**
     * 创建日期
     */
    @TableField("CREATEDATE")
    private Date createdate;

    /**
     * 出生日期
     */
    @TableField("BIRTHDAY")
    private Date birthday;

    /**
     * 微信号
     */
    @TableField("WINXINID")
    private String winxinid;

    /**
     * 岗位职务
     */
    @TableField("POST")
    private String post;

    /**
     * 上级领导
     */
    @TableField("SUPLEADERS")
    private String supleaders;

    /**
     * 住址
     */
    @TableField("ADDRESS")
    private String address;

    /**
     * 电话
     */
    @TableField("TEL")
    private String tel;

    /**
     * 提示问题
     */
    @TableField("PWQUESTION")
    private String pwquestion;

    /**
     * 提示问题答案
     */
    @TableField("PWANSWER")
    private String pwanswer;

    /**
     * 传真
     */
    @TableField("FAX")
    private String fax;

    /**
     * 登陆次数
     */
    @TableField("LOGINSUM")
    private BigDecimal loginsum;

    /**
     * 最后登录IP
     */
    @TableField("IP")
    private String ip;

    /**
     * 最近登陆日期
     */
    @TableField("LATEDATE")
    private Date latedate;

    /**
     * 房间号码
     */
    @TableField("ROOMNO")
    private String roomno;

    /**
     * 置顶（-1：不置顶）
     */
    @TableField("TOPNO")
    private BigDecimal topno;


    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

}
