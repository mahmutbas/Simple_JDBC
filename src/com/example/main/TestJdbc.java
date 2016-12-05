package com.example.main;

import java.sql.SQLException;

import com.example.jdbc.JDBCConnection;

public class TestJdbc {

	public static void main(String[] args) {
		try {
			JDBCConnection.insertRecordIntoTable();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
