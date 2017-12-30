package com.oandv.service;

import com.oandv.model.Session;

import java.util.List;

public interface SessionService {

    void saveEmployee(Session session);

    List<Session> findAllSessions();

    List<Session> findAllSessionsForUser(String user);

    void deleteSessionById(int id);

    Session findById(int id);

    void updateSession(Session session);

}
