package com.example.mp.demo.mapper.ck;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Please enter the class name.
 *
 * @author zohar
 * @version 1.0
 * 2021-12-02 00:50
 */
@Slf4j
@SpringBootTest
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void maxId() {
        String maxId = assertDoesNotThrow(() -> employeeMapper.maxId());
        log.info("maxId||max_id={}", maxId);
    }
}