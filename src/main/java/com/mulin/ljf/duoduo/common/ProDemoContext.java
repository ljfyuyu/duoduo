package com.mulin.ljf.duoduo.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.preference.PreferenceManager;

import com.mulin.ljf.duoduo.model.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProDemoContext {

	private static ProDemoContext self;
	private SharedPreferences mPreferences;

	public Context mContext;

	public User currentUser;
	public final String USERNAME = "USERNAME";//id
	public final String APPNAME = "DuoDuo";
	public String userNameString = "000";
	public String CityName = "";
	public String TempData = "";
	public boolean ExceptionRecord = false;
	private String tempcoor = "gcj02";
	public String baseUrlString = "http://duoduo.1366768.com/";
	public String dataString = "";
	public String ID = "5";
	public String ITEM_ID = "0";

	public static ProDemoContext getInstance() {

		if (self == null) {
			self = new ProDemoContext();
		}

		return self;
	}

	public static boolean isMobileNum(String mobiles) {
		Pattern p = Pattern.compile("^[1]+[1-9]+\\d{9}");
		Matcher m = p.matcher(mobiles);
		System.out.println(m.matches() + "---");
		return m.matches();

	}

	/**
	 *
	 * @param c
	 * @return
	 */
	public boolean isChinese(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
			return true;
		}
		return false;
	}

	/**
	 *
	 * @param str
	 * @return
	 */
	public String chinaToUnicode(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int chr1 = str.charAt(i);
			if (chr1 >= 19968 && chr1 <= 171941) {
				result += "\\u" + Integer.toHexString(chr1);
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}


/*	public String md5(String string) {

		byte[] hash;

		try {

			hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));

		} catch (NoSuchAlgorithmException e) {

			throw new RuntimeException("Huh, MD5 should be supported?", e);

		} catch (UnsupportedEncodingException e) {

			throw new RuntimeException("Huh, UTF-8 should be supported?", e);

		}

		StringBuilder hex = new StringBuilder(hash.length * 2);

		for (byte b : hash) {

			if ((b & 0xFF) < 0x10)
				hex.append("0");

			hex.append(Integer.toHexString(b & 0xFF));

		}

		return hex.toString();

	}*/

	public ProDemoContext() {
	}

	public String getItem_ID() {
		if (mPreferences == null)
			mPreferences = mContext.getSharedPreferences(APPNAME, Context.MODE_PRIVATE);
		return mPreferences.getString("ITEM_ID", null);
	}

	public void setItem_ID(String id) {
		if (mPreferences == null){
			if(mContext == null)
				System.out.println("aasaa");
			else
				mPreferences = mContext.getSharedPreferences(APPNAME, Context.MODE_PRIVATE);
		}

		SharedPreferences.Editor editor = mPreferences.edit();
		editor.putString("ITEM_ID", id);
		editor.commit();
	}

	public String getUsername() {
		if (mPreferences == null)
			mPreferences = mContext.getSharedPreferences(APPNAME, Context.MODE_PRIVATE);

		return mPreferences.getString(USERNAME, null);
	}

	public void setUsername(String username) {

		if (mPreferences == null)
			mPreferences = mContext.getSharedPreferences(APPNAME, Context.MODE_PRIVATE);

		SharedPreferences.Editor editor = mPreferences.edit();
		editor.putString(USERNAME, username);
		editor.commit();
	}
	public String getUserID() {
		if (mPreferences == null)
			mPreferences = mContext.getSharedPreferences(APPNAME, Context.MODE_PRIVATE);

		return mPreferences.getString("ID", null);
	}

	public void setUserID(String id) {

		if (mPreferences == null)
			mPreferences = mContext.getSharedPreferences(APPNAME, Context.MODE_PRIVATE);

		SharedPreferences.Editor editor = mPreferences.edit();
		editor.putString("ID", id);
		editor.commit();
	}
	public void init(Context context) {

		mContext = context;
		mPreferences = PreferenceManager.getDefaultSharedPreferences(context);

	}



	public ProDemoContext(Context context) {
		self = this;
	}

	/**
	 *
	 * @param context
	 *            Context
	 */
	public static boolean isNetworkAvailable(Context context) {
		ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity != null) {
			NetworkInfo info = connectivity.getActiveNetworkInfo();
			if (info != null && info.isConnected()) {
				if (info.getState() == NetworkInfo.State.CONNECTED) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 */
	
	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public SharedPreferences getSharedPreferences() {
		return mPreferences;
	}

	public void setSharedPreferences(SharedPreferences sharedPreferences) {
		this.mPreferences = sharedPreferences;
	}



	public String convert(String time) {
		long mill = Long.parseLong(time) * 1000;
		Date date = new Date(mill);
		String strs = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			strs = sdf.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strs;
	}


	  public String getDataStringFromJsonData(String result) {
	        JSONObject jsonObject = null;
	        try {
	            jsonObject = new JSONObject(result);
	            return jsonObject.getString("data").toString();
	        } catch (JSONException e) {
	            return "";
	        }
	    }
	    public String getMessageStringFromJsonData(String result) {
	        JSONObject jsonObject = null;
	        try {
	            jsonObject = new JSONObject(result);
	            return jsonObject.getString("info").toString();
	        } catch (JSONException e) {
	            return "";
	        }
	    }

	    public boolean getStatusStringFromJsonData(String result) {
	        JSONObject jsonObject = null;
	        try {
	            jsonObject = new JSONObject(result);
	            int status = jsonObject.getInt("status");
	            if (status == 1) {
	                return true;
	            } else {
	                return false;
	            }
	        } catch (JSONException e) {
	            return false;
	        }


	    }



	public static Bitmap decodeSampledBitmapFromResource(String res, int resId, int reqWidth, int reqHeight) {
		final BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(res, options);
		int init = calculateInSampleSize(options, reqWidth, reqHeight);
		options.inSampleSize = init < 2 ? 2 : init;
		options.inJustDecodeBounds = false;
		return BitmapFactory.decodeFile(res, options);
	}

	public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
		final int height = options.outHeight;
		final int width = options.outWidth;
		int inSampleSize = 1;
		if (height > reqHeight || width > reqWidth) {
			final int heightRatio = Math.round((float) height / (float) reqHeight);
			final int widthRatio = Math.round((float) width / (float) reqWidth);
			inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
		}
		return inSampleSize;
	}
	
}
