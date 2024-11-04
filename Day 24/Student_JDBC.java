package com.company;

import javax.sql.RowSet;
import java.sql.*;



public class Student_JDBC {

    private Object query;
    private Object Connection;
    private RowSet st;




    //        driver load
//        conn establish
//        statement create
//        execute query
    public void createDatabase () {

            try {
                String url = "jdbc:mysql://localhost:3306/codingwallah";
                String userName = "root";
                String password = "mbhatia@8232";

                Connection conn = DriverManager.getConnection(url, userName, password);
                Statement stm = conn.createStatement();

                String query = "create database codingwallah ";
                stm.execute(query);
                System.out.println(" Database Created  successfully");
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    public void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            //String db = "codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "CREATE TABLE Student_JDBC ("
                    + "sid INT(3), "
                    + "sname VARCHAR(200), "
                    + "semail VARCHAR(200), "
                    + "PRIMARY KEY(sid)"
                    + ");";

            stm.execute(query);
            System.out.println("Table created successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void createData() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
           // String db = "codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
           String query = "INSERT INTO Student_JDBC (sid, sname, semail) VALUES ( ?,?,?) ";

           PreparedStatement pstm = conn.prepareStatement ( query);
//            pstm.setInt(1, 10);
            pstm.setInt(1,11);
//            pstm.setString(2,"Mohit");
            pstm.setString(2,"boom");
//            pstm.setString(3,"mohitbhatia659@gmail.com");
            pstm.setString(3, "boom@gmail.com");
            pstm.executeUpdate();

            System.out.println("data inserted successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readData() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            // String db = "codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            String query = "Select * from Student_JDBC ";

            Statement stm = conn.createStatement ();
           ResultSet rs = stm.executeQuery(query);
           while (rs.next()){
               System.out.println("id = "+rs.getInt(1));
               System.out.println("name= "+rs.getString(2));
               System.out.println("email = "+rs.getString(3));
           }

            System.out.println("read successfully" );
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void updateData() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            // String db = "codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            String query = "UPDATE  Student_JDBC set sid = ? where sname = ? ";

            PreparedStatement pstm = conn.prepareStatement ( query);
            pstm.setInt(1,12);
            pstm.setString(2,"Boom");
            pstm.executeUpdate();

            System.out.println("data updated successfully");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteData() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            // String db = "codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            String query = " DELETE FROM Student_JDBC WHERE sid = ? ";

            PreparedStatement pstm = conn.prepareStatement ( query);
            pstm.setInt(1,10);
           int rowsAffected=  pstm.executeUpdate();

           if(rowsAffected>0) {
               System.out.println("data deleted  successfully");
           }else {
               System.out.println("No data found with the given sid.");
           }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void selectData() {
        String url = "jdbc:mysql://localhost:3306/codingwallah"; // Database URL
        String user = "root"; // Database username
        String password = "mbhatia@8232"; // Database password

        // Uncomment the following lines if the table does not exist

//        String Query = "CREATE TABLE Student ("
//                + "sid INT PRIMARY KEY, "
//                + "sname VARCHAR(100), "
//                + "semail VARCHAR(100), "
//                + "enrollment_date DATE, "
//                + "GPA DECIMAL(3, 2))";


        // SQL query to select all students
        String query = "SELECT * FROM Student_JDBC";

        try (Connection conn = DriverManager.getConnection(url, user, password); // Establish connection
             PreparedStatement pstm = conn.prepareStatement(query); // Create PreparedStatement
             ResultSet rs = pstm.executeQuery()) { // Execute query and get ResultSet

            // Process the ResultSet
            while (rs.next()) {
                int sid = rs.getInt("sid"); // Retrieve sid
                String sname = rs.getString("sname"); // Retrieve sname
                String semail = rs.getString("semail"); // Retrieve semail
              //  Date enrollmentDate = rs.getDate("enrollment_date"); // Retrieve enrollment date
             //   BigDecimal gpa = rs.getBigDecimal("GPA"); // Retrieve GPA

                // Print student details
                System.out.println("Student ID: " + sid);
                System.out.println("Name: " + sname);
                System.out.println("Email: " + semail);
              //  System.out.println("Enrollment Date: " + enrollmentDate);
               // System.out.println("GPA: " + gpa);
                System.out.println("---------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print exception stack trace
        }

    }

    public void transactions() throws SQLException {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            // String db = "codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            conn = DriverManager.getConnection(url, userName, password);
            conn.setAutoCommit(false); // start transaction

            String query = "INSERT INTO Student_JDBC (sid, sname, semail) VALUES ( ?,?,?) ";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1,15);
            pstm.setString(2, "Alice");
            pstm.setString(3, "alice@gmail.com");
            pstm.executeUpdate();

//            simulate an error
//            int result = 1/0;

            pstm.setInt(1,16);
            pstm.setString(2, "Bob");
            pstm.setString(3, "bob@gmail.com");
            pstm.executeUpdate();

            conn.commit(); // commit transaction
            System.out.println("Transaction committed successfully");
            conn.close();
        } catch (SQLException e) {
            conn.rollback();  // Rollback transaction in case of error
            e.printStackTrace();
            System.out.println("Transaction rolled back.");
        }
    }

    public void batchprocessing() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            // String db = "codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

           Connection conn = DriverManager.getConnection(url, userName, password);
           conn.setAutoCommit(false);

            String query = "INSERT INTO Student_JDBC ( sid,sname, semail) VALUES (?,?,?) ";

            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1,9);
            pstm.setString(2, "user1");
            pstm.setString(3, "user1@gmail.com");
            pstm.addBatch();

            pstm.setInt(1,0);
            pstm.setString(2, "user2");
            pstm.setString(3, "user2@gmail.com");
            pstm.addBatch();

            pstm.setInt(1,7);
            pstm.setString(2, "user3");
            pstm.setString(3, "user3@gmail.com");
            pstm.addBatch();

            int[] updateCounts = pstm.executeBatch();
            conn.commit();
            System.out.println("Batch processed successfully. updates:" + updateCounts.length);

        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    public void innerjoin() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "SELECT users.name, orders.order_date " +
                    "FROM users " +
                    "INNER JOIN orders ON users.id = orders.user_id";

            ResultSet resultSet = stm.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String orderDate = resultSet.getString("order_date");
                System.out.println(name+ "place an order on"+orderDate);
            }
//            close resources
            resultSet.close();
            stm.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void subquery() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "SELECT name FROM users WHERE id IN (SELECT user_id FROM orders WHERE total > 100)";

            ResultSet resultSet = stm.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println(name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void storedprocedure() {
        try {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            CallableStatement callablestatement = conn.prepareCall("{CALL GETUserById(?)}");

            String query = "SELECT name FROM users WHERE id IN (SELECT user_id FROM orders WHERE total > 100)";

            callablestatement.setInt(1,1);
            ResultSet resultSet = callablestatement.executeQuery();


            while (resultSet.next()) {
                System.out.println("User ID: " + resultSet.getInt("id"));
                System.out.println("User Name: " + resultSet.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void triggers() {

    }

    public void explain() {
            String url = "jdbc:mysql://localhost:3306/codingwallah";
            String userName = "root";
            String password = "mbhatia@8232";

            try (Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement()) {

            String query = " EXPLAIN SELECT * FROM users WHERE name = 'Mohit' ";
            ResultSet resultSet = stm.executeQuery(query);


            while (resultSet.next()) {
                System.out.println("Table:" + resultSet.getString("table"));
                System.out.println("Type: " + resultSet.getString("type"));
                System.out.println("Possible Keys: " + resultSet.getString("possible_keys"));
                System.out.println("Key Used: " + resultSet.getString("key"));
            }
        } catch (Exception e) {
            e.printStackTrace();
          }
       }



    }













