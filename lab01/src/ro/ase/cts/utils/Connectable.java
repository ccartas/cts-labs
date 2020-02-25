package ro.ase.cts.utils;

import ro.ase.cts.models.Device;

public interface Connectable {
	boolean pair(Device d);
	boolean unpair(Device d);
}
