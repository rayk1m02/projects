package game;

public interface Command {
	
	public void execute(String[] words);
	
	public String getName();
	
}
