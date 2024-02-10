package dao.generics;

import domain.Persistente;

public interface IGenericDAO<T extends Persistente> {
    T cadastrar(T entity);
}
