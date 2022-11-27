package com.personalprojects.tibetanmeditationpracticeapp.server.dao;

import com.personalprojects.tibetanmeditationpracticeapp.server.models.Practice;

import java.util.List;

public interface PracticeDao {
    //this method will return a list of practice objects
    List<Practice> listByLineage(int lineageId);

}
