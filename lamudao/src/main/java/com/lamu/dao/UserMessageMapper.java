package com.lamu.dao;

import com.lamu.entity.UserMessage;
import com.lamu.entity.UserMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int countByExample(UserMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int deleteByExample(UserMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int insert(UserMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int insertSelective(UserMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    List<UserMessage> selectByExample(UserMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    UserMessage selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserMessage record);
}