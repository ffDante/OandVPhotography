package com.oandv.dao;

import com.oandv.model.Session;

import java.util.List;

public interface SessionDAO {

    void saveSession (Session session);

    List<Session> findAllSessions();

    List<Session> findAllSessionsForUser(String user);

    void deleteSessionById(int id);

    Session findById(int id);

    void updateSession(Session session);

}
