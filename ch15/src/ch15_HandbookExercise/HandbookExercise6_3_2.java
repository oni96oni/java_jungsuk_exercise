package ch15_HandbookExercise;

import java.io.File;
import java.util.ArrayList;

public class HandbookExercise6_3_2 {

	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath()+"디렉토리");
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList();
		
		for(int i=0; i<files.length; i++) {
			String filename = files[i].getName();
			
			if(files[i].isDirectory()) {
				filename = "[" + filename + "]";
				subDir.add(i+"");
			}
			System.out.println(filename);
		}
		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;
		
		totalFiles += fileNum;
		totalDirs += dirNum;
		
		System.out.println(fileNum + "개의 파일, "+ dirNum + "개의 디렉토리");
		System.out.println();
		
		for(int i=0; i<subDir.size(); i++) {
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]);
		}
	}
	
}