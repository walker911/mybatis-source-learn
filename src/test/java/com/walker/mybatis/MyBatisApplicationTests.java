package com.walker.mybatis;

import com.walker.mybatis.mapper.BigDataTestMapper;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/1/17
 */
@SpringBootTest
public class MyBatisApplicationTests {

    @Autowired
    private BigDataTestMapper bgMapper;

    @Test
    public void findByPage() {
        bgMapper.findByPage(10, new RowBounds(20, 10));
    }
}
