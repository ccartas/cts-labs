package ro.ase.cts.interfaces;

import java.util.List;

public interface CRUDRepository<T> {
	public List<T> read(T obj);
}
