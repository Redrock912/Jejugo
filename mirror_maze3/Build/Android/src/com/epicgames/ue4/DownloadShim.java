package com.epicgames.ue4;

import com.YourCompany.mirror_maze3.OBBDownloaderService;
import com.YourCompany.mirror_maze3.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

