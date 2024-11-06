package com.sdtbu.demo.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataInsertion {
    public static void main(String[] args) {
        String originalData = "password";
        String encryptedData = MD5Utils.code(originalData);

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO User (encrypted_data) VALUES (?)")) {

            pstmt.setString(1, encryptedData);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("数据插入成功");
            } else {
                System.out.println("数据插入失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
