package chap25_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_JDBD_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JDBC를 이용해서 과목별 기말고사의 평균 성적 조회
		// (과목번호, 과목이름, 교수번호, 교수이름, 기말고사 성적의 평균점수)
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// Connection 객체 얻기
			conn = JDBCUtil.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", "c##study", "!dkdlxl1234"
			);
			
			// Statement 객체 얻기
			stmt = conn.createStatement();
			
			// 쿼리문 작성
			String selectCourseResult = "SELECT CR.CNO"
					+ "						  , CR.CNAME"
					+ "						  , PR.PNO"
					+ "						  , PR.PNAME"
					+ "						  , ROUND(AVG(SC.RESULT), 2)     AS AVG_RESULT"
					+ "					   FROM COURSE CR"
					+ "					   JOIN PROFESSOR PR"
					+ "						 ON CR.PNO = PR.PNO"
					+ "					   JOIN SCORE SC"
					+ "						 ON CR.CNO = SC.CNO"
					+ "					  GROUP BY CR.CNO, CR.CNAME, PR.PNO, PR.PNAME";
			// 쿼리문 실행
			// 실행 결과를 ResultSet 객체로 받음
			rs = stmt.executeQuery(selectCourseResult);
			
			// 쿼리 실행 결과 출력
			while(rs.next()) {
//				ResultSetMetaData rsm = rs.getMetaData();
				System.out.println("과목번호 : " + rs.getString("cno") +
								   ", 과목이름 : " + rs.getString("cname") +
								   ", 교수번호 : " + rs.getString("pno") + 
								   ", 교수이름 : " + rs.getString("pname") +
								   ", 기말고사 평균 점수 : " + rs.getDouble("avg_result"));
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(stmt, rs, conn);
		}
		
		
	}

}
