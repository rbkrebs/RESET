package br.com.cwi.tinderevolution.collection;

import java.util.List;

public interface GeneralCollection {

    public Object save(Object object);
    public List<Object> listAll();
    public Object findById(int id);
    public boolean delete(int id);
    public Object update(Object obj1, Object obj2);
}
