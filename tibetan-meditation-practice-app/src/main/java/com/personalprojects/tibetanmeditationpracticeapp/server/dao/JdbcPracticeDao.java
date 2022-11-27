package com.personalprojects.tibetanmeditationpracticeapp.server.dao;

import com.personalprojects.tibetanmeditationpracticeapp.server.models.Practice;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcPracticeDao implements PracticeDao{
    private final JdbcTemplate jdbcTemplate;

public JdbcPracticeDao(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
    //TODO will I need a userDao to filter out practices user doesn't have access to?
}

    @Override
    public List<Practice> listByLineage(int lineageId) {
        List<Practice> practices = new ArrayList<>();
        String sql = "select practice_name, instructions, support_img, practice_audio" +
                "from practice join practice_lineage using (practice_id)" +
                "where lineage_id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, lineageId);

        while(result.next()) {
        //mapping method
            practices.add(mapRowToPractice(result));
        }

        return practices;
    }

    private Practice mapRowToPractice(SqlRowSet result) {
        Practice practice = new Practice();
        practice.setPracticeName(result.getString("practice_name"));
        practice.setInstructions(result.getString("instructions"));
        practice.setPrayer(result.getString("prayer"));

        return practice;
    //todo how to map images and audios? send the file or point to a url src?
    }
}
