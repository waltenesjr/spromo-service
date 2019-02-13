package br.com.cacadordepontoextra.spromo.service;

import br.com.cacadordepontoextra.spromo.bean.ValueBean;
import br.com.cacadordepontoextra.spromo.hibernate.HibernateDAO;
import br.com.cacadordepontoextra.spromo.model.Estabelecimento;
import br.com.cacadordepontoextra.spromo.model.Login;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("estabelecimentoService")
public class EstabelecimentoService {

    @Autowired
    private HibernateDAO dao;

    @Transactional
    public List<ValueBean> all() {
        Criteria criteria = dao.createCriteria(Estabelecimento.class)
                .setProjection(Projections.projectionList()
                        .add(Projections.property("id"), "key")
                        .add(Projections.property("nome"), "value"))
                .setResultTransformer(Transformers.aliasToBean(ValueBean.class));
        return criteria.list();
    }
}
