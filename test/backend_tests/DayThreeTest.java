package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.config.DatabaseConnectionManager;

public class DayThreeTest {

    @Test
    void testGetDatabaseConnection_Day3() throws Exception {

        Connection connection = DatabaseConnectionManager.getConnection();

        assertNotNull(connection);

        connection.close();
    }
}