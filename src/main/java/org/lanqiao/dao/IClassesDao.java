package org.lanqiao.dao;

import org.lanqiao.bean.Classes;

import java.util.List;

/**
 * Created by ssc on 2017/9/4.
 */
public interface IClassesDao {
    /**
     * 1对1映射
     * @return
     */
    List<Classes> getAllClass();

    /**
     * 根据班级id查询班级学生信息
     * @param id
     * @return
     */
    List<Classes> getClassInfoById(int id);
}
