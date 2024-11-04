package com.company;

import java.sql.SQLException;


public class cwh_JDBC {
    public static void main(String[] args) throws SQLException {
        Student_JDBC st = new Student_JDBC();

     //   HikariConfig config = new HikariConfig(); // -> for Connection Pooling (HikariCP)
//       *   i have to create a class of hikariconfig this and then make a object but
//         * i take st instead of config because student class is already created
       // HirakiConfig_JDBC config = new HirakiConfig_JDBC();


        //   st.createDatabase();
//        st.createTable ();
//         st.createData();
//        st.readData();
//        st.updateData();
//        st.deleteData();
//        st.selectData();
//        st.transactions ();

//        st.batchprocessing ();
//        Prepared Statements: Used for executing parameterized queries (as seen above in many examples), which help prevent SQL injection and improve performance.
//  Statements: Regular SQL execution, mainly for simple queries or dynamic SQL.

//        st.innerjoin ();
//        An INNER JOIN returns records that have matching values in both tables.
//        Summary of What You've Accomplished
//Created Database Tables: You set up the users and orders tables.
//Inserted Data: You successfully added users and their corresponding orders.
//Performed INNER JOIN: You executed an INNER JOIN query in your Java application to retrieve user names along with their order dates.
//Next Steps
//If you're looking to expand your project or enhance your skills further, here are a few suggestions:
//
//Add More Data: Experiment with adding more users and orders to see how your queries handle larger datasets.
//Explore Other Queries: Try different types of SQL queries, such as LEFT JOIN, RIGHT JOIN, and aggregate functions like COUNT, SUM, etc.
//Error Handling: Implement better error handling in your Java code to manage potential database issues gracefully.
//User Interface: Consider creating a simple user interface (UI) for your application using a framework like JavaFX or Swing.
//Documentation: Document your code and the database structure for future reference or for anyone else who might use your project.
//        st.subquery();

//        st.storedprocedure();
//   A Stored Procedure is a set of SQL statements that can be stored in the database and executed.
//   Java can call these procedures using CallableStatement.

//        st.triggers ();
//      A Trigger is an SQL procedure that gets invoked automatically in response to certain events on a table (INSERT, UPDATE, DELETE).
       // MySQL Trigger:
        //This trigger logs changes when a user is inserted into the users table

      /*  CREATE TRIGGER before_user_insert
        BEFORE INSERT ON users
        FOR EACH ROW
                BEGIN
        INSERT INTO user_logs(user_id, action, action_time)
        VALUES (NEW.id, 'INSERT', NOW());
        END;
       */


//        # indexing and performance optimization
//        Indexes improve the performance of queries by allowing the database to quickly locate rows.
//    Select the database:   USE my_database;
//   Create the index on the name column of the users table:     CREATE INDEX idx_user_name ON users(name);
//        st.explain ();

//        # backup and restore
//    You can backup MySQL databases using the mysqldump utility, and restore them from the command line.
//    -> Backup Example: mysqldump -u root -p yourDatabase > backup.sql
//     -> Restore Example: mysql -u root -p yourDatabase < backup.sql

//        # Connection Pooling (HikariCP)
//   Connection pooling helps manage a pool of database connections, reducing the overhead of opening and closing connections frequently.
        //HirakiCP
       // config.ConnectionPooling();





       /* try {
            // Manually load the driver (optional for modern JDBC, but may help)
            Class.forName("com.mysql.cj.jdbc.Driver");
//        driver load
            String url = "jdbc:mysql://localhost:3306/students";
            String username = "root";
            String password = "mbhatia@8232";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }


//        driver load
//        conn establish
//        statement create
//        execute query
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String userName = "root";
            String password = "mbhatia@8232";

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "create database codingwallah";
              stm.execute(query);
            System.out.println("Database Created  successfully");
            conn.close();
        } catch (Exception e ){
            e.printStackTrace();
        }

        */

    }

}




