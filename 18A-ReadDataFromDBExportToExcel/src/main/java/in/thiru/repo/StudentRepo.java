package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{

}
