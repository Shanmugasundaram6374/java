import java.sql.*;

public class Test
{
      public static void main(String[] args) throws Exception
      {
      Connection con;
      PreparedStatement ps;
      
      
      Class.forName("com.mysql.jbdc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3600/madurai","root","");
      ps=con.prepareStatement("insert into students values(101,'Varun',CSE(BE)',7.05)");
      ps.executeUpdate();
      ps.close();
      System.out.println("Student Record Inserted");
      }
}

                                               


