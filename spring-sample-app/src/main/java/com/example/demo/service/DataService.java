package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class DataService {

    private final JdbcTemplate jdbcTemplate;

    public DataService(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getTables() {
        return jdbcTemplate.queryForList("SHOW TABLES", String.class);
    }
}
