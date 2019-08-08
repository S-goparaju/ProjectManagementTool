package com.project1.ppmtool.services;

import com.project1.ppmtool.domain.Project;
import com.project1.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

            //logic
        return projectRepository.save(project);
    }



}
