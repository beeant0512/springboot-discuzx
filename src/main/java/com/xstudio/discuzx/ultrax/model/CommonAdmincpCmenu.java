package com.xstudio.discuzx.ultrax.model;

import com.xstudio.tool.utils.BaseModelObject;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Database Table Remarks:
 *   后台菜单收藏表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pre_common_admincp_cmenu
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommonAdmincpCmenu extends BaseModelObject<Short> implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.id
     *
     * @mbg.generated
     */
    private Short id;

    /**
     * Database Column Remarks:
     *   菜单名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * Database Column Remarks:
     *   菜单地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     * Database Column Remarks:
     *   菜单类型,备用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.sort
     *
     * @mbg.generated
     */
    private Boolean sort;

    /**
     * Database Column Remarks:
     *   显示顺序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.displayorder
     *
     * @mbg.generated
     */
    private Byte displayorder;

    /**
     * Database Column Remarks:
     *   点击数,备用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.clicks
     *
     * @mbg.generated
     */
    private Short clicks;

    /**
     * Database Column Remarks:
     *   添加用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     * Database Column Remarks:
     *   添加时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admincp_cmenu.dateline
     *
     * @mbg.generated
     */
    private Integer dateline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_common_admincp_cmenu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Short valueOfKey() {
        return id;
    }

    @Override
    public void assignKeyValue(Short value) {
        this.id = value;
    }
}