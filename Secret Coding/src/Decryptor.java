import java.util.ArrayList;

public class Decryptor
	{
		public static void decryptor (String secret, ArrayList <Integer> space)
		{
			secret = secret.replace("!", "a");
			secret = secret.replace("@", "b");
			secret = secret.replace("#", "c");
			secret = secret.replace("$", "d");
			secret = secret.replace("%", "e");
			secret = secret.replace("^", "f");
			secret = secret.replace("&", "g");
			secret = secret.replace("*", "h");
			secret = secret.replace(",", "i");
			secret = secret.replace("(", "j");
			secret = secret.replace(")", "k");
			secret = secret.replace("{", "l");
			secret = secret.replace("}", "m");
			secret = secret.replace("|", "n");
			secret = secret.replace(":", "o");
			secret = secret.replace("'", "p");
			secret = secret.replace("\"", "q");
			secret = secret.replace("<", "r");
			secret = secret.replace(">", "s");
			secret = secret.replace("?", "t");
			secret = secret.replace("+", "u");
			secret = secret.replace("_", "v");
			secret = secret.replace("=", "w");
			secret = secret.replace("`", "x");
			secret = secret.replace("~", "y");
			secret = secret.replace("/", "z");
			for (int i = 0; i < space.size(); i++)
				{
					secret = secret.substring(0, space.get(i))+" "+secret.substring(space.get(i));
				}
			System.out.println("decoding...");
			System.out.println(secret);
		}
	}
