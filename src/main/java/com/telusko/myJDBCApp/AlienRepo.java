package com.telusko.myJDBCApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {
    @Autowired
    private JdbcTemplate template;

    public void insert(Aliens a){
        String sql = "insert into aliens (id, name, tech) values (?,?,?);";
        int rowAffected = template.update(sql,a.getId(),a.getName(),a.getTech());
        System.out.println(rowAffected+" row/s affected");
    }

    List<Aliens> readyToReturn = new ArrayList<>();
    public List<Aliens> select(){
        String sql = "select * from aliens";

        RowMapper<Aliens> mapper = (rs, rowNum) -> {
            Aliens a = new Aliens();
            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setTech(rs.getString(3));
            return a;
        };

        readyToReturn = template.query(sql,mapper);
        return readyToReturn;
    }


}
