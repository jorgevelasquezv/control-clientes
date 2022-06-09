package mx.com.gm.service;


import mx.com.gm.domain.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> listPerson();

    public void save(Persona persona);

    public void delete(Persona persona);

    public Persona getPersona(Persona persona);

}
