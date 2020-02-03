package com.xstudio.discuzx.ultrax.mapper;

import com.xstudio.discuzx.ultrax.model.CommonSetting;
import com.xstudio.spring.mybatis.pagehelper.IMybatisPageHelperDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface CommonSettingMapper extends IMybatisPageHelperDao<CommonSetting, String> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_common_setting
     *
     * @mbg.generated
     */
    @Override
    List<CommonSetting> selectByExampleWithBLOBs(@Param("example") CommonSetting record, @Param("pageBounds") RowBounds pageBounds);
}