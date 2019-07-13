package com.scnu.teach.service;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.scnu.ppt.bean.Constant;


@Service
public class UploadFileService {
	
	 // 获取全称的上传目录 
		public static String getUploadPath(String path){
			return path;
		}
		
	// 获取上传文件夹的根目录(不是项目根目录)
		public static String getUploadRootPath(){
			return getUploadPath("");
		};
		
	// 创建文件目录，递归创建
		public static File mkDir(String path){
			File dir = new File(path);
			if(!dir.exists())
				dir.mkdirs();
			return dir;
		}
		
	// 生成下载根目录
		public static File mkUploadRootDir(){
			return mkDir(getUploadRootPath());
		}
		
	// 获取的后缀包含 .  ex:  .mov ;  .mp4
		public static String getOriginalFileSuffix(String originalFileName){
			int index=originalFileName.lastIndexOf(".");
			if(index!=-1){
				return originalFileName.substring(index);
			}else
				return originalFileName;
		}

        // 获取不带后缀名的名称
		public static String orginalFileNameReal(String originalFileName){
			int end=originalFileName.lastIndexOf(".");
			int start = originalFileName.lastIndexOf("/");
			return originalFileName.substring(start + 1, end);
		}
		
		// path 包含 / 路径的
		public static File createServerFile(String path,String fileName){
			
			// Creating the directory to store file
			File dir = mkDir(getUploadPath(path));
			
			// 创建具体的文件
			File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
			
			return serverFile;
		}
		

		 // 返回从upload目录下面的相对路径 */ // (包含upload)
		public static String getRelativePathFromUploadDir(File file){
			if(null==file)
				return "";
			String absolutePath = file.getAbsolutePath();
			if(absolutePath.indexOf(Constant.ROOT_PATH)!=-1 && Constant.ROOT_PATH.length() < absolutePath.length())
				return absolutePath.substring(absolutePath.indexOf(Constant.ROOT_PATH) + Constant.ROOT_PATH.length());
			else
				return "";
		}
		
		// 随机生成7随机码
		public static String generateRandom(){
			return UUID.randomUUID().toString().substring(0, 8);
		}
}
