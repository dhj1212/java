package com.hpi.modules.userpw.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 弱密码字典
 * </p>
 *
 * @author dhj
 * @since 2021-04-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SYSPWDICT")
public class Syspwdict extends Model<Syspwdict> {

    private static final long serialVersionUID = 1L;

    /**
     * DICTID
     */
    @TableId("DICTID")
    private String dictid;

    @TableField("DICTTEXT")
    private String dicttext;


    @Override
    protected Serializable pkVal() {
        return this.dictid;
    }

}
