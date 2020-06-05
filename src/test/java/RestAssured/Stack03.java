package RestAssured;

import io.restassured.path.json.JsonPath;

public class Stack03 {

	public static void main(String[] args) {
		String Res="[{\"id\":\"5ea6fe53e4b09a8de7aeb19d\",\"contents\":[{\"pageSize\":6,\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1538998610009\"}],\"name\":\"FEATURE BANNER\",\"format\":{\"lsTy\":\"DEFAULT\",\"showAll\":false,\"autoCarousel\":false,\"ty\":\"BANNER\",\"action\":{\"source\":\"BE\",\"contentId\":\"ATV_PACKAGE_1538998610009\",\"t\":\"Play\",\"st\":\"PLAY\"},\"contentAction\":{\"meta\":{}}}},{\"id\":\"5ac37644e4b03f23a4a705dc\",\"contents\":[],\"name\":\"MastheadAd\",\"format\":{\"lsTy\":\"DEFAULT\",\"ty\":\"NATIVE_MASTHEAD_AD\",\"action\":{\"source\":\"BE\",\"st\":\"CUSTOM\",\"sTy\":\"CUSTOM_AMAZON\"},\"contentAction\":{\"sTy\":\"CUSTOM_AMAZON\",\"meta\":{}},\"lds\":[],\"adId\":\"/417241724/tv_native_masthead_plain_prod\",\"tId\":[\"11767767\",\"11768950\"]}},{\"id\":\"5d63ca1de4b088013a6236b3\",\"contents\":[{\"pageSize\":50,\"source\":\"RM\",\"packageId\":\"dummy\"}],\"name\":\"Recommended Movies\",\"format\":{\"lsTy\":\"DEFAULT\",\"showAll\":false,\"ty\":\"MOVIE_NOLOGO\",\"contentAction\":{\"meta\":{\"sourceName\":\"cf_movies_home\"}}}},{\"id\":\"5d63ca1de4b088013a6236b2\",\"contents\":[{\"pageSize\":50,\"source\":\"RM\",\"packageId\":\"dummy\"}],\"name\":\"Recommended TV Shows\",\"format\":{\"lsTy\":\"DEFAULT\",\"showAll\":false,\"ty\":\"MOVIE_NOLOGO\",\"contentAction\":{\"meta\":{\"sourceName\":\"cf_tvshow_home\"}}}},{\"id\":\"5ae6b962e4b088c1fe893389\",\"contents\":[{\"pageSize\":20,\"source\":\"MW\",\"packageId\":\"ATV_PACKAGE_1524207345077\",\"ty\":\"LIVE\"}],\"name\":\"LIVE NEWS\",\"format\":{\"lsTy\":\"DEFAULT\",\"showAll\":false,\"bgImgUrl\":\"\",\"ty\":\"TVSHOW_LOGO_43\",\"action\":{\"color\":\"#ff0000\",\"pageId\":\"live_TV\",\"t\":\"More\",\"st\":\"LANDING\"},\"contentAction\":{\"meta\":{}},\"t\":\"LIVE NEWS\"}},{\"id\":\"5e74bffce4b0e60befa24bbb\",\"contents\":[{\"pageSize\":10,\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1568185919253\"}],\"name\":\"Your Daily News in 30 Secs HIndi\",\"format\":{\"lsTy\":\"DEFAULT\",\"showAll\":false,\"bgImgUrl\":\"https://image.airtel.tv/pages/rails/5d2d6945e4b06e55de6b8cfe/editorji_highlightrail_background.jpg\",\"ty\":\"TVSHOW_BIG_43\",\"action\":{\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1568185919253\",\"listingType\":\"TVSHOW_BIG_43\",\"t\":\"More\",\"st\":\"LISTING\"},\"contentAction\":{\"meta\":{}},\"t\":\"Your Daily News in 30 Secs\"}},{\"id\":\"5d9ec624e4b0499e024c99c6\",\"contents\":[{\"pageSize\":10,\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1570605272423\"}],\"name\":\"Learn with Xstream\",\"format\":{\"lsTy\":\"EXPLORE\",\"ty\":\"CUSTOM\",\"action\":{\"st\":\"DEFAULT\"},\"contentAction\":{\"source\":\"BE\",\"pageId\":\"ATV_PACKAGE_1570605272423\",\"st\":\"CUSTOM\",\"sTy\":\"LISTING\",\"meta\":{}},\"lds\":[],\"t\":\"Learn with Xstream\"}},{\"id\":\"5c78ce19e4b0d4a057339b17\",\"contents\":[{\"pageSize\":25,\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1540027201907\"}],\"name\":\"MOST WATCHED HOLLYWOOD MOVIES\",\"format\":{\"lsTy\":\"DEFAULT\",\"showAll\":false,\"ty\":\"MOVIE_NOLOGO\",\"action\":{\"color\":\"#a1ec00\",\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1540027201907\",\"listingType\":\"MOVIE_NOLOGO\",\"t\":\"More\",\"st\":\"LISTING\"},\"contentAction\":{\"meta\":{}},\"t\":\"Most Watched Hollywood Movies\"}},{\"id\":\"5e789319e4b032c54a8f0646\",\"contents\":[],\"name\":\"Family Movie Card - English + Hindi\",\"format\":{\"lsTy\":\"DEFAULT\",\"ty\":\"CARD_NOTITILE_169\",\"action\":{\"source\":\"MW\",\"channelId\":\"MWTV_LIVETVCHANNEL_10000000060880000\",\"t\":\"Play\",\"st\":\"PLAY\",\"meta\":{\"k\":\"1\"},\"ty\":\"LIVE\"},\"contentAction\":{\"meta\":{}},\"lds\":[],\"img\":\"https://image.airtel.tv/pages/rails/5e9083e8e4b0cff1aeeb2d58/Swami_Ramdev_New.jpg\"}},{\"id\":\"5d64b170e4b067b667714913\",\"contents\":[{\"pageSize\":12,\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1566817268865\"}],\"name\":\"BEST HOLLYWOOD Series\",\"format\":{\"lsTy\":\"DEFAULT\",\"showAll\":false,\"ty\":\"MOVIE_NOLOGO\",\"action\":{\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1566817268865\",\"listingType\":\"MOVIE_NOLOGO\",\"t\":\"More\",\"st\":\"LISTING\"},\"contentAction\":{\"meta\":{}},\"t\":\"Best Hollywood Movie Series\"}},{\"id\":\"5e7892e6e4b032c54a8f0645\",\"contents\":[],\"name\":\"Nostalgia Movie Card - English + Hindi\",\"format\":{\"lsTy\":\"DEFAULT\",\"ty\":\"CARD_NOTITILE_169\",\"hIcon\":\"https://image.airtel.tv/pages/rails/5e7892e6e4b032c54a8f0645/ic_cplogo_hooq.png\",\"action\":{\"source\":\"BE\",\"packageId\":\"ATV_PACKAGE_1584939335512\",\"listingType\":\"MOVIE_NOLOGO\",\"t\":\"More\",\"st\":\"LISTING\",\"meta\":{\"A\":\"1\"}},\"contentAction\":{\"meta\":{}},\"lds\":[],\"img\":\"https://image.airtel.tv/pages/rails/5e7892e6e4b032c54a8f0645/NOSTALGIA-MOVIES-1032X576_(1).jpg\"}},{\"id\":\"5e99b557e4b0c3a92edf1ee7\",\"contents\":[],\"name\":\"Wynk Music - Vishal Mishra - Live Concert Card Testing\",\"format\":{\"lsTy\":\"DEFAULT\",\"ty\":\"CARD_NOTITILE_169\",\"action\":{\"source\":\"BE\",\"contentId\":\"MWTV_LIVETVCHANNEL_10000000060880000\",\"t\":\"Play\",\"st\":\"PLAY\",\"meta\":{\"k\":\"1\"}},\"contentAction\":{\"meta\":{}},\"lds\":[],\"img\":\"https://image.airtel.tv/pages/rails/5e99b010e4b03c81436668d3/1-Lohri-1032X576.jpg\"}},{\"id\":\"5ea70c25e4b0cea120315672\",\"contents\":[],\"name\":\"Astha Gill Type Form Card Test\",\"format\":{\"lsTy\":\"DEFAULT\",\"ty\":\"PRODUCT_CARD\",\"action\":{\"url\":\"https://wynkproduct.typeform.com/to/DesNW4\",\"t\":\"Play\",\"st\":\"WEBVIEW\",\"meta\":{\"redirectType\":\"REDIRECT_TV\",\"redirectDeeplink\":\"https://wynkproduct.typeform.com/to/DesNW4\"}},\"contentAction\":{\"meta\":{}},\"lds\":[],\"img\":\"https://image.airtel.tv/pages/rails/5ea70c25e4b0cea120315672/2-Badla-1032X576_(1).jpg\"}},{\"id\":\"5ea711a0e4b0cea120315674\",\"contents\":[],\"name\":\"Aastha Gill - Card - Test\",\"format\":{\"lsTy\":\"DEFAULT\",\"ty\":\"CARD_NOTITILE_169\",\"action\":{\"source\":\"MW\",\"channelId\":\"MWTV_LIVETVCHANNEL_10000000060880000\",\"t\":\"Play\",\"st\":\"PLAY\",\"ty\":\"LIVE\"},\"contentAction\":{\"meta\":{}},\"lds\":[],\"img\":\"https://image.airtel.tv/pages/rails/5ea711a0e4b0cea120315674/2-Badla-1032X576_(1).jpg\"}},{\"id\":\"5ea70fcfe4b0cea120315673\",\"contents\":[],\"name\":\"test_card_ndtv\",\"format\":{\"lsTy\":\"DEFAULT\",\"ty\":\"CARD_NOTITILE_169\",\"action\":{\"source\":\"MW\",\"channelId\":\"MWTV_LIVETVCHANNEL_10000000060880000\",\"t\":\"NDTV\",\"st\":\"PLAY\",\"ty\":\"LIVE\"},\"contentAction\":{\"meta\":{}},\"lt\":\"\",\"ds\":\"\",\"lds\":[],\"img\":\"https://image.airtel.tv/pages/rails/5ea70fcfe4b0cea120315673/photo-1549465220-1a8b9238cd48.jpeg\"}}]\r\n" + 
				"";
		
		String k ="{\r\n" + 
				"  \"root\" : {\r\n" + 
				"    \"child1\": {\r\n" + 
				"      \"child2\": {\r\n" + 
				"        \"child3\":{\r\n" + 
				"          \"leaf\":\"value\"\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		
		JsonPath js = new JsonPath(k);
		/*
		 * String idToValidate = "5ea6fe53e4b09a8de7aeb19d"; System.out.println("id : "
		 * + Res.contains(idToValidate));
		 * 
		 * String packageId =
		 * js.get("find {it.id =='5ea6fe53e4b09a8de7aeb19d'}.contents.source").toString(
		 * ); System.out.println("PackageID : " + packageId);
		 */
	    
	String v =js.get("root...child3");
	System.out.println(v);

	}

}
