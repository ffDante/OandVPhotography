package com.oandv.dao;

import com.oandv.model.Session;

import java.util.List;

public interface SessionDAO {

    void saveSession (Session session);

    List<Session> findAllSessions();

    void deleteSessionById(int id);

    Session findById(int id);

    void updateSession(Session session);

}
