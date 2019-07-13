package com.scnu.teach.service;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.scnu.ppt.bean.Constant;


@Service
public class UploadFileService {
	
	 // ��ȡȫ�Ƶ��ϴ�Ŀ¼ 
		public static String getUploadPath(String path){
			return path;
		}
		
	// ��ȡ�ϴ��ļ��еĸ�Ŀ¼(������Ŀ��Ŀ¼)
		public static String getUploadRootPath(){
			return getUploadPath("");
		};
		
	// �����ļ�Ŀ¼���ݹ鴴��
		public static File mkDir(String path){
			File dir = new File(path);
			if(!dir.exists())
				dir.mkdirs();
			return dir;
		}
		
	// �������ظ�Ŀ¼
		public static File mkUploadRootDir(){
			return mkDir(getUploadRootPath());
		}
		
	// ��ȡ�ĺ�׺���� .  ex:  .mov ;  .mp4
		public static String getOriginalFileSuffix(String originalFileName){
			int index=originalFileName.lastIndexOf(".");
			if(index!=-1){
				return originalFileName.substring(index);
			}else
				return originalFileName;
		}

        // ��ȡ������׺��������
		public static String orginalFileNameReal(String originalFileName){
			int end=originalFileName.lastIndexOf(".");
			int start = originalFileName.lastIndexOf("/");
			return originalFileName.substring(start + 1, end);
		}
		
		// path ���� / ·����
		public static File createServerFile(String path,String fileName){
			
			// Creating the directory to store file
			File dir = mkDir(getUploadPath(path));
			
			// ����������ļ�
			File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
			
			return serverFile;
		}
		

		 // ���ش�uploadĿ¼��������·�� */ // (����upload)
		public static String getRelativePathFromUploadDir(File file){
			if(null==file)
				return "";
			String absolutePath = file.getAbsolutePath();
			if(absolutePath.indexOf(Constant.ROOT_PATH)!=-1 && Constant.ROOT_PATH.length() < absolutePath.length())
				return absolutePath.substring(absolutePath.indexOf(Constant.ROOT_PATH) + Constant.ROOT_PATH.length());
			else
				return "";
		}
		
		// �������7�����
		public static String generateRandom(){
			return UUID.randomUUID().toString().substring(0, 8);
		}
}
