
import java.io.File;

public class Pwd {
	public static void main(String[] args) {
		File f = new File("./");
		System.out.println(f.getAbsolutePath());
	}
}
