package com.xstudio.discuzx.ultrax.model;

import com.xstudio.core.BaseModelObject;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Database Table Remarks:
 *   管理组表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pre_common_admingroup
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommonAdmingroup extends BaseModelObject<Short> implements Serializable {
    /**
     * Database Column Remarks:
     *   所属管理员分组ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.admingid
     *
     * @mbg.generated
     */
    private Short admingid;

    /**
     * Database Column Remarks:
     *   是否允许编辑帖子
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.alloweditpost
     *
     * @mbg.generated
     */
    private Boolean alloweditpost;

    /**
     * Database Column Remarks:
     *   是否允许编辑投票
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.alloweditpoll
     *
     * @mbg.generated
     */
    private Boolean alloweditpoll;

    /**
     * Database Column Remarks:
     *   是否允许置顶主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowstickthread
     *
     * @mbg.generated
     */
    private Boolean allowstickthread;

    /**
     * Database Column Remarks:
     *   是否允许审核帖子
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmodpost
     *
     * @mbg.generated
     */
    private Boolean allowmodpost;

    /**
     * Database Column Remarks:
     *   是否允许删除帖子
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowdelpost
     *
     * @mbg.generated
     */
    private Boolean allowdelpost;

    /**
     * Database Column Remarks:
     *   是否允许批量删帖
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmassprune
     *
     * @mbg.generated
     */
    private Boolean allowmassprune;

    /**
     * Database Column Remarks:
     *   是否允许强制退款
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowrefund
     *
     * @mbg.generated
     */
    private Boolean allowrefund;

    /**
     * Database Column Remarks:
     *   兼容性字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowcensorword
     *
     * @mbg.generated
     */
    private Boolean allowcensorword;

    /**
     * Database Column Remarks:
     *   是否允许查看IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowviewip
     *
     * @mbg.generated
     */
    private Boolean allowviewip;

    /**
     * Database Column Remarks:
     *   是否允许禁止IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowbanip
     *
     * @mbg.generated
     */
    private Boolean allowbanip;

    /**
     * Database Column Remarks:
     *   是否允许编辑用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowedituser
     *
     * @mbg.generated
     */
    private Boolean allowedituser;

    /**
     * Database Column Remarks:
     *   是否允许审核用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmoduser
     *
     * @mbg.generated
     */
    private Boolean allowmoduser;

    /**
     * Database Column Remarks:
     *   是否允许禁止用户发言
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowbanuser
     *
     * @mbg.generated
     */
    private Boolean allowbanuser;

    /**
     * Database Column Remarks:
     *   是否允许禁止用户访问
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowbanvisituser
     *
     * @mbg.generated
     */
    private Boolean allowbanvisituser;

    /**
     * Database Column Remarks:
     *   是否允许发布站点公告
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowpostannounce
     *
     * @mbg.generated
     */
    private Boolean allowpostannounce;

    /**
     * Database Column Remarks:
     *   是否允许查看管理日志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowviewlog
     *
     * @mbg.generated
     */
    private Boolean allowviewlog;

    /**
     * Database Column Remarks:
     *   是否允许屏蔽帖子
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowbanpost
     *
     * @mbg.generated
     */
    private Boolean allowbanpost;

    /**
     * Database Column Remarks:
     *   兼容性字段
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.supe_allowpushthread
     *
     * @mbg.generated
     */
    private Boolean supeAllowpushthread;

    /**
     * Database Column Remarks:
     *   是否允许高亮主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowhighlightthread
     *
     * @mbg.generated
     */
    private Boolean allowhighlightthread;

    /**
     * Database Column Remarks:
     *   是否允许直播帖
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowlivethread
     *
     * @mbg.generated
     */
    private Boolean allowlivethread;

    /**
     * Database Column Remarks:
     *   是否允许精华主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowdigestthread
     *
     * @mbg.generated
     */
    private Boolean allowdigestthread;

    /**
     * Database Column Remarks:
     *   是否允许推荐主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowrecommendthread
     *
     * @mbg.generated
     */
    private Boolean allowrecommendthread;

    /**
     * Database Column Remarks:
     *   是否允许提升主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowbumpthread
     *
     * @mbg.generated
     */
    private Boolean allowbumpthread;

    /**
     * Database Column Remarks:
     *   是否允许关闭主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowclosethread
     *
     * @mbg.generated
     */
    private Boolean allowclosethread;

    /**
     * Database Column Remarks:
     *   是否允许移动主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmovethread
     *
     * @mbg.generated
     */
    private Boolean allowmovethread;

    /**
     * Database Column Remarks:
     *   是否允许编辑主题分类
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowedittypethread
     *
     * @mbg.generated
     */
    private Boolean allowedittypethread;

    /**
     * Database Column Remarks:
     *   是否允许添加主题图章
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowstampthread
     *
     * @mbg.generated
     */
    private Boolean allowstampthread;

    /**
     * Database Column Remarks:
     *   是否允许添加主题图标
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowstamplist
     *
     * @mbg.generated
     */
    private Boolean allowstamplist;

    /**
     * Database Column Remarks:
     *   是否允许复制主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowcopythread
     *
     * @mbg.generated
     */
    private Boolean allowcopythread;

    /**
     * Database Column Remarks:
     *   是否允许合并主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmergethread
     *
     * @mbg.generated
     */
    private Boolean allowmergethread;

    /**
     * Database Column Remarks:
     *   是否允许分割主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowsplitthread
     *
     * @mbg.generated
     */
    private Boolean allowsplitthread;

    /**
     * Database Column Remarks:
     *   是否允许修复主题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowrepairthread
     *
     * @mbg.generated
     */
    private Boolean allowrepairthread;

    /**
     * Database Column Remarks:
     *   是否允许警告帖子
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowwarnpost
     *
     * @mbg.generated
     */
    private Boolean allowwarnpost;

    /**
     * Database Column Remarks:
     *   是否允许查看用户报告
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowviewreport
     *
     * @mbg.generated
     */
    private Boolean allowviewreport;

    /**
     * Database Column Remarks:
     *   是否允许编辑版块
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.alloweditforum
     *
     * @mbg.generated
     */
    private Boolean alloweditforum;

    /**
     * Database Column Remarks:
     *   是否允许移除悬赏
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowremovereward
     *
     * @mbg.generated
     */
    private Boolean allowremovereward;

    /**
     * Database Column Remarks:
     *   是否允许编辑商品
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowedittrade
     *
     * @mbg.generated
     */
    private Boolean allowedittrade;

    /**
     * Database Column Remarks:
     *   是否允许管理活动报名者
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.alloweditactivity
     *
     * @mbg.generated
     */
    private Boolean alloweditactivity;

    /**
     * Database Column Remarks:
     *   是否允许置顶回帖
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowstickreply
     *
     * @mbg.generated
     */
    private Boolean allowstickreply;

    /**
     * Database Column Remarks:
     *   是否允许管理所有文章
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmanagearticle
     *
     * @mbg.generated
     */
    private Boolean allowmanagearticle;

    /**
     * Database Column Remarks:
     *   是否允许创建专题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowaddtopic
     *
     * @mbg.generated
     */
    private Boolean allowaddtopic;

    /**
     * Database Column Remarks:
     *   是否允许管理专题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmanagetopic
     *
     * @mbg.generated
     */
    private Boolean allowmanagetopic;

    /**
     * Database Column Remarks:
     *   是否允许DIY
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowdiy
     *
     * @mbg.generated
     */
    private Boolean allowdiy;

    /**
     * Database Column Remarks:
     *   是否允许删除回收站的帖子
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowclearrecycle
     *
     * @mbg.generated
     */
    private Boolean allowclearrecycle;

    /**
     * Database Column Remarks:
     *   是否允许管理标签
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmanagetag
     *
     * @mbg.generated
     */
    private Boolean allowmanagetag;

    /**
     * Database Column Remarks:
     *   是否允许管理用户标签
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.alloweditusertag
     *
     * @mbg.generated
     */
    private Boolean alloweditusertag;

    /**
     * Database Column Remarks:
     *   是否允许管理动态(feed)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managefeed
     *
     * @mbg.generated
     */
    private Boolean managefeed;

    /**
     * Database Column Remarks:
     *   是否允许管理记录
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managedoing
     *
     * @mbg.generated
     */
    private Boolean managedoing;

    /**
     * Database Column Remarks:
     *   是否允许管理分享
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.manageshare
     *
     * @mbg.generated
     */
    private Boolean manageshare;

    /**
     * Database Column Remarks:
     *   是否允许管理日志
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.manageblog
     *
     * @mbg.generated
     */
    private Boolean manageblog;

    /**
     * Database Column Remarks:
     *   是否允许管理相册
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managealbum
     *
     * @mbg.generated
     */
    private Boolean managealbum;

    /**
     * Database Column Remarks:
     *   是否允许管理评论
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managecomment
     *
     * @mbg.generated
     */
    private Boolean managecomment;

    /**
     * Database Column Remarks:
     *   是否允许管理道具记录
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managemagiclog
     *
     * @mbg.generated
     */
    private Boolean managemagiclog;

    /**
     * Database Column Remarks:
     *   是否允许管理举报
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managereport
     *
     * @mbg.generated
     */
    private Boolean managereport;

    /**
     * Database Column Remarks:
     *   是否允许管理推荐成员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managehotuser
     *
     * @mbg.generated
     */
    private Boolean managehotuser;

    /**
     * Database Column Remarks:
     *   是否允许管理推荐好友
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managedefaultuser
     *
     * @mbg.generated
     */
    private Boolean managedefaultuser;

    /**
     * Database Column Remarks:
     *   是否允许管理视频认证
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managevideophoto
     *
     * @mbg.generated
     */
    private Boolean managevideophoto;

    /**
     * Database Column Remarks:
     *   是否允许管理道具
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.managemagic
     *
     * @mbg.generated
     */
    private Boolean managemagic;

    /**
     * Database Column Remarks:
     *   是否允许管理表态动作
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.manageclick
     *
     * @mbg.generated
     */
    private Boolean manageclick;

    /**
     * Database Column Remarks:
     *   是否允许管理淘专辑
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmanagecollection
     *
     * @mbg.generated
     */
    private Boolean allowmanagecollection;

    /**
     * Database Column Remarks:
     *   允许生成门户静态页面
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_admingroup.allowmakehtml
     *
     * @mbg.generated
     */
    private Boolean allowmakehtml;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_common_admingroup
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void assignKeyValue(Short key) {
        this.admingid = key;
    }

    @Override
    public Short valueOfKey() {
        return admingid;
    }
}