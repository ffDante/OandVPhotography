package com.oandv.service;

import com.oandv.dao.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SessionService")
@Transactional
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionDAO sessionDAO;

    @Override
    public void saveEmployee(Session session) {
        sessionDAO.saveSession(session);
    }

    @Override
    public List<Session> findAllEmployees() {
        return sessionDAO.findAllSessions();
    }

    @Override
    public void deleteEmployeeById(int id) {
        sessionDAO.deleteSessionById(id);
    }

    @Override
    public Session findById(int id) {
        return sessionDAO.findById(id);
    }

    @Override
    public void updateEmployee(Session session) {
        sessionDAO.updateSession(session);
    }

}