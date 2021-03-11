package com.hpi.modules.log.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * 日志表
 * </p>
 *
 * @author dhj
 * @since 2020-09-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SYSLOG")
public class Syslog extends Model<Syslog> {

    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    @TableId(value = "LOGID")
    private String logid;

    /**
     * 类型（1：登陆；2：注销；3：错误；4：提示警告；5:数据插入；6：数据更新；7数据删除;8：上传；9：其他）
     */
    @TableField("LOGTYPE")
    private String logtype;

    /**
     * 日志内容
     */
    @TableField("CONTENT")
    private String content;

    /**
     * 操作人ID
     */
    @TableField("OPERMANID")
    private String opermanid;

    /**
     * 操作人姓名
     */
    @TableField("OPERMANNAME")
    private String opermanname;

    /**
     * 日期
     */
    @TableField("LOGDATE")
    private Date logdate;

    /**
     * IP地址
     */
    @TableField("IP")
    private String ip;

    /**
     * 浏览器
     */
    @TableField("BROWSER")
    private String browser;

    /**
     * 所属类名
     */
    @TableField("CLASSNAME")
    private String classname;

    /**
     * 所属方法
     */
    @TableField("MOTHODNAME")
    private String mothodname;

    /**
     * 备注
     */
    @TableField("REMARKS")
    private String remarks;


    @Override
    protected Serializable pkVal() {
        return this.logid;
    }

}
