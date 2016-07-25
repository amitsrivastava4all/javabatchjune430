import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;


class FileExtensionFilter implements FilenameFilter{
	public boolean accept(File path, String fileName){
		return fileName.endsWith(".txt");
	}
}

public class ScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/amit/Documents/FileHandlingTesting");
//		String file_folder_array []= file.list();
//		for(String f : file_folder_array){
//			System.out.println(f);
//		}
		FileExtensionFilter filter = new FileExtensionFilter();
		File files [] = file.listFiles(filter);
		for(File f : files){
			if(f.isDirectory()){
				System.out.println("<DIR>"+f.getName());
			}
			else
			if(f.isFile()){
				if(f.isHidden()){
					
				}
				if(!f.canWrite()){
					System.out.println("Read Only File "+f.getName());
				}
				long timeInMs= f.lastModified();
				Date date = new Date(timeInMs);  // Convert Ms Time into Date
				//f.delete();
				System.out.println("<FILE> "+f.getName()+" Last Modified "+date);
			}
		}
	}

}
