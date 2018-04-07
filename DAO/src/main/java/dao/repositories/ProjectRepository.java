package dao.repositories;

import com.models.entity.Account;
import com.models.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
    Project getProjectById(Integer projectId);
    List<Project> getProjectsByTitle(String title);
    List<Project> getProjectsByOwner(Account owner);
    List<Project> getProjectsByCreationDateBetween(Date from, Date to);
}