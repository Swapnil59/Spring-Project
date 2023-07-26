package com.rt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.entity.Employee;
@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate template;
	
	public boolean register(Employee e) {
		try {
			Object[] args = { e.getFname(), e.getLname(), e.getEmail(),e.getPhone(), e.getCity(), e.getState(), e.getAddress() };
			int a = template.update("insert into register_form(`fname`,`lname`,`email`,`phone`,`city`,`state`,`address`) values(?,?,?,?,?,?,?)", args);
			System.out.println(a);
			

			if (a == 1) {
				return true;
			} 
			
		} catch (Exception e2) {
			System.out.println(e2);
		}
		return false;
	}

	public boolean update(Employee e) {
		try {
			Object[] args = { e.getFname(), e.getLname(), e.getEmail(),e.getPhone(), e.getCity(), e.getState(), e.getAddress() ,e.getId()};
			int a = template.update(
					"update register_form set fname = ?, lname = ? ,email=?, phone = ?, city = ?, state = ?, address = ? where id = ?",
					args);
			

			if (a == 1) {
				return true;
			} 
			
		} catch (Exception e2) {
			System.out.println(e2);
		}
		return false;
		
	}

	public boolean delete(int id) {
		try{
			Object[] args ={id};
			int data =template.update("delete from register_form where id=?",args);
			if(data==1){
				return true;
			}
			
		}catch(Exception e2){
			System.out.println(e2);
		}
		return false;
	}

	public Employee select(int id) {
		Employee e = null;
		try {

			Object[] args = { id };
			 e = template.queryForObject("select * from register_form where id = ?", args,
					new RowMapper<Employee>() {

						public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
							return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
									rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8));
						}
					});

		} catch (Exception e2) {

		}
		return e;
	}

	public List<Employee> selectall() {
		List<Employee> list = null;
		try {

			 list = template.query("select * from register_form",
					new RowMapper<Employee>() {

				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8));
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
