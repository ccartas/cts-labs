package ro.ase.cts.utils.template;

// Template
public abstract class Runner {
	public abstract void preprocess();
	public abstract void compile();
	public abstract void link();
	public abstract void load();
	
	
	//template method
	public final void run() {
		preprocess();
		compile();
		link();
		load();
	}
}
