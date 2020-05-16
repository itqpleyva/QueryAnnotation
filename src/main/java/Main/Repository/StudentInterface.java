package Main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Main.Model.Student;

public interface StudentInterface extends JpaRepository<Student, Integer> {

	  @Query("select u from Student u where u.name = :name")
	  Student findJonDoe(@Param("name") String name);
	
}
