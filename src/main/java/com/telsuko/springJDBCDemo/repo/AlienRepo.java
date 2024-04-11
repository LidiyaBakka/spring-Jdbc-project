package com.telsuko.springJDBCDemo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.telsuko.springJDBCDemo.model.Alien;
@Repository

public class AlienRepo {
	@Autowired
	private JdbcTemplate template;
	
	
	
	public void save(Alien alien)
	{
		String sql="insert into alien1(id,name,tech) values(?,?,?)";
		
		 int rows=template.update(sql,alien.getId(),alien.getName(),alien.getTech());
		System.out.println("row Affected: "+rows);
	}

	public List<Alien> findall()
	
	{
		String sql="select * from alien1";
		RowMapper mapper =new RowMapper<Alien>()
				{
				

					@Override
					public Alien mapRow(ResultSet rs, int rowNum) throws SQLException {
						// TODO Auto-generated method stub
						Alien a =new Alien();
						a.setId(rs.getInt(1));
						a.setName(rs.getString(2));
						a.setTech(rs.getString(3));
						return a;
					}

					
				};
				
		 List<Alien> aliens=template.query(sql, mapper);
		
		return  aliens;
		
				
	
				
	}

	}
	
	
		
		
		
		
		
				

	
	


