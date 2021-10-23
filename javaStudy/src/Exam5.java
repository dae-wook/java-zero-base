

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exam5 {

	public static void main(String[] args) {
		//김대욱
		
		try {
			File file = new File("index.html");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write("<head>\n");
			writer.write("<meta charset = \"UTF-8\">\n" );
			writer.write("<style>\n");
			writer.write("table { border-collapse : collapse; witdth : 100%;}\n");
			writer.write("th, td { border:solid 1px #000;}\n");
			writer.write("</style>\n");
			writer.write("</head>\n");
			writer.write("<body>\n");
			writer.write("<h1>자바 환경정보</h1>\n");
			writer.write("<table>\n");
			writer.write("<th>key</th>\n");
			writer.write("<th>value</th>\n");
			for(Object k : System.getProperties().keySet()) {
				String key = k.toString();
				String value = System.getProperty(key);
				writer.write("<tr>");
				writer.write("<td>"+ key + "</td>");
				writer.write("<td>"+ value + "</td>");
				writer.write("</tr>");
			}
			
			writer.write("</table>\n");
			writer.write("</body>");
			
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
