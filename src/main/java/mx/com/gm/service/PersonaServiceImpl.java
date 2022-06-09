package mx.com.gm.service;


import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listPerson() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void save(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void delete(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona getPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
}
