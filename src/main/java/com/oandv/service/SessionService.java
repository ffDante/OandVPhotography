package com.oandv.service;

import java.util.List;

public interface SessionService {

    void saveEmployee(Session session);

    List<Session> findAllEmployees();

    void deleteEmployeeById(int id);

    Session findById(int id);

    void updateEmployee(Session session);

}
