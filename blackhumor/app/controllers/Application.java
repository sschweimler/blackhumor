package controllers;

import models.Galery;
import models.GaleryPicture;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import static play.data.Form.form;


public class Application extends Controller {

    public static Result index() {
        return ok(index.render(form(GaleryAdder.class)));
    }
    
    public static Result addGalery(){
    	
    	Form<GaleryAdder> galeryForm = form(GaleryAdder.class).bindFromRequest();
    	Galery galery = new Galery(galeryForm.get().galname,galeryForm.get().galdescr);
    	galery.save();
    	
    	if(!galeryForm.get().pic1.isEmpty()){
    		GaleryPicture galeryPicture1 = new GaleryPicture(galery,galeryForm.get().pic1,galeryForm.get().descr1);
    		galeryPicture1.save();
    	}
    	
    	if(!galeryForm.get().pic2.isEmpty()){
    		GaleryPicture galeryPicture2 = new GaleryPicture(galery,galeryForm.get().pic2,galeryForm.get().descr2);
    		galeryPicture2.save();
    	}
    	if(!galeryForm.get().pic3.isEmpty()){
    		GaleryPicture galeryPicture3 = new GaleryPicture(galery,galeryForm.get().pic3,galeryForm.get().descr3);
    		galeryPicture3.save();
    	}
    	if(!galeryForm.get().pic4.isEmpty()){
    		GaleryPicture galeryPicture4 = new GaleryPicture(galery,galeryForm.get().pic4,galeryForm.get().descr4);
    		galeryPicture4.save();
    	}
    	if(!galeryForm.get().pic5.isEmpty()){
    		GaleryPicture galeryPicture5 = new GaleryPicture(galery,galeryForm.get().pic5,galeryForm.get().descr5);
    		galeryPicture5.save();
    	}
    	if(!galeryForm.get().pic6.isEmpty()){
    		GaleryPicture galeryPicture6 = new GaleryPicture(galery,galeryForm.get().pic6,galeryForm.get().descr6);
    		galeryPicture6.save();
    	}
    	if(!galeryForm.get().pic7.isEmpty()){
    		GaleryPicture galeryPicture7 = new GaleryPicture(galery,galeryForm.get().pic7,galeryForm.get().descr7);
    		galeryPicture7.save();
    	}
    	if(!galeryForm.get().pic8.isEmpty()){
    		GaleryPicture galeryPicture8 = new GaleryPicture(galery,galeryForm.get().pic8,galeryForm.get().descr8);
    		galeryPicture8.save();
    	}
    	if(!galeryForm.get().pic9.isEmpty()){
    		GaleryPicture galeryPicture9 = new GaleryPicture(galery,galeryForm.get().pic9,galeryForm.get().descr9);
    		galeryPicture9.save();
    	}
    	if(!galeryForm.get().pic10.isEmpty()){
    		GaleryPicture galeryPicture10 = new GaleryPicture(galery,galeryForm.get().pic10,galeryForm.get().descr10);
    		galeryPicture10.save();
    	}
    	
    	return redirect(routes.Application.index());
    }
    
    
    
   public static class GaleryAdder{
	
	  public String galname,galdescr;
	  
	  public String pic1 ,pic2, pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10;
	  public String descr1,descr2,descr3,descr4,descr5,descr6,descr7,descr8,descr9,descr10;
	  	  
	  
  }

}
