package ro.ase.cts.utils.template;

public class Application {
	public static void main(String[] args) {
		Runner cRunner = new CRunner();
		Runner javaRunner = new JavaRunner();
		cRunner.run();
		javaRunner.run();
	}
}
