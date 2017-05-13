package classes;

import java.util.ArrayList;

public class Generate {
	public static String generateMainBoard(String data, int count){
		String ret ="<div class='col-lg-4 col-sm-6 col-xs-12'>"
				+ "<div class='white-box analytics-info'>"
				+ "<h3 class='box-title'> <a href='HomePage?cat="+ data + "'>" + data + "</h3></a>"
				+ "<ul class='list-inline two-part'>"
				+ "<li class='text-right'><i class='ti-arrow-up text-success'></i> <span class='counter text-success'>" + count + "</span></li>"
				+ "</ul></div></div>";
		return ret;
	}
	public static String generateUpper(String data){
		String ret = "<div class='white-box'>"
				+ "<div class='col-md-3 col-sm-4 col-xs-6 pull-right'>"
				+ "<select class='form-control pull-right row b-none'";
		return ret;			
	}
	public static String generateCatList(String data , ArrayList<String> servList){
		String output = null;
			output = servList.get(3);
        return output;    
	}

	public static String generateService(String data){
		String ret = "<div class='col-md-12 col-lg-12 col-sm-12'>"
				+ "<div class='white-box'>"
				+ "<div class='col-md-3 col-sm-4 col-xs-6 pull-right'>"
				+ "<select class='form-control pull-right row b-none'>"
				+ "<option>Science</option>"
				+ "<option>Mathematics</option>"
				+ "<option>Economics</option>"
				+ "</select>"
				+ "</div>"
				+ "<h3 class='box-title'>Academics</h3>"
				+ "<div class='table-responsive'>"
				+ "<table class='table'>"
				+ "<div class='col-md-4 col-xs-12'>"
				+ "<div class='white-box'>"
				+ "<div class='user-bg'> "
				+ "<div class='overlay-box'>"
				+ "<div class='user-content'>"
				+ "<h5 class='text-white'>Danielle Saringan</h5>"
				+ "     <a href='javascript:void(0)'><img src='../plugins/images/users/genu.jpg' class='thumb-lg img-circle' alt='img'></a>"
				+ "<h6 class='text-white'>If your looking someone ...</h6>"
				+ "<a href='sp.html'><button type='click'>View tutor</button></a>"
				+ "</div></div></div></div></div></table></div></div></div>";
			return ret;
	}

}




