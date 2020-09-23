package com.match.composite;

public class Client
{
	public static void main(String[] args)
	{
		AbstractFile f1,f2,f3,f4;
		Folder fa = new Folder("我的收藏");
		Folder fb = new Folder("电影");
		f1 = new ImageFile("头像.jpg");
		f2 = new TextFile("Hello.txt");
		f3 = new VideoFile("笑傲江湖.avi");
		f4 = new VideoFile("神雕侠侣.avi");
		fa.add(f1);
		fa.add(f2);
		fb.add(f3);
		fb.add(f4);
		fa.add(fb);	
		fa.killVirus();	
	}
}
