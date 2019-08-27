package com.accp.common.dao;

import com.accp.common.pojo.Employee;

public interface IEmployeeDAO {
    int deleteByPrimaryKey(String empid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String empid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}