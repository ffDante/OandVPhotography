package com.oandv.dao;

import com.oandv.model.Session;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("SessionDAO")
public class SessionDAOImpl extends AbstractDAO implements SessionDAO {

    @Override
    public void saveSession(Session session) {
        persist(session);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Session> findAllSessions() {
        Criteria criteria = getSession().createCriteria(Session.class);
        return (List<Session>) criteria.list();
    }

    @Override
    public void deleteSessionById(int id) {
        Query query = getSession().createSQLQuery("delete from session where idSession = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    @Override
    public Session findById(int id) {
        Criteria criteria = getSession().createCriteria(Session.class);
        criteria.add(Restrictions.eq("idSession", id));
        return (Session) criteria.uniqueResult();
    }

    @Override
    public void updateSession(Session session) {
        getSession().update(session);
    }
}
