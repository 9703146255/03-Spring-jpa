package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Courses;
import in.thiru.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo repo;
	
	
	public void saveCourses()
	{
	Courses c=new Courses();
	c.setCourseName("java");
	c.setCourseCost(10000.00);
	repo.save(c);
	}

}
