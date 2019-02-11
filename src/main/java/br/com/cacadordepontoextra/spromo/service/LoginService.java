package br.com.cacadordepontoextra.spromo.service;

import br.com.cacadordepontoextra.spromo.hibernate.HibernateDAO;
import br.com.cacadordepontoextra.spromo.model.Login;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loginService")
public class LoginService {

    @Autowired
    private HibernateDAO dao;

    @Transactional
    public boolean login(String login, String senha) {
        Criteria criteria = dao.createCriteria(Login.class)
                .add(Restrictions.eq("login", login))
                .add(Restrictions.eq("senha", senha));
        return criteria.uniqueResult() != null;
    }
}
