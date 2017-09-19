package com.user.model;

import com.user.model.LogisticsAssignRules;
import com.user.model.LogisticsAssignRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository(value = "logisticsAssignRulesMapper")
public interface LogisticsAssignRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ilar
     *
     * @mbg.generated Tue Sep 19 14:31:55 CST 2017
     */
    long countByExample(LogisticsAssignRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ilar
     *
     * @mbg.generated Tue Sep 19 14:31:55 CST 2017
     */
    int deleteByExample(LogisticsAssignRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ilar
     *
     * @mbg.generated Tue Sep 19 14:31:55 CST 2017
     */
    int insert(LogisticsAssignRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ilar
     *
     * @mbg.generated Tue Sep 19 14:31:55 CST 2017
     */
    int insertSelective(LogisticsAssignRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ilar
     *
     * @mbg.generated Tue Sep 19 14:31:55 CST 2017
     */
    List<LogisticsAssignRules> selectByExample(LogisticsAssignRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ilar
     *
     * @mbg.generated Tue Sep 19 14:31:55 CST 2017
     */
    int updateByExampleSelective(@Param("record") LogisticsAssignRules record, @Param("example") LogisticsAssignRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ilar
     *
     * @mbg.generated Tue Sep 19 14:31:55 CST 2017
     */
    int updateByExample(@Param("record") LogisticsAssignRules record, @Param("example") LogisticsAssignRulesExample example);
}