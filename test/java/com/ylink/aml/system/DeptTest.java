package com.ylink.aml.system;

import com.ylink.aml.base.BaseJunit;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 字典服务测试
 *
 * @author lida
 * @Date 2019-04-27 17:05
 */
public class DeptTest extends BaseJunit {

   /* @Resource
    DeptMapper deptMapper;

    @Test
    public void addDeptTest() {
        Dept dept = new Dept();
        dept.setFullName("测试fullname");
        dept.setSort(5);
        dept.setPid(1L);
        dept.setSimpleName("测试");
        dept.setDescription("测试tips");
        dept.setVersion(1);
        Integer insert = deptMapper.insert(dept);
        assertEquals(insert, new Integer(1));
    }

    @Test
    public void updateTest() {
        Dept dept = this.deptMapper.selectById(24);
        dept.setDescription("哈哈");
        deptMapper.updateById(dept);
    }

    @Test
    public void deleteTest() {
        Dept dept = this.deptMapper.selectById(24);
        Integer integer = deptMapper.deleteById(dept);
        assertTrue(integer > 0);
    }*/
}
