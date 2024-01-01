package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Courses;

public interface CourseRepo extends JpaRepository<Courses, Integer>{

}
