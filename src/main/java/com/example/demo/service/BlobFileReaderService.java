package com.example.demo.service;

import org.hibernate.LobHelper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

@Service
public class BlobFileReaderService {

    private HibernateTemplate hibernateTemplate;

    public void saveFileContent() {
        LobHelper lobHelper =
                hibernateTemplate.getSessionFactory().getCurrentSession().getLobHelper();
        
    }
}
